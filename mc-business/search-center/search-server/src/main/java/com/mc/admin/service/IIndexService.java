package com.mc.admin.service;

import com.mc.admin.model.IndexDto;
import com.mc.admin.model.IndexVo;
import com.mc.common.model.PageResult;

import java.util.Map;

/**
 * [IIndexService 索引]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 15:19
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public interface IIndexService {
    /**
     * 创建索引
     */
    void create(IndexDto indexDto);

    /**
     * 删除索引
     * @param indexName 索引名
     */
    void delete(String indexName);

    /**
     * 索引列表
     * @param queryStr 搜索字符串
     * @param indices 默认显示的索引名
     */
    PageResult<IndexVo> list(String queryStr, String... indices);

    /**
     * 显示索引明细
     * @param indexName 索引名
     */
    Map<String, Object> show(String indexName);
}
