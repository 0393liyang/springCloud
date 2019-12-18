package com.mc.search.service;

import java.util.Map;

/**
 * [IAggregationService 说明/描述]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 15:30
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public interface IAggregationService {
    /**
     * 访问统计聚合查询
     * @param indexName 索引名
     * @param routing es的路由
     * @return
     */
    Map<String, Object> requestStatAgg(String indexName, String routing);
}
