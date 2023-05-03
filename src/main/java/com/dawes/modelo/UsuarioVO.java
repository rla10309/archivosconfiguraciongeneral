package com.dawes.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="usuarios", uniqueConstraints = @UniqueConstraint(columnNames = "dni"))
public class UsuarioVO {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idusuario;
	private String nombre;
	private String dni;
	private LocalDate fechaalta;
	
	@OneToMany(mappedBy="comprador", fetch = FetchType.LAZY)
	List<ProductoVO> compras = new ArrayList<ProductoVO>();
	@OneToMany(mappedBy="vendedor", fetch = FetchType.LAZY)
	List<ProductoVO> ventas = new ArrayList<ProductoVO>();
	
	public UsuarioVO(String dni, String nombre, LocalDate fechaalta) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaalta = fechaalta;
	}

	@Override
	public String toString() {
		return "UsuarioVO [idusuario=" + idusuario + ", nombre=" + nombre + ", dni=" + dni + ", fechaalta=" + fechaalta
				+ "]";
	}

	
}
