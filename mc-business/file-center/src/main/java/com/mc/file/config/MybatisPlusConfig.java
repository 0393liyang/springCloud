package com.mc.file.config;

import com.mc.db.config.DefaultMybatisPlusConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * [MybatisPlusConfig]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/20 0020 15:31
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Configuration
@MapperScan({"com.mc.file.mapper*"})
public class MybatisPlusConfig extends DefaultMybatisPlusConfig {
}
