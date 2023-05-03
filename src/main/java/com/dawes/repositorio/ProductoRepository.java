package com.dawes.repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dawes.modelo.ProductoVO;
import com.dawes.modelo.UsuarioVO;

public interface ProductoRepository extends CrudRepository<ProductoVO, Integer> {
	@Query("select p from ProductoVO p where p.comprador.nombre=?1")
	Optional<List<ProductoVO>> findByComprador(String nombre);

}
