package com.dawes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dawes.modelo.AbogadoVO;
import com.dawes.modelo.ExpedienteVO;
import com.dawes.servicios.ServicioAbogado;
import com.dawes.servicios.ServicioExpediente;

@SpringBootTest
class TestDespacho {

	@Autowired
	ServicioAbogado sa;
	@Autowired
	ServicioExpediente se;
	
	
	@Test
	public void test01() {
		assertNotNull(sa.save(new AbogadoVO("Abogado1", "111", new ArrayList<ExpedienteVO>())));
		assertNotNull(sa.save(new AbogadoVO("Abogado2", "222", new ArrayList<ExpedienteVO>())));
	}
	@Test
	public void test02() {
		assertNotNull(se.save(new ExpedienteVO(LocalDate.now(), "Exp1", "Cliente1", "expropiación", sa.findByNif("222").get())));
		assertNotNull(se.save(new ExpedienteVO(LocalDate.now(), "Exp2", "Cliente1", "divorcio", sa.findByNif("222").get())));
		assertNotNull(se.save(new ExpedienteVO(LocalDate.now(), "Exp3", "Cliente2", "herencia", sa.findByNif("222").get())));

	}
	@Test
	public void test03() {
		ExpedienteVO expediente = se.findByNumexpediente("Exp1").get();
		expediente.setAbogado(sa.findByNif("111").get());
		assertNotNull(se.save(expediente));
	}
	@Test
	public void test04() {
		//este test funciona para encontrar los expedientes de un abogado
		//siempre que la carga de los expedientes sea EAGER
		//assertEquals(2, sa.findByNif("222").get().getExpedientes().size());
		//en este caso la carga de los expedientes de abogado es LAZY
		List<ExpedienteVO> exp = sa.buscarAbogadoPorNifYExpedientes("222").get().getExpedientes();
		for(ExpedienteVO e:exp) {
			System.out.println("Expediente: " + e.getExplicacionCaso());
		}
		assertEquals(2, exp.size());
	}

}
