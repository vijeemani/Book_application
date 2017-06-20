package com.rev.pubhub.jsp;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rev.pubhub.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
