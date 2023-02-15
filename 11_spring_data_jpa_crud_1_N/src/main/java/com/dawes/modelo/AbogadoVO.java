package com.dawes.modelo;

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
@Table(name="abogados", uniqueConstraints = @UniqueConstraint (columnNames = "nif"))
public class AbogadoVO {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idabogado;
	private String nombre;
	private String nif;
	
	//@OneToMany(mappedBy="abogado", fetch = FetchType.EAGER)
	@OneToMany(mappedBy="abogado", fetch = FetchType.LAZY)
	private List<ExpedienteVO> expedientes;

	public AbogadoVO(String nombre, String nif, List<ExpedienteVO> expedientes) {
		super();
		this.nombre = nombre;
		this.nif = nif;
		this.expedientes = expedientes;
	}
	
	

}
