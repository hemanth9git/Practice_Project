package com.hemanthit.practice_project.serviceImpl;

import com.hemanthit.practice_project.repository.BooksRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BooksServiceImpl {

    BooksRepository repository;


}
