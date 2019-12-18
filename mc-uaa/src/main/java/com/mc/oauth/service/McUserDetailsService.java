package com.mc.oauth.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * [McUserDetailsService ]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 16:42
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public interface McUserDetailsService extends UserDetailsService {
    /**
     * 根据电话号码查询用户
     *
     * @param mobile
     * @return
     */
    UserDetails loadUserByMobile(String mobile);
}
