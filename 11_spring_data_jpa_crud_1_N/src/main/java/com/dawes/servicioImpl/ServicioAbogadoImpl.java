package com.dawes.servicioImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.AbogadoVO;
import com.dawes.repositorios.AbogadoRepositorio;
import com.dawes.servicios.ServicioAbogado;

@Service
public class ServicioAbogadoImpl implements ServicioAbogado {
	
	@Autowired
	private AbogadoRepositorio ar;
	
	public Optional<AbogadoVO> findByNif(String nif) {
		return ar.findByNif(nif);
	}

	public Optional<AbogadoVO> buscarAbogadoPorNifYExpedientes(String nif) {
		return ar.buscarAbogadoPorNifYExpedientes(nif);
	}

	@Override
	public <S extends AbogadoVO> S save(S entity) {
		return ar.save(entity);
	}

	@Override
	public <S extends AbogadoVO> Iterable<S> saveAll(Iterable<S> entities) {
		return ar.saveAll(entities);
	}

	@Override
	public Optional<AbogadoVO> findById(Integer id) {
		return ar.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return ar.existsById(id);
	}

	@Override
	public Iterable<AbogadoVO> findAll() {
		return ar.findAll();
	}

	@Override
	public Iterable<AbogadoVO> findAllById(Iterable<Integer> ids) {
		return ar.findAllById(ids);
	}

	@Override
	public long count() {
		return ar.count();
	}

	@Override
	public void deleteById(Integer id) {
		ar.deleteById(id);
	}

	@Override
	public void delete(AbogadoVO entity) {
		ar.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		ar.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends AbogadoVO> entities) {
		ar.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		ar.deleteAll();
	}
	
	
	

}
