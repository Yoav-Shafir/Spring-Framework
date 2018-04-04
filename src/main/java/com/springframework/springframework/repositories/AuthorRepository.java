package com.springframework.springframework.repositories;

import com.springframework.springframework.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
