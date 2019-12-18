package com.mc.oauth.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mc.db.mapper.SuperMapper;
import com.mc.oauth.model.Client;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * [ClientMapper 说明/描述]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 16:35
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public interface ClientMapper extends SuperMapper<Client> {
    List<Client> findList(Page<Client> page, @Param("params") Map<String, Object> params );
}
