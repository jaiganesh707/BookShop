package com.example.booksSale.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.booksSale.Dao.BooksaleDao;
import com.example.booksSale.Entity.BookSale;
import com.example.booksSale.Model.BooksaleDto;
@Service
public class BooksaleServiceImpl implements BooksaleService {
	
	@Autowired
	private BooksaleDao booksaleDao;

	@Override
	public void addBooks(BooksaleDto booksaleDto) throws Exception {
		// TODO Auto-generated method stub
		BookSale bookSale=BooksaleDto.bookSale(booksaleDto);
		booksaleDao.save(bookSale);
		
	}

	@Override
	public BooksaleDto getBooks(String nameoftheBook) throws Exception {
		// TODO Auto-generated method stub
		Optional<BookSale> entityStore=booksaleDao.findById(nameoftheBook);
		BookSale bookSale=entityStore.get();
		BooksaleDto booksaleDto=BookSale.booksaleDto(bookSale);		
		return booksaleDto;
	}

	@Override
	public void updateBooks(String nameoftheBook,String typeoftheBook,LocalDate releaseDate,Double bookRating,Double bookPrice)throws Exception {
		// TODO Auto-generated method stub
		
		Optional<BookSale> entityStore=booksaleDao.findById(nameoftheBook);
		BookSale bookSale=entityStore.get();
		bookSale.setNameoftheBook(nameoftheBook);
		bookSale.setTypeoftheBook(typeoftheBook);
		bookSale.setReleaseDate(releaseDate);
		bookSale.setBookRating(bookRating);
		bookSale.setBookPrice(bookPrice);		
		booksaleDao.save(bookSale);
	}

	@Override
	public void deleteBooks(String nameoftheBook) throws Exception {
		// TODO Auto-generated method stub
		Optional<BookSale> entityStore=booksaleDao.findById(nameoftheBook);
		BookSale bookSale=entityStore.get();
		booksaleDao.delete(bookSale);
	}

	@Override
	public List<BooksaleDto> getallBooks() throws Exception {
		// TODO Auto-generated method stub
		List<BooksaleDto> list=new ArrayList<>();
		Iterable<BookSale> entityStore=booksaleDao.findAll();
		for(BookSale bookSale:entityStore) {
			BooksaleDto booksaleDto=BookSale.booksaleDto(bookSale);
			list.add(booksaleDto);
		}
		return list;
	}

}
