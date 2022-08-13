package edu.clarape.al.allspfintrod.repositories;

import org.springframework.data.repository.CrudRepository;

import edu.clarape.al.allspfintrod.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{
    
}
