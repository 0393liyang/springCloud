package com.mc.user.service.impl;

import com.mc.common.model.SysMenu;
import com.mc.common.service.impl.SuperServiceImpl;
import com.mc.user.mapper.SysRoleMenuMapper;
import com.mc.user.model.SysRoleMenu;
import com.mc.user.service.ISysRoleMenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

/**
 * [SysRoleMenuServiceImpl ]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 15:50
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Slf4j
@Service
public class SysRoleMenuServiceImpl extends SuperServiceImpl<SysRoleMenuMapper, SysRoleMenu> implements ISysRoleMenuService {
    @Resource
    private SysRoleMenuMapper sysRoleMenuMapper;

    @Override
    public int save(Long roleId, Long menuId) {
        return sysRoleMenuMapper.save(roleId, menuId);
    }

    @Override
    public int delete(Long roleId, Long menuId) {
        return sysRoleMenuMapper.delete(roleId, menuId);
    }

    @Override
    public List<SysMenu> findMenusByRoleIds(Set<Long> roleIds, Integer type) {
        return sysRoleMenuMapper.findMenusByRoleIds(roleIds, type);
    }

    @Override
    public List<SysMenu> findMenusByRoleCodes(Set<String> roleCodes, Integer type) {
        return sysRoleMenuMapper.findMenusByRoleCodes(roleCodes, type);
    }
}
