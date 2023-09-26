package com.example.booksSale.Service;

import java.time.LocalDate;
import java.util.List;

import com.example.booksSale.Model.BooksaleDto;

public interface BooksaleService {
	
	public void addBooks(BooksaleDto booksaleDto)throws Exception;
	public BooksaleDto getBooks(String nameoftheBook)throws Exception;
	public void updateBooks(String nameoftheBook,String typeoftheBook,LocalDate releaseDate,Double bookRating,Double bookPrice)throws Exception;
	public void deleteBooks(String nameoftheBook)throws Exception;
	public List<BooksaleDto> getallBooks()throws Exception;

}
