package com.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.entity.Libro;
import com.biblioteca.service.LibroService;

@RestController
@RequestMapping("/api-libro")
public class LibroController {
	@Autowired
	LibroService libroService;
	
	@PostMapping("/create")
	public Libro createLibro(@RequestBody Libro libro) {
		return libroService.saveLibro(libro);
	}
	
	@GetMapping("/all")
	public Iterable<Libro> allLibros(){
		return libroService.returnallLibros();
	}
	@GetMapping("/id")
	public Libro findbyid(Integer id) {
		return libroService.findbyidLibro(id);
	}
	
	@GetMapping("/size")
	public Long recordstotal() {		
		return libroService.recordstotalLibro();
	}
			
	@DeleteMapping("/delete")
	public String deletebyid(Integer id) {
		return libroService.deletebyidLibro(id);
	}
	
	@GetMapping("/trae-titulo")	
	public Libro findByTitulo(String titulo){
		return libroService.findbytituloLibro(titulo);
	}
	
	@GetMapping("/ifpresent")
	public boolean returnpresentidLibro(Integer id) {
		return libroService.returnpresentidLibro(id);
	}
	
	
	/*public Optional<Libro> findbynameAutor(String nombre){
		return iLibroRepository.findByNombreAutor(nombre);
	}*/

}
