package com.mc.user.mapper;

import com.mc.common.model.SysMenu;
import com.mc.db.mapper.SuperMapper;
import com.mc.user.model.SysRoleMenu;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

/**
 * [SysRoleMenuMapper 说明/描述]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 15:38
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Mapper
public interface SysRoleMenuMapper extends SuperMapper<SysRoleMenu> {
    @Insert("insert into sys_role_menu(role_id, menu_id) values(#{roleId}, #{menuId})")
    int save(@Param("roleId") Long roleId, @Param("menuId") Long menuId);

    int delete(@Param("roleId") Long roleId, @Param("menuId") Long menuId);

    List<SysMenu> findMenusByRoleIds(@Param("roleIds") Set<Long> roleIds, @Param("type") Integer type);

    List<SysMenu> findMenusByRoleCodes(@Param("roleCodes") Set<String> roleCodes, @Param("type") Integer type);
}
