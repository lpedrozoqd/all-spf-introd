package edu.clarape.al.allspfintrod.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.clarape.al.allspfintrod.domain.Author;
import edu.clarape.al.allspfintrod.domain.Book;
import edu.clarape.al.allspfintrod.domain.Publisher;
import edu.clarape.al.allspfintrod.repositories.AuthorRepository;
import edu.clarape.al.allspfintrod.repositories.BookRepository;
import edu.clarape.al.allspfintrod.repositories.PublisherRepository;

@Component
public class BootstrapData implements CommandLineRunner{
    
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;
    


    
    public BootstrapData(AuthorRepository authorRepository, 
            BookRepository bookRepository,
            PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }




    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Driven Design", "123456");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author red = new Author("Red","Johnson");
        Book noEJB = new Book("J2EE development without J2EE", "67890");
        red.getBooks().add(noEJB);
        noEJB.getAuthors().add(red);

        authorRepository.save(red);
        bookRepository.save(noEJB);

        System.out.println(">>>>>>> Iniciando brootstap ");
        System.out.println("###### Números de libors: " +  bookRepository.count());

        Publisher planeta = new Publisher("Calle 00 # 3-45","Bogotá D.C.","Cundinamarca","18002");
        publisherRepository.save(planeta);
        System.out.println("###### Números de Publicadores: " +  publisherRepository.count());


    }
    
}
