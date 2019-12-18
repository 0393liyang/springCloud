package com.mc.user.config;

import com.mc.common.config.DefaultAsycTaskConfig;
import org.springframework.context.annotation.Configuration;

/**
 * [AsycTaskExecutorConfig 线程池配置、启用异步]
 * <pre>
 *     @Async quartz 需要使用
 * </pre>
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 15:44
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Configuration
public class AsycTaskExecutorConfig extends DefaultAsycTaskConfig {
}
