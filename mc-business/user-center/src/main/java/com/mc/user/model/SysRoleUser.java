package com.mc.user.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;

/**
 * [SysRoleUser]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 15:40
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("sys_role_user")
public class SysRoleUser extends Model<SysRoleUser> {
    private Long userId;
    private Long roleId;
}
