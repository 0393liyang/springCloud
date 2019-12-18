package com.mc.oauth.service;

import com.mc.common.model.PageResult;
import com.mc.oauth.model.TokenVo;

import java.util.Map;

/**
 * [ITokensService 说明/描述]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 16:41
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public interface ITokensService {
    /**
     * 查询token列表
     * @param params 请求参数
     * @param clientId 应用id
     */
    PageResult<TokenVo> listTokens(Map<String, Object> params, String clientId);
}
