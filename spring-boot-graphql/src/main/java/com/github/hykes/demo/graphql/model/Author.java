package com.github.hykes.demo.graphql.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2020-03-24 21:15:00
 */
@Data
@Builder
public class Author {
    private Integer id;
    private String name;
    private Integer age;
}
