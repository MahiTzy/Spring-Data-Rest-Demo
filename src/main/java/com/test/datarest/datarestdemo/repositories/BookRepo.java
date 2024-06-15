package com.test.datarest.datarestdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.test.datarest.datarestdemo.entities.Book;

@RepositoryRestResource(path = "books", collectionResourceRel = "book")
public interface BookRepo extends JpaRepository<Book, Long>{
    
}
