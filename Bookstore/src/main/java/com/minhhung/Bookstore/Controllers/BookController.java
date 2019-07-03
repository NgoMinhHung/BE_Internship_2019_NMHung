package com.minhhung.Bookstore.Controllers;

import com.minhhung.Bookstore.Exceptions.NotFoundException;
import com.minhhung.Bookstore.Models.Book;
import com.minhhung.Bookstore.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/{id}")
    Book get(@PathVariable int id){
        Optional<Book> optionalBook = bookRepository.findById(id);

        if(optionalBook.isPresent()){
            return optionalBook.get();
        }

        throw new NotFoundException(String.format("Book id %d not found", id));
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable int id){

        if(!bookRepository.existsById(id)){
            throw new NotFoundException(String.format("Book id %d not found", id));
        }

        bookRepository.deleteById(id);
    }

    @PostMapping()
    void post(@RequestBody Book book){
        book.setId(0);
        bookRepository.save(book);
    }

    @PutMapping()
    void put(@RequestBody Book book){
        bookRepository.save(book);
    }
}
