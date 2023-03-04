package com.biblioteca.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Autores")
public class Autor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;	
	private String nombre;
	
	@ManyToMany
	@JoinTable(name="autor_libro",
		joinColumns = @JoinColumn(name="autor_id"),
		inverseJoinColumns = @JoinColumn(name ="libro_id")
	)
	private List<Libro> libros;
	
	//getter and setter------------------------------------------------------------------------
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	
	
}
