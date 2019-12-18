package com.mc.common.ribbon;

import com.mc.common.constant.ConfigConstants;
import com.mc.common.ribbon.config.RuleConfigure;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

/**
 * [LbIsolationAutoConfigure Ribbon扩展配置类]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 11:36
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@ConditionalOnProperty(value = ConfigConstants.CONFIG_RIBBON_ISOLATION_ENABLED, havingValue = "true")
@RibbonClients(defaultConfiguration = {RuleConfigure.class})
public class LbIsolationAutoConfigure {
}
