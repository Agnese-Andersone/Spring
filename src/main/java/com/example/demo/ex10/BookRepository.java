package com.example.demo.ex10;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitle(String title);
    Book findByISBN(String ISBN);
    Book findByISBNAndAuthor(String ISBN, String author);
    List <Book> findTop3ByAuthorOrderByPagesNumDesc(String author, int pagesNum);
    List <Book> findByTitleStartingWith(String title);
    List <Book> findByPagesNumIsBetween(int from, int to);
    @Query(value = "SELECT b FROM books b WHERE b.pagesNum > :x")
    List <Book> findWherePagesNumIsGreaterThanX(@Param("x") Integer x);

}
