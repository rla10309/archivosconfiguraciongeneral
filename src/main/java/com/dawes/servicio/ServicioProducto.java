package com.dawes.servicio;

import java.util.List;
import java.util.Optional;

import com.dawes.modelo.ProductoVO;
import com.dawes.modelo.UsuarioVO;

public interface ServicioProducto {
	
	 Optional<List<ProductoVO>> findByComprador(String nombre);

	<S extends ProductoVO> S save(S entity);

	<S extends ProductoVO> Iterable<S> saveAll(Iterable<S> entities);

	Optional<ProductoVO> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<ProductoVO> findAll();

	Iterable<ProductoVO> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(ProductoVO entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	void deleteAll(Iterable<? extends ProductoVO> entities);

	void deleteAll();

}