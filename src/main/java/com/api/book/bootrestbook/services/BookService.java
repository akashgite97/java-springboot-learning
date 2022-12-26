package com.api.book.bootrestbook.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.api.book.bootrestbook.dao.BookRepository;
import com.api.book.bootrestbook.entity.Book;

@Service
@ComponentScan("com.api.book.bootrestbook.entity")
@EntityScan(basePackages = {"com.api.book.bootrestbook.entity"})
public class BookService {
    // private static List<Book> list = new ArrayList<>();
    // private static String author = "Akash";

    // static{
    // list.add(new Book(1,author,"firstbook"));
    // list.add(new Book(2,author,"secondBook"));
    // list.add(new Book(3,author,"thirdBook"));
    // }

    @Autowired
    BookRepository bookRepository;

    public List<Book> getAllBooks() {
        List<Book> list = null;
        try {
            list = (List<Book>) this.bookRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public Book getBookById(int id) {
        Book book = null;
        try {
            // book = list.stream().filter(e->e.getId() == id).findFirst().get();
            book = this.bookRepository.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return book;
    }

    public Book addBook(Book book) {
        Book result = null;
        try {
            result = bookRepository.save(book);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public void deleteBook(int id) {
        // list =
        // list.stream().filter(book->book.getId()!=id).collect(Collectors.toList());
        try {
            bookRepository.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void updateBook(Book book) {
        // list.stream().map(b->{
        // if(book.getId() == b.getId()){
        // b.setAuthor(book.getAuthor());
        // b.setTitle(book.getTitle());
        // }
        // return b;
        // }).collect(Collectors.toList());
        try {
            bookRepository.save(book);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
