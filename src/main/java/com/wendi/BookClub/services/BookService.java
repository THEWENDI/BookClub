package com.wendi.BookClub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wendi.BookClub.models.Book;
import com.wendi.BookClub.repositories.BookRepository;

@Service
public class BookService {
	
    @Autowired
    private BookRepository bookRepo;
    
    //get all
    public List<Book> allBooks() {
        return bookRepo.findAll();
    }
    
    //get one
    public Book oneBook(Long id) {
        Optional<Book> potentialBook = bookRepo.findById(id);
        if(potentialBook.isPresent()) {
            return potentialBook.get();
        }else {
        	return null;
        }
    }
    
    //create
    public Book saveBook(Book book) {
        return bookRepo.save(book);
    }
	
    //update
    public Book updateBook(Book book) {
        return bookRepo.save(book);
    }
    
    //delete
    public void deleteBook(Long id) {
    	bookRepo.deleteById(id);
    }
	

}
