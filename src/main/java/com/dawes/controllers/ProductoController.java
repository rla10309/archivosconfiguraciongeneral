package com.dawes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dawes.modelo.ProductoVO;
import com.dawes.modelo.UsuarioVO;
import com.dawes.servicio.ServicioProducto;
import com.dawes.servicio.ServicioUsuario;

@Controller
@RequestMapping("/admin/producto")
public class ProductoController {
	@Autowired
	ServicioProducto sp;
	@Autowired
	ServicioUsuario su;
	
	@RequestMapping("/listaproductos")
	public String listado(Model modelo) {
		modelo.addAttribute("productos", sp.findAll());
		return "admin/producto/listaproductos";
	}
	
	@RequestMapping("/editar")
	public String editarCompra(@RequestParam int idproducto, Model modelo) {
		modelo.addAttribute("producto", sp.findById(idproducto).get());
		modelo.addAttribute("usuarios", su.findAll());
		return "admin/producto/formeditar";
	}
	
	@RequestMapping("/guardar")
	public String insertar(@ModelAttribute ProductoVO producto) {
		sp.save(producto);
		return "redirect:/admin/producto/listaproductos";
		
	}
	//todas las compras de un usuario por dni
	@RequestMapping("/buscapordni")
	public String buscarComprasPorDni(@RequestParam String dni, Model modelo) {
		UsuarioVO comprador = su.findByDni(dni).get();
		List<ProductoVO> compras = sp.findByComprador(comprador.getNombre()).get();
		modelo.addAttribute("compras", compras);
		modelo.addAttribute("usuarios", su.findAll());
		return "admin/usuario/unusuario";
	}
	

}
