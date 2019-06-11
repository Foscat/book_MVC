package com.springBoot.mvc.model.repositories;

import com.springBoot.mvc.model.Publisher;

import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository <Publisher, Long> {

}
