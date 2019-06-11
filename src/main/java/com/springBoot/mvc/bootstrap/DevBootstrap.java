package com.springBoot.mvc.bootstrap;

import com.springBoot.mvc.model.Author;
import com.springBoot.mvc.model.Book;
import com.springBoot.mvc.model.Publisher;
import com.springBoot.mvc.model.repositories.AuthorRepository;
import com.springBoot.mvc.model.repositories.BookRepository;
import com.springBoot.mvc.model.repositories.PublisherRepository;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap  implements ApplicationListener<ContextRefreshedEvent> {


	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;

	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository){
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent refreshedEvent) {
		// TODO Auto-generated method stub
		initData();
		
	}

	private void initData(){

		// Publisher 1
		Publisher publisher1 = new Publisher();
		publisher1.setName("Bold Strokes");
		
		publisherRepository.save(publisher1);

		// Publisher 2
		Publisher publisher2 = new Publisher();
		publisher2.setName("NAMBLA");

		publisherRepository.save(publisher2);

		// Author 1
		Author ben = new Author("Ben", "Dover");
		Book bbc = new Book("The Bold and Brave Coward", "2469", publisher1);
		ben.getBooks().add(bbc);
		bbc.getAuthors().add(ben);

		authorRepository.save(ben);
		bookRepository.save(bbc);

		// Author 2
		Author moe = new Author("Moe", "Lester");
		Book ped = new Book("Political Etiquette Distingished", "2200", publisher2);
		moe.getBooks().add(ped);
		ped.getAuthors().add(moe);

		authorRepository.save(moe);
		bookRepository.save(ped);
	}
	
	

}
