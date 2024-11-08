package es.iesjandula.MatriculaHorarios.models;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class ProfesorReduccionId implements Serializable
{
	private static final long serialVersionUID = 1L;
	
    private String profesorEmail;
	
    private String reduccionNombre;

}
