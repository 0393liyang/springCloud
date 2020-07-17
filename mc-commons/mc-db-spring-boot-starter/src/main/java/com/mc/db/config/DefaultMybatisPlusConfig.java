package com.mc.db.config;

import cn.hutool.core.collection.CollUtil;
import com.baomidou.mybatisplus.core.parser.ISqlParserFilter;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.tenant.TenantHandler;
import com.baomidou.mybatisplus.extension.plugins.tenant.TenantSqlParser;
import com.mc.common.properties.TenantProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 * [DefaultMybatisPlusConfig mybatis-plus配置]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 10:35
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Import(DateMetaObjectHandler.class)
public class DefaultMybatisPlusConfig {
    @Autowired
    private TenantHandler tenantHandler;

    @Autowired
    private ISqlParserFilter sqlParserFilter;

    @Autowired
    private TenantProperties tenantProperties;

    /**
     * 分页插件，自动识别数据库类型
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        boolean enableTenant = tenantProperties.getEnable();
        //是否开启多租户隔离
        if (enableTenant) {
            TenantSqlParser tenantSqlParser = new TenantSqlParser()
                    .setTenantHandler(tenantHandler);
            paginationInterceptor.setSqlParserList(CollUtil.toList(tenantSqlParser));
            paginationInterceptor.setSqlParserFilter(sqlParserFilter);
        }
        return paginationInterceptor;
    }
}
