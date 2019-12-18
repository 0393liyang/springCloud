package com.mc.search.client.service;

import com.alibaba.fastjson.JSONObject;
import com.mc.common.model.PageResult;
import com.mc.search.model.LogicDelDto;
import com.mc.search.model.SearchDto;

import java.util.Map;

/**
 * [IQueryService 搜索客户端接口]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 15:01
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public interface IQueryService {
    /**
     * 查询文档列表
     * @param indexName 索引名
     * @param searchDto 搜索Dto
     */
    PageResult<JSONObject> strQuery(String indexName, SearchDto searchDto);

    /**
     * 查询文档列表
     * @param indexName 索引名
     * @param searchDto 搜索Dto
     * @param logicDelDto 逻辑删除Dto
     */
    PageResult<JSONObject> strQuery(String indexName, SearchDto searchDto, LogicDelDto logicDelDto);

    /**
     * 访问统计聚合查询
     * @param indexName 索引名
     * @param routing es的路由
     */
    Map<String, Object> requestStatAgg(String indexName, String routing);
}
