package com.dallas.community.model;

import lombok.Data;

/**
 * @program: community
 * @description:
 * @author: Dallas
 * @create: 2019-12-29 16:53
 */

@Data
public class User {
    private Integer id;
    private String account_id;
    private String name;
    private String token;
    private Long gmt_create;
    private Long gmt_modified;
    private String avatar_url;
}
