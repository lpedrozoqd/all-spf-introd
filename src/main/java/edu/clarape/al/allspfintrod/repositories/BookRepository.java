package edu.clarape.al.allspfintrod.repositories;

import org.springframework.data.repository.CrudRepository;

import edu.clarape.al.allspfintrod.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long>{
    
}
