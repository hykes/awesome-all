package com.github.hykes.graphql.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Data;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2020-03-24 21:15:00
 */
@Entity
@Data
@Builder
@Table(name = "authors")
public class Author implements Serializable {

    private static final long serialVersionUID = -3164932428714950347L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGINT(20) NOT NULL")
    private Long id;

    @Column(name = "name", columnDefinition = "VARCHAR(128) DEFAULT NULL COMMENT '名称'")
    private String name;

    @Column(name = "age", columnDefinition = "INT(11) NOT NULL COMMENT '年龄'")
    private Integer age;

}
