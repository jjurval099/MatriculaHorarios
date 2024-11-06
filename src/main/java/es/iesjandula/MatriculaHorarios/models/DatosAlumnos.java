package es.iesjandula.MatriculaHorarios.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "datos_alumnos")
public class DatosAlumnos 
{
    @Id
    @Column(length = 9, unique = true)
    private Integer id;

    @Column(length = 15, nullable = false)
    private String nombre;

    @Column(length = 20, nullable = false)
    private String apellidos;

    @Column(length = 10, nullable = false)
    private String asignatura;
    
    @Column(length = 10, nullable = false)
    private Integer cursoCurso;

    @Column(length = 10, nullable = false)
    private String cursoEtapa;

    @ManyToOne
    @JoinColumn(name = "cursoCursos", referencedColumnName = "curso")
    @JoinColumn(name = "cursoEtapas", referencedColumnName = "etapa")
    private Curso cursosEtapas;

}
