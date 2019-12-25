package com.mc.file.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mc.db.mapper.SuperMapper;
import com.mc.file.model.FileInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * [FileMapper 上传存储db]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/20 0020 15:19
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public interface FileMapper extends SuperMapper<FileInfo> {

    List<FileInfo> findList(Page<FileInfo> page, @Param("f") Map<String, Object> params);

}
