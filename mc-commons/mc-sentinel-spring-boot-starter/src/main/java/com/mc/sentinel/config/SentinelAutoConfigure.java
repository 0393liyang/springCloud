package com.mc.sentinel.config;

import cn.hutool.json.JSONUtil;
import com.alibaba.csp.sentinel.adapter.servlet.callback.UrlBlockHandler;
import com.alibaba.csp.sentinel.adapter.servlet.callback.WebCallbackManager;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.mc.common.model.Result;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * [SentinelAutoConfigure Sentinel配置类]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 11:41
 * @company Gainet
 * @copyright copyright (c) 2019
 */
public class SentinelAutoConfigure {
    public SentinelAutoConfigure() {
        WebCallbackManager.setUrlBlockHandler(new CustomUrlBlockHandler());
    }

    /**
     * 限流、熔断统一处理类
     */
    public class CustomUrlBlockHandler implements UrlBlockHandler {
        @Override
        public void blocked(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, BlockException e) throws IOException {
            Result result = Result.failed("flow-limiting");
            httpServletResponse.getWriter().print(JSONUtil.toJsonStr(result));
        }
    }
}
