package com.biblioteca.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.entity.Categoria;
@Repository
public interface ICategoriaRepository extends CrudRepository<Categoria, Integer> {

}
