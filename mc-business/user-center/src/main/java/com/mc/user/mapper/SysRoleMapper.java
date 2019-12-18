package com.mc.user.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mc.common.model.SysRole;
import com.mc.db.mapper.SuperMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * [SysRoleMapper 角色]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 15:37
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public interface SysRoleMapper extends SuperMapper<SysRole> {
    List<SysRole> findList(Page<SysRole> page, @Param("r") Map<String, Object> params);
}
