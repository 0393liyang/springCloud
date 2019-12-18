package com.mc.user.service;

import com.mc.common.model.SysRole;
import com.mc.common.service.ISuperService;
import com.mc.user.model.SysRoleUser;

import java.util.List;

/**
 * [ISysRoleUserService]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 15:56
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public interface ISysRoleUserService extends ISuperService<SysRoleUser> {
    int deleteUserRole(Long userId, Long roleId);

    int saveUserRoles(Long userId, Long roleId);

    /**
     * 根据用户id获取角色
     *
     * @param userId
     * @return
     */
    List<SysRole> findRolesByUserId(Long userId);

    /**
     * 根据用户ids 获取
     *
     * @param userIds
     * @return
     */
    List<SysRole> findRolesByUserIds(List<Long> userIds);

}
