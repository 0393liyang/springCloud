package com.mc.common.annotation;

import java.lang.annotation.*;

/**
 * [LoginClient 请求的方法参数上添加该注解，则注入当前登录账号的应用id]
 * <pre>
 *     例：public void test(@LoginClient String clientId) //注入webApp
 * </pre>
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/10 0010 18:05
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoginClient {
}
