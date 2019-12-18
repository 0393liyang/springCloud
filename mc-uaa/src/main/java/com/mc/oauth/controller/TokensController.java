package com.mc.oauth.controller;

import com.mc.common.model.PageResult;
import com.mc.oauth.model.TokenVo;
import com.mc.oauth.service.ITokensService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * [TokensController token管理接口]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 16:59
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Api(tags = "Token管理")
@RestController
@RequestMapping("/tokens")
public class TokensController {
    @Autowired
    private ITokensService tokensService;

    @GetMapping("")
    @ApiOperation(value = "token列表")
    public PageResult<TokenVo> list(@RequestParam Map<String, Object> params, String tenantId) {
        return tokensService.listTokens(params, tenantId);
    }
}
