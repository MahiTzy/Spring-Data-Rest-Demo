package com.test.datarest.datarestdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.datarest.datarestdemo.entities.Book;
import com.test.datarest.datarestdemo.repositories.BookRepo;

@SpringBootApplication
public class DatarestdemoApplication implements CommandLineRunner {

	@Autowired
	private BookRepo bookRepo;
	public static void main(String[] args) {
		SpringApplication.run(DatarestdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		bookRepo.save(new Book("Java", "Java Programming", "James Gosling", "500"));
		bookRepo.save(new Book("Python", "Python Programming", "Guido van Rossum", "300"));
		bookRepo.save(new Book("C++", "C++ Programming", "Bjarne Stroustrup", "400"));
		bookRepo.save(new Book("C", "C Programming", "Dennis Ritchie", "200"));
		bookRepo.save(new Book("C#", "C# Programming", "Anders Hejlsberg", "350"));
		bookRepo.save(new Book("Ruby", "Ruby Programming", "Yukihiro Matsumoto", "250"));
		bookRepo.save(new Book("JavaScript", "JavaScript Programming", "Brendan Eich", "450"));
		bookRepo.save(new Book("PHP", "PHP Programming", "Rasmus Lerdorf", "150"));
		bookRepo.save(new Book("Swift", "Swift Programming", "Chris Lattner", "100"));
		bookRepo.save(new Book("Kotlin", "Kotlin Programming", "JetBrains", "50"));
		bookRepo.save(new Book("Rust", "Rust Programming", "Graydon Hoare", "75"));
		bookRepo.save(new Book("Go", "Go Programming", "Robert Griesemer", "25"));
		bookRepo.save(new Book("Scala", "Scala Programming", "Martin Odersky", "125"));
		bookRepo.save(new Book("Perl", "Perl Programming", "Larry Wall", "175"));
		bookRepo.save(new Book("Haskell", "Haskell Programming", "Simon Peyton Jones", "225"));
		bookRepo.save(new Book("Lua", "Lua Programming", "Roberto Ierusalimschy", "275"));
		bookRepo.save(new Book("R", "R Programming", "Ross Ihaka", "325"));
		bookRepo.save(new Book("TypeScript", "TypeScript Programming", "Anders Hejlsberg", "375"));
		bookRepo.save(new Book("Dart", "Dart Programming", "Lars Bak", "425"));
		bookRepo.save(new Book("Objective-C", "Objective-C Programming", "Brad Cox", "475"));
	}

}
