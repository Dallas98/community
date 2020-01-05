package com.dallas.community.dto;

import com.dallas.community.model.User;
import lombok.Data;

/**
 * @program: community
 * @description:
 * @author: Dallas
 * @create: 2020-01-05 15:52
 */
@Data
public class QuestionDTO {
    private Integer id;
    private String description;
    private String title;
    private Long gmt_create;
    private Long gmt_modified;
    private Integer creator;
    private Integer comment_count;
    private Integer view_count;
    private Integer like_count;
    private String tag;
    private User user;
}
