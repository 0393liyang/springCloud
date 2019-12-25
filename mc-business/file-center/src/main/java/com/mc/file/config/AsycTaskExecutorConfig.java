package com.mc.file.config;

import com.mc.common.config.DefaultAsycTaskConfig;
import org.springframework.context.annotation.Configuration;

/**
 * [AsycTaskExecutorConfig 线程池配置、启用异步]
 *
 * @Async quartz 需要使用
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/20 0020 15:31
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Configuration
public class AsycTaskExecutorConfig extends DefaultAsycTaskConfig {
}
