package com.infnet.leonardo.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infnet.leonardo.model.domain.Moto;


@Repository
public interface MotoRepository extends CrudRepository<Moto, Integer> {

	@Query("from Moto m where m.cliente.id = :userid")
	public List<Moto> obterLista(Integer userid);
}