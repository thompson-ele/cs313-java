package edu.cs313.byui.week12;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Ele Thompson
 */
public class Tester {
    public static void main(String[] args) {
        // Create an instance of the the Entity Manager Factory
        // Handles all the persistence stuff for us yassss
        // .createEntityManagerFactory(name of persistence unit defined in persistence.xml)
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("week12Jpa");
        EntityManager em = emf.createEntityManager();
        
        // Add genre's to the Genre table
//        em.getTransaction().begin();
//        Genre genre = em.find(Genre.class, 2);
//        Book newbook = em.find(Book.class, 5);
//        newbook.setGenre(genre);
//        
//        em.persist(newbook);
//        em.getTransaction().commit();
        
//        // ADDING A NEW BOOK
//        em.getTransaction().begin();
//        Book newBook = new Book();
//        newBook.setTitle("BOOK TITLE GOES HERE");
//        
//        // Get the first author in our database
//        // Can be changed to whichever author you want
//        Author firstAuthor = em.find(Author.class, 1);
//        newBook.setAuthor(firstAuthor);
//        em.persist(newBook);
//        em.getTransaction().commit();
        
        // Create a query for all Authors
        // Persistence will also grab related data from the Book table
        Query authorQuery = em.createQuery("SELECT a FROM Author a");
        
        // Store results in a list
        List<Author> authors = authorQuery.getResultList();
        
        // For each author print out their name
        for(Author author : authors) {
            System.out.println("Author:" + author.getFullName());
            
            // Print out all the author's books
            for(Book book : author.getBooks()) {
                System.out.println("\t Book: " + book.getTitle() + "\t Genre: " + book.getGenre().getName());
            }
        }
        
        em.close();
    }
}
