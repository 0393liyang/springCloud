package com.mc.search.controller;

import com.mc.search.service.IAggregationService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * [AggregationController 聚合统计]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 15:32
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Slf4j
@RestController
@Api(tags = "搜索模块api")
@RequestMapping("/agg")
public class AggregationController {
    @Autowired
    private IAggregationService aggregationService;

    /**
     * 访问统计聚合查询
     * @param indexName 索引名
     * @param routing es的路由
     */
    @GetMapping("/requestStat/{indexName}/{routing}")
    public Map<String, Object> requestStatAgg(@PathVariable String indexName, @PathVariable String routing) {
        return aggregationService.requestStatAgg(indexName, routing);
    }
}
