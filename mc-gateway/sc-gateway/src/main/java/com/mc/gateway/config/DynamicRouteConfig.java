//package com.mc.gateway.config;
//
//import com.alibaba.cloud.nacos.NacosConfigProperties;
//import com.mc.gateway.route.NacosRouteDefinitionRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.context.ApplicationEventPublisher;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * [DynamicRouteConfig 动态路由配置]
// *
// * @author likai
// * @version 1.0
// * @date 2019/12/12 0012 10:16
// * @company Gainet
// * @copyright copyright (c) 2019
// */
//@Configuration
//@ConditionalOnProperty(prefix = "mc.gateway.dynamicRoute", name = "enabled", havingValue = "true")
//public class DynamicRouteConfig {
//    @Autowired
//    private ApplicationEventPublisher publisher;
//
//    /**
//     * Nacos实现方式
//     */
//    @Configuration
//    @ConditionalOnProperty(prefix = "mc.gateway.dynamicRoute", name = "dataType", havingValue = "nacos", matchIfMissing = true)
//    public class NacosDynRoute {
//        @Autowired
//        private NacosConfigProperties nacosConfigProperties;
//
//        @Bean
//        public NacosRouteDefinitionRepository nacosRouteDefinitionRepository() {
//            return new NacosRouteDefinitionRepository(publisher, nacosConfigProperties);
//        }
//    }
//}
