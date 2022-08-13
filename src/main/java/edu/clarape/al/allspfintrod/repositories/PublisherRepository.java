package edu.clarape.al.allspfintrod.repositories;

import org.springframework.data.repository.CrudRepository;

import edu.clarape.al.allspfintrod.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
    
}
