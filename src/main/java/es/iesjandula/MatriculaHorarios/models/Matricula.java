package es.iesjandula.MatriculaHorarios.models;

import jakarta.persistence.EmbeddedId;
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
public class Matricula {

    @EmbeddedId
    private MatriculaId idMatricula;
    
    @ManyToOne
    @JoinColumn(name = "alumno_id", referencedColumnName = "idAlumno", insertable = false, updatable = false)
    private Alumno alumno;
    
    @ManyToOne
    @JoinColumn(name = "asignatura_curso", referencedColumnName = "curso", insertable = false, updatable = false)
    @JoinColumn(name = "asignatura_etapa", referencedColumnName = "etapa", insertable = false, updatable = false)
    @JoinColumn(name = "asignatura_grupo", referencedColumnName = "grupo", insertable = false, updatable = false)
    @JoinColumn(name = "asignatura_nombre", referencedColumnName = "nombre", insertable = false, updatable = false)
    @JoinColumn(name = "asignatura_departamentoPropietario", referencedColumnName = "departamentoPropietario", insertable = false, updatable = false)
    @JoinColumn(name = "asignatura_departamentoReceptor", referencedColumnName = "departamentoReceptor", insertable = false, updatable = false)
    private Asignatura asignatura;
}
