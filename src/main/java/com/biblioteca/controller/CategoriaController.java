package com.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.entity.Categoria;
import com.biblioteca.service.CategoriaService;

@RestController
@RequestMapping("/api-categoria")
public class CategoriaController {
	@Autowired
	CategoriaService categoriaService;
	
	@PostMapping("/create")
	public Categoria createCategoria(@RequestBody Categoria categoria) {
		return categoriaService.saveCategoria(categoria);
	}
	
	@GetMapping("/all")	
	public Iterable<Categoria> allCategoria(){
		return categoriaService.returnallCategoria();
	}
	
	@GetMapping("/id")
	public Categoria findbyid(Integer id) {
		return categoriaService.findbyidCategoria(id);
	}
	
	@DeleteMapping("/delete")
	public String deletebyid(Integer id) {
		return categoriaService.deletebyidCategoria(id);
	}	
	
	@GetMapping("/total")
	public Long recordstotal() {		
		return categoriaService.recordstotalCategoria();
	}
			
	@GetMapping("/ifpresent")
	public boolean presentidCategoria(Integer id) {
		return categoriaService.returnpresentidCategoria(id);
	}

}
