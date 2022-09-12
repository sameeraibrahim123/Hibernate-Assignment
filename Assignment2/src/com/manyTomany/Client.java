package com.manyTomany;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		Set<Author> at=new HashSet<Author>();
		Set<Book> bk=new HashSet<Book>();

		Book o1=new Book();
		o1.setBook_ISBN(505);
		o1.setBook_title("One Indian Girl");
		o1.setBook_price(1000);
		o1.setAuthor(at);

		Book o2=new Book();
		o2.setBook_ISBN(506);
		o2.setBook_title("A Million Thoughts");
		o2.setBook_price(1500);
		o2.setAuthor(at);


		bk.add(o1);
		bk.add(o2);

		Author p1=new Author();
		p1.setAuthorId(001);
		p1.setAuthorName("R.K. Narayan");
		p1.setBook(bk);
		
		Author p2=new Author();
		p2.setAuthorId(002);
		p2.setAuthorName("Aamir Ali");
		p2.setBook(bk);


		
		at.add(p1);
		at.add(p2);

		em.persist(p1);
		em.persist(p2);
		em.persist(o1);
		em.persist(o2);

		em.getTransaction().commit();
		System.out.println("Author and Book record added");

		em.close();
		factory.close();

	}

}

