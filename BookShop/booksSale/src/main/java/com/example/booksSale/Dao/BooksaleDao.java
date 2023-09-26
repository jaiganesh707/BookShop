package com.example.booksSale.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.booksSale.Entity.BookSale;
@Repository
public interface BooksaleDao extends CrudRepository<BookSale, String>{

}
