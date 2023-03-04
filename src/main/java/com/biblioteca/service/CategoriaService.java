package com.biblioteca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.entity.Categoria;
import com.biblioteca.repository.ICategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	ICategoriaRepository iCategoriaRepository;
	
	//save 
	public Categoria saveCategoria(Categoria categoria) {
		return iCategoriaRepository.save(categoria);
	}
	
	//find all	
	public Iterable<Categoria> returnallCategoria(){
		return iCategoriaRepository.findAll();
	}
	
	//find by id
	public Categoria findbyidCategoria(Integer id) {
		return iCategoriaRepository.findById(id).orElse(null);
	}
	
	//delete records by id	
	public String deletebyidCategoria(Integer id) {
		if (iCategoriaRepository.existsById(id)) {
			iCategoriaRepository.deleteById(id);			
			return "Categoria Borrada Con Exito";
		}else {
			return "Error Al Borrar Categoria";
		}
	}	
	//return total records
	public Long recordstotalCategoria() {		
		return iCategoriaRepository.count();
	}
			
	//return boolean if  existed id
	public boolean returnpresentidCategoria(Integer id) {
		if (iCategoriaRepository.existsById(id)) {
			return true;
		}
		else {
			return false;
		}
	}
}
