package com.example.demo.ex10;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//@Data - jau ir iekšā visi geteri un seteri, to string un konstruktori utt.
@Entity(name="books")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;


    private String title;
    private String author;
    private String ISBN;
    private int pagesNum;

}
