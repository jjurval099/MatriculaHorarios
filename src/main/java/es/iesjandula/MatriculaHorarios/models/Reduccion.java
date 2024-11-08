package es.iesjandula.MatriculaHorarios.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="reduccion")
public class Reduccion
{
	@Id
	@Column(length = 100)
	private String nombre;
	
	@Column(length = 10)
	private Integer horas;
	
	@Column
	private boolean decideDireccion;
	
	@OneToMany(mappedBy = "reduccionNombre")
	private List<ProfesorReduccion> profesor;
	
}
