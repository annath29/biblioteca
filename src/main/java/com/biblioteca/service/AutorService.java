package com.biblioteca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.entity.Autor;
import com.biblioteca.repository.IAutorRepository;

@Service
public class AutorService {
	@Autowired
	IAutorRepository iAutorRepository;
	
	//save entity
	public Autor saveAutor(Autor autor) {
		return iAutorRepository.save(autor);
	}
	
	//find by id
	public  Autor bringbyidAutor(Integer id) {
		return iAutorRepository.findById(id).orElse(null);
	}
	
	//return all
	public Iterable<Autor> returnallAutores(){
		return  iAutorRepository.findAll();
	}
		
	//return total records
	public Long recordstotalAutor() {		
		return iAutorRepository.count();
	}
			
	//delete records by id
	public String deletebyidAutor(Integer id) {
		if (iAutorRepository.existsById(id)) {
			iAutorRepository.deleteById(id);
			return "Autor Borrado Con Exito";
		}else {
			return "Error Al Borrar Autor";
		}
	}
	
	//return boolean if  existed id
	public boolean returnpresentidAutor(Integer id) {
		if (iAutorRepository.existsById(id)) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
