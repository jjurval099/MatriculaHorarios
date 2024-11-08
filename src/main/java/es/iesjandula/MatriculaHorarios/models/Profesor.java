package es.iesjandula.MatriculaHorarios.models;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="profesor")
public class Profesor
{
	@Id
	@Column(length = 20)
	private String profesorEmail;
	
	@Column(length = 10)
	private String nombre;
		
	@Column(length = 10)
	private String apellidos;
	
	@ManyToOne
	@JoinColumn(name="nombreDepartamento")
	@MapsId("nombreDepartamento")
	private Departamento nombreDepartamento;

}
