package com.mc.log.config;

import org.slf4j.TtlMDCAdapter;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * [TtlMDCAdapterInitializer 初始化TtlMDCAdapter实例，并替换MDC中的adapter对象]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/10 0010 17:29
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public class TtlMDCAdapterInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        //加载TtlMDCAdapter实例
        TtlMDCAdapter.getInstance();
    }
}
