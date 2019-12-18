package com.mc.admin.model;

import lombok.Data;

/**
 * [IndexDto]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 15:18
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Data
public class IndexDto {
    /**
     * 索引名
     */
    private String indexName;
    /**
     * 分片数 number_of_shards
     */
    private Integer numberOfShards;
    /**
     * 副本数 number_of_replicas
     */
    private Integer numberOfReplicas;
    /**
     * 类型
     */
    private String type;
    /**
     * mappings内容
     */
    private String mappingsSource;
}
