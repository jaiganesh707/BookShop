package com.example.booksSale.Entity;

import java.time.LocalDate;

import com.example.booksSale.Model.BooksaleDto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="sale_book")
public class BookSale {
	@Id
	private String nameoftheBook;
	private String typeoftheBook;
	private LocalDate releaseDate;
	private Double bookRating;
	private Double bookPrice;

	public static BooksaleDto booksaleDto(BookSale bookSale) {
		
		BooksaleDto booksaleDto=new BooksaleDto();
		booksaleDto.setNameoftheBook(bookSale.getNameoftheBook());
		booksaleDto.setTypeoftheBook(bookSale.getTypeoftheBook());
		booksaleDto.setReleaseDate(bookSale.getReleaseDate());
		booksaleDto.setBookRating(bookSale.getBookRating());
		booksaleDto.setBookPrice(bookSale.getBookPrice());
		return booksaleDto;
	}
}
