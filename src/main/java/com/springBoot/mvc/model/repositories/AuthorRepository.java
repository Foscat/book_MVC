package com.springBoot.mvc.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springBoot.mvc.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
