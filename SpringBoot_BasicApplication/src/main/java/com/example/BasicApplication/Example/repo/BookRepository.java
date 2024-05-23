package com.example.BasicApplication.Example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BasicApplication.Example.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
