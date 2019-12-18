package com.mc.search.client.feign;

import com.alibaba.fastjson.JSONObject;
import com.mc.common.constant.ServiceNameConstants;
import com.mc.common.model.PageResult;
import com.mc.search.client.feign.fallback.SearchServiceFallbackFactory;
import com.mc.search.model.SearchDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * [SearchService 说明/描述]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 15:05
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@FeignClient(name = ServiceNameConstants.SEARCH_SERVICE, fallbackFactory = SearchServiceFallbackFactory.class, decode404 = true)
public interface SearchService {
    /**
     * 查询文档列表
     * @param indexName 索引名
     * @param searchDto 搜索Dto
     */
    @PostMapping(value = "/search/{indexName}")
    PageResult<JSONObject> strQuery(@PathVariable("indexName") String indexName, @RequestBody SearchDto searchDto);
}
