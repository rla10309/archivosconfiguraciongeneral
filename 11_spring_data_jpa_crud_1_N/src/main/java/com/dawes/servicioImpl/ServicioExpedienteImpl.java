package com.dawes.servicioImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.ExpedienteVO;
import com.dawes.repositorios.ExpedienteRepositorio;
import com.dawes.servicios.ServicioExpediente;

@Service
public class ServicioExpedienteImpl implements ServicioExpediente {
	@Autowired
	private ExpedienteRepositorio er;

	@Override
	public <S extends ExpedienteVO> S save(S entity) {
		return er.save(entity);
	}

	public Optional<ExpedienteVO> findByNumexpediente(String numexpediente) {
		return er.findByNumexpediente(numexpediente);
	}

	@Override
	public <S extends ExpedienteVO> Iterable<S> saveAll(Iterable<S> entities) {
		return er.saveAll(entities);
	}

	@Override
	public Optional<ExpedienteVO> findById(Integer id) {
		return er.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return er.existsById(id);
	}

	@Override
	public Iterable<ExpedienteVO> findAll() {
		return er.findAll();
	}

	@Override
	public Iterable<ExpedienteVO> findAllById(Iterable<Integer> ids) {
		return er.findAllById(ids);
	}

	@Override
	public long count() {
		return er.count();
	}

	@Override
	public void deleteById(Integer id) {
		er.deleteById(id);
	}

	@Override
	public void delete(ExpedienteVO entity) {
		er.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		er.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends ExpedienteVO> entities) {
		er.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		er.deleteAll();
	}
	
	

}
