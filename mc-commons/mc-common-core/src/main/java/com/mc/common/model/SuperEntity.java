package com.mc.common.model;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * [SuperEntity 说明/描述]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/10 0010 18:32
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Setter
@Getter
public class SuperEntity<T extends Model<?>> extends Model<T> {

    /**
     * 主键ID
     */
    @TableId
    private Long id;
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
