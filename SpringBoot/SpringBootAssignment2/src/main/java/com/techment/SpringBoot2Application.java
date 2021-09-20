package com.techment;

import com.techment.entity.Author;

import com.techment.entity.Book;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techment.dao.IAuthorDao;
import com.techment.dao.IBookDao;

@SpringBootApplication
public class SpringBoot2Application implements CommandLineRunner{

	
	@Autowired
	IBookDao iBookDao;

	@Autowired
	IAuthorDao iAuthorDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Hello this is my first spring boot");

     

	Author auth1 = new Author();
	Author  auth2 = new Author();
	auth1.setName("Morrismano");
	auth2.setName("James Gosling");
	//auth1.setAuthorId(1);
	//auth1.setAuthorId(2); 
	
	

	iAuthorDao.save(auth1);
	iAuthorDao.save(auth2);

		
	System.out.println("inserted");

	iBookDao.save(new Book("C", 20, auth1));
	iBookDao.save(new Book("Java", 30, auth2));
	


		System.out.println("********************");
		
		List<Book> products = iBookDao.findAll();
		products.forEach(System.out::println);

		System.out.println("********************");
		
		
		List<Book> books = iBookDao.findByAuthorName("Morrismano");
		books.forEach(System.out::println);


		System.out.println("********************");
		
		
		List<Book> books1 = iBookDao.findByPriceBetween(500, 800);
		books1.forEach(System.out::println);

        System.out.println("********************");
		
		
		Optional<Author> auths = iAuthorDao.findById(2);
		System.out.println(auths.get().getName()+" "+auths.get().getAuthorId());

		
	}

}
