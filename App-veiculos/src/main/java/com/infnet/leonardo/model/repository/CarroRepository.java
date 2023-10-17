package com.infnet.leonardo.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infnet.leonardo.model.domain.Carro;


@Repository
public interface CarroRepository extends CrudRepository<Carro, Integer> {

	@Query("from Carro c where c.cliente.id = :userid")
	public List<Carro> obterLista(Integer userid);
} 