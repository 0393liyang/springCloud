package com.mc.search.controller;

import com.alibaba.fastjson.JSONObject;
import com.mc.common.model.PageResult;
import com.mc.search.model.SearchDto;
import com.mc.search.service.ISearchService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * [SearchController 通用搜索]
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
@RequestMapping("/search")
public class SearchController {
    @Autowired
    private ISearchService searchService;

    /**
     * 查询文档列表
     * @param indexName 索引名
     * @param searchDto 搜索Dto
     */
    @PostMapping("/{indexName}")
    public PageResult<JSONObject> strQuery(@PathVariable String indexName, @RequestBody(required = false) SearchDto searchDto) {
        if (searchDto == null) {
            searchDto = new SearchDto();
        }
        return searchService.strQuery(indexName, searchDto);
    }
}
