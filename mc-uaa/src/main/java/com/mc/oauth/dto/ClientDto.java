package com.mc.oauth.dto;

import com.mc.oauth.model.Client;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

/**
 * [ClientDto 说明/描述]
 *
 * @author likai
 * @version 1.0
 * @date 2019/12/11 0011 16:30
 * @company Gainet
 * @copyright copyright (c) 2019
 */
@Setter
@Getter
public class ClientDto extends Client {
    private static final long serialVersionUID = 1475637288060027265L;

    private List<Long> permissionIds;

    private Set<Long> serviceIds;
}
