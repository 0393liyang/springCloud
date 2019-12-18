package com.mc.admin.model;

import lombok.Data;

/**
 * [IndexVo]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 15:19
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Data
public class IndexVo {
    /**
     * 索引名
     */
    private String indexName;
    /**
     * 文档数
     */
    private Long docsCount;
    /**
     * 文档删除数
     */
    private Long docsDeleted;
    /**
     * 索引大小(kb)
     */
    private Double storeSizeInBytes;
    /**
     * 总查询数
     */
    private Long queryCount;
    /**
     * 总查询耗时(s)
     */
    private Double queryTimeInMillis;
}
