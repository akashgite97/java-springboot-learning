package com.api.book.bootrestbook.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.bootrestbook.entity.Book;
import com.api.book.bootrestbook.services.BookService;


@RestController
@ComponentScan(basePackages = {"com.api.book.bootrestbook.controllers","com.api.book.bootrestbook.entity","com.api.book.bootrestbook.service","com.api.book.bootrestbook.dao"})
public class BookController {

    @Autowired(required = false) 
    BookService bookService;
    
    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks(){
        List<Book> list  = bookService.getAllBooks();
        if(list.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }else{
            return ResponseEntity.of(Optional.of(list));
        }
    }

    @GetMapping("/book/{bookId}")
    public ResponseEntity<Book> getBookById(@PathVariable int bookId){
        Book book = bookService.getBookById(bookId);
       if(book==null){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
       }

       return ResponseEntity.of(Optional.of(book));
    }

    @PostMapping("/book")
    public Book addBook(@RequestBody Book book){
        return this.bookService.addBook(book);
    }

    @DeleteMapping("/book/{bookId}")
    public void deleteBook(@PathVariable int bookId){
      this.bookService.deleteBook(bookId);
    }

    @PutMapping("/book")
    public ResponseEntity<Book> updateBook(@RequestBody Book book){
        try {
            this.bookService.updateBook(book);
            return ResponseEntity.ok().body(book);
        } catch (Exception e) {
           return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
 
    }
       

}
