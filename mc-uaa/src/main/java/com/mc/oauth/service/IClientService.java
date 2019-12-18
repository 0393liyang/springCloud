package com.mc.oauth.service;

import com.mc.common.model.PageResult;
import com.mc.common.model.Result;
import com.mc.common.service.ISuperService;
import com.mc.oauth.model.Client;

import java.util.Map;

/**
 * [IClientService 说明/描述]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 16:40
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public interface IClientService extends ISuperService<Client> {
    Result saveClient(Client clientDto);

    /**
     * 查询应用列表
     * @param params
     * @param isPage 是否分页
     */
    PageResult<Client> listClent(Map<String, Object> params, boolean isPage);

    void delClient(long id);
}
