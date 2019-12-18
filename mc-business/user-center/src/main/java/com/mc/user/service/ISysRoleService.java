package com.mc.user.service;

import com.mc.common.model.PageResult;
import com.mc.common.model.Result;
import com.mc.common.model.SysRole;
import com.mc.common.service.ISuperService;

import java.util.Map;

/**
 * [ISysRoleService ]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 15:51
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public interface ISysRoleService extends ISuperService<SysRole> {
    void saveRole(SysRole sysRole);

    void deleteRole(Long id);

    /**
     * 角色列表
     * @param params
     * @return
     */
    PageResult<SysRole> findRoles(Map<String, Object> params);

    /**
     * 新增或更新角色
     * @param sysRole
     * @return Result
     */
    Result saveOrUpdateRole(SysRole sysRole);
}
