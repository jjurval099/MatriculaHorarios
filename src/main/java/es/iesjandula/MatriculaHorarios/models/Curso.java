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
@Table(name = "curso")
public class Curso
{
	@Id
	@Column(length = 9)
    private Integer curso;

	@Id
    @Column(length = 10)
    private String etapa; 
	
	@OneToMany(mappedBy = "cursosEtapas")
	private List<DatosAlumnos>datosAlumnos;
     
}
