package com.dawes.servicioImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.ProductoVO;
import com.dawes.modelo.UsuarioVO;
import com.dawes.repositorio.ProductoRepository;
import com.dawes.servicio.ServicioProducto;

@Service
public class ServicioProductoImpl implements ServicioProducto {
	
	@Autowired
	ProductoRepository pr;

	@Override
	public <S extends ProductoVO> S save(S entity) {
		return pr.save(entity);
	}

	@Override
	public <S extends ProductoVO> Iterable<S> saveAll(Iterable<S> entities) {
		return pr.saveAll(entities);
	}

	@Override
	public Optional<ProductoVO> findById(Integer id) {
		return pr.findById(id);
	}

	public Optional<List<ProductoVO>> findByComprador(String nombre) {
		return pr.findByComprador(nombre);
	}

	@Override
	public boolean existsById(Integer id) {
		return pr.existsById(id);
	}

	@Override
	public Iterable<ProductoVO> findAll() {
		return pr.findAll();
	}

	@Override
	public Iterable<ProductoVO> findAllById(Iterable<Integer> ids) {
		return pr.findAllById(ids);
	}

	@Override
	public long count() {
		return pr.count();
	}

	@Override
	public void deleteById(Integer id) {
		pr.deleteById(id);
	}

	@Override
	public void delete(ProductoVO entity) {
		pr.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		pr.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends ProductoVO> entities) {
		pr.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		pr.deleteAll();
	}
	
	

}
