package com.biblioteca.repository;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.entity.Libro;

@Repository
public interface ILibroRepository extends CrudRepository<Libro, Integer> {
	
	public Optional<Libro> findByTitulo(String titulo);
	
	/*@Query(value="SELECT L FROM Libros L join autor_libro a where a.nombre =:nombreAutor")
	public List<Libro> findByNombreAutor(@Param("nombreAutor")String nombreAutor);*/
}
