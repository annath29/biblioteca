package com.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.entity.Editorial;
import com.biblioteca.repository.IEditorialRepository;

@Service
public class EditorialService {
	@Autowired
	IEditorialRepository iEditorialRepository;
	
	//save editorial
	public Editorial saveEditorial(Editorial editorial) {
		return iEditorialRepository.save(editorial);
	}
	
	//find all	
	public Iterable<Editorial> returnallEditoriales(){
		return iEditorialRepository.findAll();
	}
	
	//find by id
	public Editorial findbyidEditorial(Integer id) {
		return iEditorialRepository.findById(id).orElse(null);
	}
	//return total records
	public Long recordstotalEditorial() {		
		return iEditorialRepository.count();
	}
			
	//delete records by id	
	public String deletebyidEditorial(Integer id) {
		
		if (iEditorialRepository.existsById(id)) {
			iEditorialRepository.deleteById(id);			
			return "Editorial Borrada Con Exito";
		}else {
			return "Editorial Al Borrar Libro";
		}
	}
	
	//return boolean if  existed id
	public boolean returnpresentidEditorial(Integer id) {
		if (iEditorialRepository.existsById(id)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//find by name
	/*public List<Editorial> findbynameletter(char letra) {
		return iEditorialRepository.searchEditorialByLetterName(letra);
	}*/
}
