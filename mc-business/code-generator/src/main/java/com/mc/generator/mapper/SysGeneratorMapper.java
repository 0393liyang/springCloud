package com.mc.generator.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mc.db.mapper.SuperMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * [SysGeneratorMapper]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/20 0020 15:46
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Component
@Mapper
public interface SysGeneratorMapper extends SuperMapper {
    List<Map<String, Object>> queryList(Page<Map<String, Object>> page, @Param("p") Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    Map<String, String> queryTable(String tableName);

    List<Map<String, String>> queryColumns(String tableName);
}
