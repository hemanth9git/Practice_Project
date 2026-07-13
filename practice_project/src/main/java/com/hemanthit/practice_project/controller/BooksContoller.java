package com.hemanthit.practice_project.controller;

import com.hemanthit.practice_project.model.Books;
import com.hemanthit.practice_project.serviceImpl.BooksServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("books")
@AllArgsConstructor
public class BooksContoller {

    BooksServiceImpl service;

    @PostMapping("addBook")
    public ResponseEntity<Books> addBook(@RequestBody Books book){
        com.hemanthit.practice_project.model.Books addedBook =service.addBook(book);
        return new ResponseEntity<>(addedBook, HttpStatus.CREATED);
    }

    @PutMapping("updateBook")
    public ResponseEntity<Books> updateBook(@RequestBody Books book){
        com.hemanthit.practice_project.model.Books updatedBook =service.updateBook(book);
        return new ResponseEntity<>(updatedBook,HttpStatus.OK);
    }

    @DeleteMapping("deleteBook/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Integer id){
        String message=service.deleteBook(id);
        return new ResponseEntity<>(message,HttpStatus.OK);
    }

    @GetMapping("getBooksLess500")
    public ResponseEntity<List<Books>> lessThan500(@RequestParam Double price){
        List<Books> booksList=service.lessThan500(price);
        return new ResponseEntity<>(booksList,HttpStatus.OK);
    }
}

