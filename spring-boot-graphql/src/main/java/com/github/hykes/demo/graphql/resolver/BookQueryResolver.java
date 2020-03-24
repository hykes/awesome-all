package com.github.hykes.demo.graphql.resolver;


import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.github.hykes.demo.graphql.model.Author;
import com.github.hykes.demo.graphql.model.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hehaiyangwork@gmail.com
 * @date 2020-03-24 21:16:00
 */
@Component
public class BookQueryResolver implements GraphQLQueryResolver {
    public List<Book> findBooks() {
        Author author = Author.builder()
                .id(1)
                .name("Bill Venners")
                .age(40)
                .build();
        Book b = Book.builder()
                .id(1)
                .name("scala编程第三版")
                .author(author)
                .publisher("电子工业出版社")
                .build();

        Author author2 = Author.builder()
                .id(1)
                .name("Bill Venners")
                .age(40)
                .build();
        Book b2 = Book.builder()
                .id(1)
                .name("scala编程第四版")
                .author(author2)
                .publisher("电子工业出版社")
                .build();
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(b);
        bookList.add(b2);
        return bookList;
    }
}