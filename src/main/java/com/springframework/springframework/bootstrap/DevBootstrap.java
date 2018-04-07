package com.springframework.springframework.bootstrap;

import com.springframework.springframework.model.Author;
import com.springframework.springframework.model.Book;
import com.springframework.springframework.model.Publisher;
import com.springframework.springframework.repositories.AuthorRepository;
import com.springframework.springframework.repositories.BookRepository;
import com.springframework.springframework.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;

    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        Publisher publisher = new Publisher();
        publisher.setName("The Publisher");
        publisher.setAddress("12th Street, LA");
        publisherRepository.save(publisher);

        Author rod = new Author("Rod", "Johnson");
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "1234", publisher);

        rod.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        ddd.getAuthors().add(rod);

        authorRepository.save(eric);
        authorRepository.save(rod);
        bookRepository.save(ddd);
    }
}


