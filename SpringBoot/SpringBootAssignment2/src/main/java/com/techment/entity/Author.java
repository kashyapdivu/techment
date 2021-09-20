package com.techment.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="author501")
public class Author
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int authorId;
	String name;
	@OneToMany(mappedBy="author",cascade=CascadeType.ALL)
	List<Book> book;
	public Author(String name, List<Book> book) {
		super();
		
		this.name = name;
		this.book = book;
	}
	public Author() {
		super();
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
}
	
	