package com.mc.user.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mc.common.model.SysUser;
import com.mc.db.mapper.SuperMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * [SysUserMapper 用户表 Mapper 接口]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 15:42
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public interface SysUserMapper extends SuperMapper<SysUser> {
    /**
     * 分页查询用户列表
     * @param page
     * @param params
     * @return
     */
    List<SysUser> findList(Page<SysUser> page, @Param("u") Map<String, Object> params);
}
