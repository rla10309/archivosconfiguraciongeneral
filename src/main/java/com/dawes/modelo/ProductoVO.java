package com.dawes.modelo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="productos")
public class ProductoVO {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproducto;
	private String descripcion;
	private LocalDate fechaventa;
	private Float precio;
	private Float precioventa;
	@ManyToOne
	@JoinColumn(name="comprador", foreignKey = @ForeignKey(name="fk_usuario_comprador"))
	private UsuarioVO comprador;
	@ManyToOne
	@JoinColumn(name="vendedor", foreignKey = @ForeignKey(name="fk_usuario_vendedor"))
	private UsuarioVO vendedor;
	
	
	
	
	
}
