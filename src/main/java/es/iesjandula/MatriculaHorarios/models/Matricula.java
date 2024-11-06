package es.iesjandula.MatriculaHorarios.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "matricula")
public class Matricula 
{

    @ManyToOne
    @JoinColumn(name = "alumnoId", referencedColumnName = "idAlumno")
    private Alumno alumno; 

    @ManyToOne
    @JoinColumn(name = "asignaturaId", referencedColumnName = "idAsignatura")  
    private Asignatura asignatura; 

}
