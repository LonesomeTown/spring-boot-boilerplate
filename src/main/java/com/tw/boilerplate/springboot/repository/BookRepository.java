package com.tw.boilerplate.springboot.repository;

import com.tw.boilerplate.springboot.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
