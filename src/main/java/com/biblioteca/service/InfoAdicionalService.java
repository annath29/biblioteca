package com.biblioteca.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.entity.InfoAdicional;
import com.biblioteca.repository.IInfoAdicionalRepository;

@Service
public class InfoAdicionalService {
	@Autowired IInfoAdicionalRepository infoAdicionalRepository;
	
	//save entity
	public InfoAdicional saveinfo(InfoAdicional infoAdicional) {
		return infoAdicionalRepository.save(infoAdicional);
	}
	
	//find by id
	public InfoAdicional bringInfoAdicionalbyid(Integer id) {
		return infoAdicionalRepository.findById(id).orElse(null);
	}
	
	//return all
	public Iterable<InfoAdicional> returnAllInfoAdicionals(){
		return  infoAdicionalRepository.findAll();
	}
	
	//return total records
	public Long recordstotal() {		
		return infoAdicionalRepository.count();
	}
	
	//delete records by id
	
	public String deletebyidInfoAdicional(Integer id) {
		if (infoAdicionalRepository.existsById(id)) {
			infoAdicionalRepository.deleteById(id);
			return "Borrada con Exito";
		}else {
			return "Error al Borrar";
		}
	}
	//return boolean if  existed id
	public boolean returnpresentidInfoAdicional(Integer id) {
		if (infoAdicionalRepository.existsById(id)) {
			return true;
		}
		else {
			return false;
		}
	}
}
