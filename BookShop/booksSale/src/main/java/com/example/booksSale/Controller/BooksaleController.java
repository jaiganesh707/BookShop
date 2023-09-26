package com.example.booksSale.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.booksSale.Model.BooksaleDto;
import com.example.booksSale.Service.BooksaleService;

@RestController
@RequestMapping("/booksale")
public class BooksaleController {

	@Autowired
	private BooksaleService booksaleService;
	
	@GetMapping("/getbook")
	public ResponseEntity<BooksaleDto> entity(@RequestParam ("nameoftheBook")String nameoftheBook)throws Exception{
		
		BooksaleDto booksaleDto=booksaleService.getBooks(nameoftheBook);		
		ResponseEntity<BooksaleDto> responseEntity=new ResponseEntity<>(booksaleDto, HttpStatus.OK);
		return responseEntity;
		
	}
	

}
