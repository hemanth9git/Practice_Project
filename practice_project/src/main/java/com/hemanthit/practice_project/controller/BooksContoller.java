package com.hemanthit.practice_project.controller;

import com.hemanthit.practice_project.serviceImpl.BooksServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("books")
@AllArgsConstructor
public class BooksContoller {

    BooksServiceImpl service;
    
}

