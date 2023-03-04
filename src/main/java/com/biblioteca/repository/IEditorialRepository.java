package com.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.entity.Editorial;

@Repository
public interface IEditorialRepository extends CrudRepository<Editorial, Integer> {

	/*@Query(value="select * from Editoriales where nombreEditorial like ?")
	public List<Editorial> searchEditorialByLetterName(char letra);*/
}
