package br.com.alura;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.Linguagem;

public interface Repository extends MongoRepository<Linguagem, String> {
    
}
