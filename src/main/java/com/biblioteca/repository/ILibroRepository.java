package com.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.entity.Libro;

@Repository
public interface ILibroRepository extends CrudRepository<Libro, Integer> {
	
	public List<Libro> findByTitulo(String titulo); 
	
	/*@Query(value="select * from Libros join autor_libro on Libros.id = autor_libro.libro_id join Autores on autor_libro.libro_id=Autores.id where Autores.nombre =?")
	public Optional<Libro> findByNombreAutor(String nombre);*/
}
