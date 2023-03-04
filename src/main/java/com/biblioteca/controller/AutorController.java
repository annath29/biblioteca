package com.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.entity.Autor;
import com.biblioteca.service.AutorService;

@RestController
@RequestMapping("/api-Autor")
public class AutorController {
	@Autowired
	AutorService autorService;
	
	@PostMapping("/create")
	public Autor createAutor(@RequestBody Autor autor) {
		return autorService.saveAutor(autor);
	}
	
	@GetMapping("/find-id")
	public  Autor findbyidAutor(Integer id) {
		return autorService.bringbyidAutor(id);
	}
	
	@GetMapping("/all")
	public Iterable<Autor> allAutores(){
		return autorService.returnallAutores();
	}
		
	@GetMapping("/total")
	public Long totalAutores() {		
		return autorService.recordstotalAutor();
	}
			
	@DeleteMapping("/delete")	
	public String deletebyidAutor(Integer id) {
		return autorService.deletebyidAutor(id);
	}	
	
	@GetMapping("/ifpresent")
	public boolean returnpresentidAutor(Integer id) {
		return autorService.returnpresentidAutor(id);
	}

}
