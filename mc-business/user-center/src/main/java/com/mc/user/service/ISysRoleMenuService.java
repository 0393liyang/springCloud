package com.mc.user.service;

import com.mc.common.model.SysMenu;
import com.mc.common.service.ISuperService;
import com.mc.user.model.SysRoleMenu;

import java.util.List;
import java.util.Set;

/**
 * [ISysRoleMenuService 说明/描述]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 15:50
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public interface ISysRoleMenuService extends ISuperService<SysRoleMenu> {
    int save(Long roleId, Long menuId);

    int delete(Long roleId, Long menuId);

    List<SysMenu> findMenusByRoleIds(Set<Long> roleIds, Integer type);

    List<SysMenu> findMenusByRoleCodes(Set<String> roleCodes, Integer type);
}
