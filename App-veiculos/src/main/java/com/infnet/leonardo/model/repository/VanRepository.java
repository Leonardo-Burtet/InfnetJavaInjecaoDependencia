package com.infnet.leonardo.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infnet.leonardo.model.domain.Van;

@Repository
public interface VanRepository extends CrudRepository<Van, Integer> {

	@Query("from Van v where v.cliente.id = :userid")
	public List<Van> obterLista(Integer userid);
}