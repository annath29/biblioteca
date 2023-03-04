package com.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.entity.InfoAdicional;
import com.biblioteca.service.InfoAdicionalService;

@RestController
@RequestMapping("api-info")
public class InfoAdicionalController {
	@Autowired
	InfoAdicionalService infoAdicionalService;
	
	@PostMapping("/create")
	public InfoAdicional createinfo(@RequestBody InfoAdicional infoAdicional) {
		return infoAdicionalService.saveinfo(infoAdicional);
	}
	
	@GetMapping("/id")
	public InfoAdicional bringbyid(Integer id) {
		return infoAdicionalService.bringInfoAdicionalbyid(id);
	}
	
	@GetMapping("/all")
	public Iterable<InfoAdicional> allInfoAdicionals(){
		return  infoAdicionalService.returnAllInfoAdicionals();
	}
	
	@GetMapping("/total")
	public Long totalInfo() {		
		return infoAdicionalService.recordstotal();
	}
	
	@DeleteMapping("/delete")	
	public String deletebyidInfoAdicional(Integer id) {
		return infoAdicionalService.deletebyidInfoAdicional(id);
	}
	
	@GetMapping("/ifpresent")
	public boolean presentIdInfoAdicional(Integer id) {
		return infoAdicionalService.returnpresentidInfoAdicional(id);
	}

}
