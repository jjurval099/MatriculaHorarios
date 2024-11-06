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
@Table(name = "bloque")
public class Bloque 
{
	@Id
	@Column(length = 15, nullable = false)
	private String idBloque;

    private String nombre;

    @OneToMany(mappedBy = "bloque")
    private List<Asignatura> asignaturas;	

}
