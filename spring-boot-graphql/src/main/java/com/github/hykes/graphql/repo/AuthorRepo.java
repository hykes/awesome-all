package com.github.hykes.graphql.repo;

import com.github.hykes.graphql.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2020-04-01 19:33:00
 */
public interface AuthorRepo extends JpaRepository<Author, Long>, JpaSpecificationExecutor<Author> {

}
