package com.mc.user.controller;

import com.mc.common.model.PageResult;
import com.mc.common.model.Result;
import com.mc.common.model.SysRole;
import com.mc.user.service.ISysRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * [SysRoleController 角色管理]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 16:03
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Slf4j
@RestController
@Api(tags = "角色模块api")
public class SysRoleController {
    @Autowired
    private ISysRoleService sysRoleService;

    /**
     * 后台管理查询角色
     * @param params
     * @return
     */
    @ApiOperation(value = "后台管理查询角色")
    @GetMapping("/roles")
    public PageResult<SysRole> findRoles(@RequestParam Map<String, Object> params) {
        return sysRoleService.findRoles(params);
    }

    /**
     * 角色新增或者更新
     *
     * @param sysRole
     * @return
     */
    @PostMapping("/roles/saveOrUpdate")
    public Result saveOrUpdate(@RequestBody SysRole sysRole) {
        return sysRoleService.saveOrUpdateRole(sysRole);
    }

    /**
     * 后台管理删除角色
     * delete /role/1
     *
     * @param id
     */
    @ApiOperation(value = "后台管理删除角色")
    @DeleteMapping("/roles/{id}")
    public Result deleteRole(@PathVariable Long id) {
        try {
            if (id == 1L) {
                return Result.failed("管理员不可以删除");
            }
            sysRoleService.deleteRole(id);
            return Result.succeed("操作成功");
        } catch (Exception e) {
            log.error("role-deleteRole-error", e);
            return Result.failed("操作失败");
        }
    }
}
