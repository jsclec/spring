package com.learning_spring.Spring5webApp.bootstrap;

import com.learning_spring.Spring5webApp.domain.Author;
import com.learning_spring.Spring5webApp.domain.Book;
import com.learning_spring.Spring5webApp.domain.Publisher;
import com.learning_spring.Spring5webApp.repositories.AuthorRepository;
import com.learning_spring.Spring5webApp.repositories.BookRepository;
import com.learning_spring.Spring5webApp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        //now let's initialize some authors and books and save them in our database
        Author eric = new Author("Eric", "Evans");
        //authorRepository.save(eric);
        Book ddd = new Book("domain driven design", "123123");
        //bookRepository.save(ddd);
        Publisher publisher = new Publisher("Addison Wesley", "123 Main Street", "New York", "New York", 123123L);
        publisherRepository.save(publisher);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);
        bookRepository.save(ddd);
        authorRepository.save(eric);
        publisherRepository.save(publisher);







        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "3212356");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        noEJB.setPublisher(publisher);
        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisher.getBooks().add(noEJB);
        publisherRepository.save(publisher);

        System.out.println("Starting up in bootstrap");
        System.out.println("Number of books " + bookRepository.count());
        System.out.println("Number of authors " + authorRepository.count());
        System.out.println("Number of publishers " + publisherRepository.count());

    }
}
