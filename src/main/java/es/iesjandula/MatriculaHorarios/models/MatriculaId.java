package es.iesjandula.MatriculaHorarios.models;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class MatriculaId implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "alumno_id")
    private Integer alumnoId;

    @Column(name = "asignatura_curso")
    private Integer asignaturaCurso;

    @Column(name = "asignatura_etapa")
    private String asignaturaEtapa;

    @Column(name = "asignatura_grupo")
    private String asignaturaGrupo;

    @Column(name = "asignatura_nombre")
    private String asignaturaNombre;
}
