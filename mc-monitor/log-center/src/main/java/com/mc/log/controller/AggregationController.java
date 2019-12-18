package com.mc.log.controller;

import com.mc.search.client.service.IQueryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * [AggregationController 访问统计]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/17 0017 17:36
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@RestController
public class AggregationController {
    @Autowired
    private IQueryService queryService;

    @ApiOperation(value = "访问统计")
    @GetMapping(value = "/requestStat")
    public Map<String, Object> requestStatAgg() {
        return queryService.requestStatAgg("point-log-*","request-statistics");
    }
}
