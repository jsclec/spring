package com.learning_spring.Spring5webApp.repositories;
import com.learning_spring.Spring5webApp.domain.Author;
import org.springframework.data.repository.CrudRepository;


//this interface will extend the CrudRepository class that gives us multiple methods for dealing with repositories
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
