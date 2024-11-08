package es.iesjandula.MatriculaHorarios.models;

import es.iesjandula.MatriculaHorarios.models.Departamento;
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
@Table(name = "asignatura")
public class Asignatura {

    @EmbeddedId
    private AsignaturaId idAsignatura;

    @ManyToOne
    @JoinColumn(name = "departamentoPropietario", referencedColumnName = "nombre", insertable = false, updatable = false)
    private Departamento departamentoPropietario;

    @ManyToOne
    @JoinColumn(name = "departamentoReceptor", referencedColumnName = "nombre", insertable = false, updatable = false)
    private Departamento departamentoReceptor;
    
    @ManyToOne
    @JoinColumn(name = "bloque_id", referencedColumnName = "idBloque")
    private Bloque bloque;

}
