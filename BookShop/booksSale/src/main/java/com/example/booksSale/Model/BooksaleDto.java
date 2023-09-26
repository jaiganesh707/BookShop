package com.example.booksSale.Model;

import java.time.LocalDate;

import com.example.booksSale.Entity.BookSale;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BooksaleDto {
	
	private String nameoftheBook;
	private String typeoftheBook;
	private LocalDate releaseDate;
	private Double bookRating;
	private Double bookPrice;
	
	public static BookSale bookSale(BooksaleDto booksaleDto) {
		
		BookSale bookSale=new BookSale();
		bookSale.setNameoftheBook(booksaleDto.getNameoftheBook());
		bookSale.setTypeoftheBook(booksaleDto.getTypeoftheBook());
		bookSale.setReleaseDate(booksaleDto.getReleaseDate());
		bookSale.setBookRating(booksaleDto.getBookRating());
		bookSale.setBookPrice(booksaleDto.getBookPrice());
		return bookSale;	
	}

}
