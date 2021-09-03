package com.learning_spring.Spring5webApp.repositories;
import com.learning_spring.Spring5webApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
