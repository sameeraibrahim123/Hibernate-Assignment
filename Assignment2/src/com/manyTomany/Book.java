package com.manyTomany;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="indian_book")
public class Book implements Serializable{
	@Id
	private int book_ISBN;
	private String book_title;
	private int book_price;

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="authors_book",joinColumns={@JoinColumn(name="book_ISBN")},inverseJoinColumns={@JoinColumn(name="authorId")})

	Set<Author> authors;

	public int getBook_ISBN() {
		return book_ISBN;
	}




	public void setBook_ISBN(int book_ISBN) {
		this.book_ISBN = book_ISBN;
	}




	public String getBook_title() {
		return book_title;
	}




	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}




	public int getBook_price() {
		return book_price;
	}




	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}


	public Set<Author> getAuthors() {
		return authors;
	}




	public void setAuthor(Set<Author> authors) {
		this.authors = authors;
	}




	private static final long serialVersionUID = 1L;

}