package es.iesjandula.MatriculaHorarios.models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
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
@Table(name="profesor_reduccion")
public class ProfesorReduccion 
{
	
	@EmbeddedId
	private ProfesorReduccionId profesorReduccionId;
	
	@ManyToOne
	@JoinColumn(name="profesor_email",referencedColumnName = "profesorEmail")
	private Profesor profesorEmail;
	
	
	@ManyToOne
	@JoinColumn(name="reduccion_nombre",referencedColumnName = "reduccionNombre")
	private Reduccion reduccionNombre;

}
