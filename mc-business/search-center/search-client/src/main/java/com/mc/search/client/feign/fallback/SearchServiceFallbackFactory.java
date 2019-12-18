package com.mc.search.client.feign.fallback;

import com.alibaba.fastjson.JSONObject;
import com.mc.common.model.PageResult;
import com.mc.search.client.feign.SearchService;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * [SearchServiceFallbackFactory searchService降级工场]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 15:07
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Slf4j
@Component
public class SearchServiceFallbackFactory implements FallbackFactory<SearchService> {
    @Override
    public SearchService create(Throwable throwable) {
        return (indexName, searchDto) -> {
            log.error("通过索引{}搜索异常:{}", indexName, throwable);
            return PageResult.<JSONObject>builder().build();
        };
    }
}
