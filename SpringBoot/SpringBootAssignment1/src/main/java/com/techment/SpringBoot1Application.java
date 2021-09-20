package com.techment;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.techment.dao.IAuthorDao;
import com.techment.entity.Author;


@SpringBootApplication
public class SpringBoot1Application implements CommandLineRunner {


	@Autowired
	IAuthorDao iAuthorDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Hello this is my first spring boot");

        Author author=new Author();
        //author.setAuthorId(17);
        author.setFirstName("Kumari");
        author.setLastName("sahu");
        author.setPhoneNo(6264678);
        
        iAuthorDao.save(author);
        System.out.println("inserted..");
        //iAuthorDao.deleteById(2);
	}
}	
	