package com.dawes.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.AbogadoVO;

@Repository
public interface AbogadoRepositorio extends CrudRepository<AbogadoVO, Integer> {
	Optional<AbogadoVO> findByNif(String nif);
	
	@Query("select a from AbogadoVO a JOIN FETCH a.expedientes e where a.nif=?1")
	Optional<AbogadoVO> buscarAbogadoPorNifYExpedientes(String nif);

}
