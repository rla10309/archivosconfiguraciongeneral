package com.dawes.repositorio;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.dawes.modelo.UsuarioVO;

public interface UsuarioRepository extends CrudRepository<UsuarioVO, Integer> {
	Optional<UsuarioVO> findByDni(String dni);

}
