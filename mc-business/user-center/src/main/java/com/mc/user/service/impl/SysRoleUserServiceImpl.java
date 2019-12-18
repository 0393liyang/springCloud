package com.mc.user.service.impl;

import com.mc.common.model.SysRole;
import com.mc.common.service.impl.SuperServiceImpl;
import com.mc.user.mapper.SysUserMapper;
import com.mc.user.mapper.SysUserRoleMapper;
import com.mc.user.model.SysRoleUser;
import com.mc.user.service.ISysRoleUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * [SysRoleUserServiceImpl 说明/描述]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 15:57
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Slf4j
@Service
public class SysRoleUserServiceImpl extends SuperServiceImpl<SysUserRoleMapper, SysRoleUser> implements ISysRoleUserService {
    @Resource
    private SysUserRoleMapper sysUserRoleMapper;

    @Override
    public int deleteUserRole(Long userId, Long roleId) {
        return sysUserRoleMapper.deleteUserRole(userId, roleId);
    }

    @Override
    public int saveUserRoles(Long userId, Long roleId) {
        return sysUserRoleMapper.saveUserRoles(userId, roleId);
    }

    @Override
    public List<SysRole> findRolesByUserId(Long userId) {
        return sysUserRoleMapper.findRolesByUserId(userId);
    }

    @Override
    public List<SysRole> findRolesByUserIds(List<Long> userIds) {
        return sysUserRoleMapper.findRolesByUserIds(userIds);
    }
}
