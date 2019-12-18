package com.mc.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * [SuperMapper mapper 父类，注意这个类不要让 mp 扫描到！！]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 10:37
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public interface SuperMapper<T> extends BaseMapper<T> {
    // 这里可以放一些公共的方法
}
