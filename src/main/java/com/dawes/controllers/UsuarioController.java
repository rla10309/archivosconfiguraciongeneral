package com.dawes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dawes.modelo.ProductoVO;
import com.dawes.modelo.UsuarioVO;
import com.dawes.servicio.ServicioProducto;
import com.dawes.servicio.ServicioUsuario;

@Controller
@RequestMapping("/admin/usuario")
public class UsuarioController {
	
	@Autowired
	ServicioUsuario su;
	@Autowired
	ServicioProducto sp;
	
	@RequestMapping("/listausuarios")
	public String listado(Model modelo) {
		modelo.addAttribute("usuarios", su.findAll());
		return "admin/usuario/listausuarios";
	}
	
//	@RequestMapping("/buscapordni")
//	public String buscarComprasPorDni(@RequestParam String dni, Model modelo) {
//		
//		List<ProductoVO> compras = su.findByDni(dni).get().getCompras();
//		modelo.addAttribute("compras", compras);
//		modelo.addAttribute("usuarios", su.findAll());
//		return "admin/usuario/unusuario";
//	}
	

}
