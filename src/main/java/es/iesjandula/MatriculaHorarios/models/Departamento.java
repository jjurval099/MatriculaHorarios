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
@Table(name="departamento")
public class Departamento 
{
    
    @Id
    @Column(length = 50, nullable = false)
    private String nombre;
    
    @OneToMany(mappedBy = "departamentoPropietario")
    private List<Asignatura> asignaturaPropietario;
    
    @OneToMany(mappedBy = "departamentoReceptor")
    private List<Asignatura> asignaturaReceptor;
}
