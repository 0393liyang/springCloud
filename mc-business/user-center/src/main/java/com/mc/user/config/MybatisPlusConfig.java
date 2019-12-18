package com.mc.user.config;

import com.mc.db.config.DefaultMybatisPlusConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * [MybatisPlusConfig 说明/描述]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 15:46
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Configuration
@MapperScan({"com.mc.user.mapper*"})
public class MybatisPlusConfig extends DefaultMybatisPlusConfig {
}
