package com.biblioteca.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.entity.Autor;
@Repository
public interface IAutorRepository extends CrudRepository<Autor,Integer>{

}
