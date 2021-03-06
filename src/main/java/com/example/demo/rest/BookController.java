package com.example.demo.rest;

import com.example.demo.ex10.Book;
import com.example.demo.ex10.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookController {

    private BookRepository bookRepository;

    @GetMapping("/book/{title}")
    public List<Book> generateBook(@PathVariable("title") String title){
        Book book = Book.builder()
                .ISBN("")
                .pagesNum(235)
                .title("aasasas")
                .author("gasdkagksgd")
                .build();
        Book book2 = Book.builder()
                .ISBN("")
                .pagesNum(2325)
                .title("aasasas")
                .author("gasdkagksgd")
                .build();
        bookRepository.saveAll(List.of(book, book2));
        List<Book> result = bookRepository.findByTitle(title);
        return result;
    }
}
