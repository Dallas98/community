package com.dallas.community.dto;

import lombok.Data;

/**
 * @program: community
 * @description:
 * @author: Dallas
 * @create: 2019-12-28 13:12
 */

@Data
public class GithubUser {
    private String name;
    private long id;
    private String bio;
    private String avatar_url;
}
