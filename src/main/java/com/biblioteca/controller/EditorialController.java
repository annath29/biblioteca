package com.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.entity.Editorial;
import com.biblioteca.service.EditorialService;

@RestController
@RequestMapping("/api-editorial")
public class EditorialController {
	@Autowired
	EditorialService editorialService;
	
	@PostMapping("/create")
	public Editorial createEditorial(@RequestBody Editorial editorial) {
		return editorialService.saveEditorial(editorial);
	}
	
	@GetMapping("/all")
	public Iterable<Editorial> allEditoriales(){
		return editorialService.returnallEditoriales();
	}
	
	@GetMapping("/id")
	public Editorial findbyid(Integer id) {
		return editorialService.findbyidEditorial(id);
	}
	
	@GetMapping("/total")
	public Long totalEditoriales() {		
		return editorialService.recordstotalEditorial();
	}
			
	@DeleteMapping("/delete")	
	public String deletebyidEditorial(Integer id) {
		return editorialService.deletebyidEditorial(id);
	}
	
	@GetMapping("/ifpresent")
	public boolean presentidEditorial(Integer id) {
		return editorialService.returnpresentidEditorial(id);
	}
	
	//find by name
	/*public List<Editorial> findbynameletter(char letra) {
		return iEditorialRepository.searchEditorialByLetterName(letra);
	}*/

}
