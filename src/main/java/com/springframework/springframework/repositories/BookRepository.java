package com.springframework.springframework.repositories;

import com.springframework.springframework.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
