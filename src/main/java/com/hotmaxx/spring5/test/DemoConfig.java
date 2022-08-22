package com.hotmaxx.spring5.test;

import com.hotmaxx.spring5.service.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfig {

    @Bean
    public Book book() {
        Book book = new Book();
        book.setAuthor("abd");
        book.setName("武林外传");
        return new Book();
    }


}
