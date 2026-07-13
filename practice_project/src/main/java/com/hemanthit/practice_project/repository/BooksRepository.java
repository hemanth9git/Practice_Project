package com.hemanthit.practice_project.repository;

import com.hemanthit.practice_project.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BooksRepository extends JpaRepository<Books,Integer> {

    public List<Books> findByPriceLessThan(Double price);
}
