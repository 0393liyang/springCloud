package com.mc.common.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * [SysRole 说明/描述]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/10 0010 18:34
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_role")
public class SysRole extends SuperEntity {
    private static final long serialVersionUID = 4497149010220586111L;
    private String code;
    private String name;
    private Long userId;
}
