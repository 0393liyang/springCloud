//package com.mc.gateway.feign;
//
//import com.mc.common.constant.ServiceNameConstants;
//import com.mc.common.model.SysMenu;
//import com.mc.gateway.feign.fallback.MenuServiceFallbackFactory;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import java.util.List;
//
///**
// * [MenuService ]
// *
// * @author likai
// * @version 1.0
// * @date 2019/12/12 0012 10:14
// * @company Gainet
// * @copyright copyright (c) 2019
// */
//@FeignClient(name = ServiceNameConstants.USER_SERVICE, fallbackFactory = MenuServiceFallbackFactory.class, decode404 = true)
//public interface MenuService {
//    /**
//     * 角色菜单列表
//     * @param roleCodes
//     */
//    @GetMapping(value = "/menus/{roleCodes}")
//    List<SysMenu> findByRoleCodes(@PathVariable("roleCodes") String roleCodes);
//}
