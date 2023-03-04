package com.biblioteca.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.entity.InfoAdicional;

@Repository
public interface IInfoAdicionalRepository extends CrudRepository<InfoAdicional, Integer> {

}
