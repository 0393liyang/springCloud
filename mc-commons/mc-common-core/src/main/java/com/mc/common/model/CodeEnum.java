package com.mc.common.model;

/**
 * [CodeEnum 说明/描述]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/10 0010 18:29
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public enum CodeEnum {
    SUCCESS(0),
    ERROR(1);

    private Integer code;
    CodeEnum(Integer code){
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
