package com.hemanthit.practice_project.serviceImpl;

import com.hemanthit.practice_project.model.Books;
import com.hemanthit.practice_project.repository.BooksRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BooksServiceImpl {

    BooksRepository repository;


    public Books addBook(Books book) {
      return repository.save(book);
    }

    public Books updateBook(Books book) {
        return repository.save(book);
    }

    public String deleteBook(Integer id) {
        repository.deleteById(id);
        return "Deleted Id is "+id;
    }

    public List<Books> lessThan500(Double price) {

         return repository.findByPriceLessThan(500.00);
    }
}
