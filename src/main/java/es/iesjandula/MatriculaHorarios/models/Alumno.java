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
@Table(name = "alumno")
public class Alumno 
{
	@Id
    @Column(length = 9, unique = true)
    private Integer idAlumno;

    @Column(length = 15, nullable = false)
    private String nombre;
    
    @Column(length = 20, nullable = false)
    private String apellidos;
    
    @OneToMany(mappedBy = "alumno")
    private List<Matricula> matriculas;
    
}
