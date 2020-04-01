package com.github.hykes.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.github.hykes.graphql.entity.Book;
import org.springframework.stereotype.Component;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2020-04-01 19:27:00
 */
@Component
public class BookMutationResolver implements GraphQLMutationResolver {

    public Book saveBook() {
        return new Book();
    }

}
