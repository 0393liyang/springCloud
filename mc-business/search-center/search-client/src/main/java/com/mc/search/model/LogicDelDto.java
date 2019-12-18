package com.mc.search.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * [LogicDelDto 逻辑删除条件对象]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 15:03
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Setter
@Getter
@AllArgsConstructor
public class LogicDelDto {
    /**
     * 逻辑删除字段名
     */
    private String logicDelField;
    /**
     * 逻辑删除字段未删除的值
     */
    private String logicNotDelValue;
}
