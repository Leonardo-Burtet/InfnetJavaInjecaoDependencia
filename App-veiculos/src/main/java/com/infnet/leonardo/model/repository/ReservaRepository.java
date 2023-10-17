package com.infnet.leonardo.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infnet.leonardo.model.domain.Reserva;


@Repository
public interface ReservaRepository extends CrudRepository<Reserva, Integer> {

	@Query("from Reserva r where r.cliente.id = :userid")
	public List<Reserva> obterLista(Integer userid);
} 