package com.mc.common.ribbon.config;

import com.mc.common.ribbon.rule.CustomIsolationRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;

/**
 * [RuleConfigure 说明/描述]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 11:33
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public class RuleConfigure {
    @Bean
    public IRule isolationRule() {
        return new CustomIsolationRule();
    }
}
