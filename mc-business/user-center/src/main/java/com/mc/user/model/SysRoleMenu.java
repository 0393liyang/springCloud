package com.mc.user.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;

/**
 * [SysRoleMenu 说明/描述]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 15:39
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("sys_role_menu")
public class SysRoleMenu extends Model<SysRoleMenu> {
    private Long roleId;
    private Long menuId;
}
