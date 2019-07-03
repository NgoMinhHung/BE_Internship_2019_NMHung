package com.minhhung.Bookstore.Repositories;

import com.minhhung.Bookstore.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
