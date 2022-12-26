package com.api.book.bootrestbook.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.api.book.bootrestbook.entity.Book;
@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
    
    public Book findById(int id);
}
