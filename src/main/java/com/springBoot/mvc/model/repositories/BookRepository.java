package com.springBoot.mvc.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springBoot.mvc.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
