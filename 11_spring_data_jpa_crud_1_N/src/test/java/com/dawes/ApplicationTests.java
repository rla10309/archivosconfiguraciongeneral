package com.dawes;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dawes.modelo.AbogadoVO;
import com.dawes.modelo.ExpedienteVO;
import com.dawes.servicios.ServicioAbogado;
import com.dawes.servicios.ServicioExpediente;

@SpringBootTest
class ApplicationTests {

	@Autowired
	ServicioAbogado sa;
	@Autowired
	ServicioExpediente se;
	
	


}
