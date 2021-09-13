package com.learning_spring.Spring5webApp.controller;


import com.learning_spring.Spring5webApp.repositories.BookRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//here we are going to build a controller for the Spring MVC architecture
public class BookController {


    //let's get an instance of the book repository
    private final BookRepository bookRepository;


    public BookController(BookRepository bookRepository) {
        //injecting dependency, in this case the book repository
        this.bookRepository = bookRepository;
    }

    //so when this app gets a request to /books, it's going to execute the "getBooks" method, which is going to return the books in the repository
    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books", bookRepository.findAll());
        return "books";
    }

    //model that has the books attribute will now be sent to the "view" for this app, so that the books can be made visible to requests

}
