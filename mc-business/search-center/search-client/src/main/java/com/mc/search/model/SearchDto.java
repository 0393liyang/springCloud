package com.mc.search.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * [SearchDto 说明/描述]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 15:02
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SearchDto implements Serializable {
    private static final long serialVersionUID = -2084416068307485742L;
    /**
     * 搜索关键字
     */
    private String queryStr;
    /**
     * 当前页数
     */
    private Integer page;
    /**
     * 每页显示数
     */
    private Integer limit;
    /**
     * 排序字段
     */
    private String sortCol;
    /**
     * 是否显示高亮
     */
    private Boolean isHighlighter;
    /**
     * es的路由
     */
    private String routing;
}
