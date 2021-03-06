package com.example.demo.rest;

import com.example.demo.ex10.Book;
import com.example.demo.ex10.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BookController {

    private BookRepository bookRepository;

    @GetMapping("/book")
    public Book generateBook(){
        Book book = Book.builder()
                .ISBN("")
                .pagesNum(235)
                .title("aasasas")
                .author("gasdkagksgd")
                .build();
        book = bookRepository.save(book);
        return book;
    }
}
