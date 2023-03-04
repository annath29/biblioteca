package com.biblioteca.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.entity.Editorial;

@Repository
public interface IEditorialRepository extends CrudRepository<Editorial, Integer> {

	/*@Query(value="SELECT e FROM Editoriales e WHERE e.nombre LIKE :letra%")
	public List<Editorial> searchEditorialByLetterName(@Param("letra")String letra);*/
}
