package com.learning_spring.Spring5webApp.repositories;

import com.learning_spring.Spring5webApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
