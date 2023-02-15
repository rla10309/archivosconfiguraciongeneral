package com.dawes.servicios;

import java.util.Optional;

import com.dawes.modelo.ExpedienteVO;

public interface ServicioExpediente {

	<S extends ExpedienteVO> S save(S entity);

	<S extends ExpedienteVO> Iterable<S> saveAll(Iterable<S> entities);

	Optional<ExpedienteVO> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<ExpedienteVO> findAll();

	Iterable<ExpedienteVO> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(ExpedienteVO entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	void deleteAll(Iterable<? extends ExpedienteVO> entities);

	void deleteAll();
	
	Optional<ExpedienteVO> findByNumexpediente(String numexpediente);

}