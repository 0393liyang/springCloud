package com.mc.log.controller;

import com.alibaba.fastjson.JSONObject;
import com.mc.common.model.PageResult;
import com.mc.search.client.service.IQueryService;
import com.mc.search.model.SearchDto;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * [SlowQueryLogController 慢查询日志]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/17 0017 17:37
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@RestController
public class SlowQueryLogController {
    @Autowired
    private IQueryService queryService;

    @ApiOperation(value = "慢sql日志全文搜索列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "分页起始位置", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "limit", value = "分页结束位置", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "queryStr", value = "搜索关键字", dataType = "String")
    })
    @GetMapping(value = "/slowQueryLog")
    public PageResult<JSONObject> getPage(SearchDto searchDto) {
        searchDto.setIsHighlighter(true);
        searchDto.setSortCol("timestamp");
        return queryService.strQuery("mysql-slowlog-*", searchDto);
    }
}
