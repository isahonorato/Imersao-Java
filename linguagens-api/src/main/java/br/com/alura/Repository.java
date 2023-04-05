package br.com.alura;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.Linguagem;

public interface Repository extends MongoRepository<Linguagem, String> {
    List<Linguagem> findByOrderByRanking();
}
