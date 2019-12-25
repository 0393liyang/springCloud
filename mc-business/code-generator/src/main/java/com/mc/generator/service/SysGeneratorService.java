package com.mc.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mc.common.model.PageResult;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * [SysGeneratorService]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/20 0020 15:56
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Service
public interface SysGeneratorService extends IService {
    PageResult queryList(Map<String, Object> map);

    Map<String, String> queryTable(String tableName);

    List<Map<String, String>> queryColumns(String tableName);

    byte[] generatorCode(String[] tableNames);
}
