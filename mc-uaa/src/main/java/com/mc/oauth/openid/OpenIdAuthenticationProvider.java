package com.mc.oauth.openid;

import com.mc.oauth2.common.token.OpenIdAuthenticationToken;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.social.security.SocialUserDetailsService;

/**
 * [OpenIdAuthenticationProvider ]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 16:49
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public class OpenIdAuthenticationProvider implements AuthenticationProvider {

    private SocialUserDetailsService userDetailsService;

    @Override
    public Authentication authenticate(Authentication authentication) {
        OpenIdAuthenticationToken authenticationToken = (OpenIdAuthenticationToken) authentication;
        String openId = (String) authenticationToken.getPrincipal();
        UserDetails user = userDetailsService.loadUserByUserId(openId);
        if (user == null) {
            throw new InternalAuthenticationServiceException("openId错误");
        }
        OpenIdAuthenticationToken authenticationResult = new OpenIdAuthenticationToken(user, user.getAuthorities());
        authenticationResult.setDetails(authenticationToken.getDetails());
        return authenticationResult;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return OpenIdAuthenticationToken.class.isAssignableFrom(authentication);
    }

    public SocialUserDetailsService getUserDetailsService() {
        return userDetailsService;
    }

    public void setUserDetailsService(SocialUserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }
}
