package com.dawes.modelo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="expedientes", uniqueConstraints = @UniqueConstraint(columnNames = "numexpediente"))
public class ExpedienteVO {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idexpediente;
	private LocalDate fecha;
	private String numexpediente;
	private String cliente;
	private String explicacionCaso;
	@ManyToOne
	private AbogadoVO abogado;
	
	public ExpedienteVO(LocalDate fecha, String numexpediente, String cliente, String explicacionCaso, AbogadoVO abogado) {
		super();
		this.fecha = fecha;
		this.numexpediente = numexpediente;
		this.cliente = cliente;
		this.explicacionCaso = explicacionCaso;
		this.abogado = abogado;
	}
	
	

}
