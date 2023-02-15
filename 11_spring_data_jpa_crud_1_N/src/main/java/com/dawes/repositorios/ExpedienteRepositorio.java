package com.dawes.repositorios;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.ExpedienteVO;

@Repository
public interface ExpedienteRepositorio extends CrudRepository<ExpedienteVO, Integer> {
	Optional<ExpedienteVO> findByNumexpediente(String numexpediente);

}
