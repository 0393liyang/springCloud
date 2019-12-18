package com.mc.search.service;

import com.alibaba.fastjson.JSONObject;
import com.mc.common.model.PageResult;
import com.mc.search.model.SearchDto;

/**
 * [ISearchService 说明/描述]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 15:28
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public interface ISearchService {
    /**
     * StringQuery通用搜索
     * @param indexName 索引名
     * @param searchDto 搜索Dto
     * @return
     */
    PageResult<JSONObject> strQuery(String indexName, SearchDto searchDto);
}
