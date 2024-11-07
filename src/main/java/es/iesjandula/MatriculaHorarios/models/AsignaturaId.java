package es.iesjandula.MatriculaHorarios.models;

import java.io.Serializable;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class AsignaturaId implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer curso;
    private String etapa;
    private String grupo;
    private String nombre;
    private String departamentoPropietario;
    private String departamentoReceptor;

}
