package com.example.demo.ex10;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitle(String title);
    Book findByISBN(String ISBN);

}
