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
                .ISBN("cvb")
                .pagesNum(235)
                .title("Title1")
                .author("gasdkagksgd")
                .build();
        Book book2 = Book.builder()
                .ISBN("rrd")
                .pagesNum(32)
                .title("Title1")
                .author("gasdkagksgd")
                .build();
        Book book3 = Book.builder()
                .ISBN("asv")
                .pagesNum(25)
                .title("names")
                .author("gsgd")
                .build();
        Book book4 = Book.builder()
                .ISBN("aaa")
                .pagesNum(125)
                .title("CleanCode")
                .author("Bob")
                .build();
        bookRepository.saveAll(List.of(book, book2, book3, book4));
        List<Book> result = bookRepository.findByTitle(title);
        return result;
    }

    @GetMapping("/book/byISBN/{ISBN}")
    public Book generateBook1(@PathVariable("ISBN") String ISBN) {
        Book book = Book.builder()
                .ISBN("cvb")
                .pagesNum(235)
                .title("Title1")
                .author("gasdkagksgd")
                .build();
        Book book2 = Book.builder()
                .ISBN("rrd")
                .pagesNum(32)
                .title("Title1")
                .author("gasdkagksgd")
                .build();
        Book book3 = Book.builder()
                .ISBN("asv")
                .pagesNum(25)
                .title("names")
                .author("gsgd")
                .build();
        Book book4 = Book.builder()
                .ISBN("aaa")
                .pagesNum(425)
                .title("CleanCode")
                .author("Bob")
                .build();
        bookRepository.saveAll(List.of(book, book2, book3, book4));
        Book resultISBN = bookRepository.findByISBN(ISBN);
        return resultISBN;
    }
    @GetMapping("/book/byISBNAndAuthor/{ISBN}/{author}")
    public Book getByISBNAndAUthor(@PathVariable("ISBN") String ISBN, @PathVariable("author") String author) {
        Book book = Book.builder()
                .ISBN("cvb")
                .pagesNum(235)
                .title("Title1")
                .author("gasdkagksgd")
                .build();
        Book book2 = Book.builder()
                .ISBN("rrd")
                .pagesNum(32)
                .title("Title1")
                .author("gasdkagksgd")
                .build();
        Book book3 = Book.builder()
                .ISBN("asv")
                .pagesNum(25)
                .title("names")
                .author("gsgd")
                .build();
        Book book4 = Book.builder()
                .ISBN("aaa")
                .pagesNum(425)
                .title("CleanCode")
                .author("Bob")
                .build();
        bookRepository.saveAll(List.of(book, book2, book3, book4));
        Book resultISBNAndAuthor = bookRepository.findByISBNAndAuthor(ISBN, author);
        return resultISBNAndAuthor;
    }
    @GetMapping("/book/author/{author}")
    public List<Book> getThreeThickestByAuthor(@PathVariable("author") String author, @PathVariable("pagesNum") int pagesNum) {
        Book book = Book.builder()
                .ISBN("cvb")
                .pagesNum(235)
                .title("Title1")
                .author("aaa")
                .build();
        Book book2 = Book.builder()
                .ISBN("rrd")
                .pagesNum(32)
                .title("Title1")
                .author("aaa")
                .build();
        Book book3 = Book.builder()
                .ISBN("asv")
                .pagesNum(25)
                .title("names")
                .author("aaa")
                .build();
        Book book4 = Book.builder()
                .ISBN("aaa")
                .pagesNum(425)
                .title("CleanCode")
                .author("Bob")
                .build();
        bookRepository.saveAll(List.of(book, book2, book3, book4));
        List <Book> resultThreeThickestByAuthor = bookRepository.findTop3ByAuthorOrderByPagesNumDesc(author, pagesNum);
        return resultThreeThickestByAuthor;
    }
    @GetMapping("/book/getLikeTitle/{title}")
    public List <Book> getLikeTitle(@PathVariable("title") String title) {
        Book book = Book.builder()
                .ISBN("cvb")
                .pagesNum(235)
                .title("Title1")
                .author("aaa")
                .build();
        Book book2 = Book.builder()
                .ISBN("rrd")
                .pagesNum(32)
                .title("Title1")
                .author("aaa")
                .build();
        Book book3 = Book.builder()
                .ISBN("asv")
                .pagesNum(25)
                .title("names")
                .author("aaa")
                .build();
        Book book4 = Book.builder()
                .ISBN("aaa")
                .pagesNum(425)
                .title("CleanCode")
                .author("Bob")
                .build();
        bookRepository.saveAll(List.of(book, book2, book3, book4));
        List <Book> resultgetLikeTitle = bookRepository.findByTitleStartsWith(title);
        return resultgetLikeTitle;
    }
}
