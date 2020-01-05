package com.dallas.community.dto;

import lombok.Data;

/**
 * @program: community
 * @description:
 * @author: Dallas
 * @create: 2019-12-28 12:14
 */

@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
