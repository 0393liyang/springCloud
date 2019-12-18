package com.mc.user.mapper;

import com.mc.common.model.SysRole;
import com.mc.db.mapper.SuperMapper;
import com.mc.user.model.SysRoleUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * [SysUserRoleMapper 用户角色关系]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 15:43
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Mapper
public interface SysUserRoleMapper extends SuperMapper<SysRoleUser> {
    int deleteUserRole(@Param("userId") Long userId, @Param("roleId") Long roleId);

    @Insert("insert into sys_role_user(user_id, role_id) values(#{userId}, #{roleId})")
    int saveUserRoles(@Param("userId") Long userId, @Param("roleId") Long roleId);

    /**
     * 根据用户id获取角色
     *
     * @param userId
     * @return
     */
    List<SysRole> findRolesByUserId(@Param("userId") Long userId);

    /**
     * 根据用户ids 获取
     *
     * @param userIds
     * @return
     */
    @Select("<script>select r.*,ru.user_id from sys_role_user ru inner join sys_role r on r.id = ru.role_id where ru.user_id IN " +
            " <foreach item='item' index='index' collection='list' open='(' separator=',' close=')'> " +
            " #{item} " +
            " </foreach>" +
            "</script>")
    List<SysRole> findRolesByUserIds(List<Long> userIds);
}
