package com.infnet.leonardo.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infnet.leonardo.model.domain.Veiculo;

@Repository
public interface VeiculoRepository extends CrudRepository<Veiculo, Integer> {

	@Query("from Veiculo ve where ve.cliente.id = :userid")
	public List<Veiculo> obterLista(Integer userid);
}  