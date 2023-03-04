package com.biblioteca.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.entity.Libro;
import com.biblioteca.repository.ILibroRepository;

@Service
public class LibroService {
	@Autowired
	ILibroRepository iLibroRepository;
	
	//save libro
	public Libro saveLibro(Libro libro) {
		return iLibroRepository.save(libro);
	}
	
	//find all	
	public Iterable<Libro> returnallLibros(){
		return iLibroRepository.findAll();
	}
	
	//find by id
	public Libro findbyidLibro(Integer id) {
		return iLibroRepository.findById(id).orElse(null);
	}
	//return total records
	public Long recordstotalLibro() {		
		return iLibroRepository.count();
	}
			
	//delete records by id	
	public String deletebyidLibro(Integer id) {
		
		if (iLibroRepository.existsById(id)) {
			iLibroRepository.deleteById(id);			
			return "Libro Borrado Con Exito";
		}else {
			return "Error Al Borrar Libro";
		}
	}
	
	// find by titulo	
	public Libro findbytituloLibro(String titulo){
		return iLibroRepository.findByTitulo(titulo).orElse(null);
	}
	
	//return boolean if  existed id
	public boolean returnpresentidLibro(Integer id) {
		if (iLibroRepository.existsById(id)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//find by nombre autor
	/*public Optional<Libro> findbynameAutor(String nombre){
		return iLibroRepository.findByNombreAutor(nombre);
	}*/

}
