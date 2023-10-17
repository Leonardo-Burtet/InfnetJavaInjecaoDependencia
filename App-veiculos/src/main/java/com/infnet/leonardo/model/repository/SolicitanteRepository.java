package com.infnet.leonardo.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infnet.leonardo.model.domain.Solicitante;

@Repository
public interface SolicitanteRepository extends CrudRepository<Solicitante, Integer> {

	@Query("from Solicitante s where s.cliente.id = :userid")
	public List<Solicitante> obterLista(Integer userid);
}