package es.iesjandula.MatriculaHorarios.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "curso")
public class Curso
{
	@Id
	@Column(length = 9)
    private Integer curso;

	@Id
    @Column(length = 10)
    private String etapa; 
    
    
    public Curso()
    {
        super();
    }


	public Integer getCurso()
	{
		return curso;
	}


	public void setCurso(Integer curso) 
	{
		this.curso = curso;
	}


	public String getEtapa() 
	{
		return etapa;
	}


	public void setEtapa(String etapa) 
	{
		this.etapa = etapa;
	}


	@Override
	public String toString() 
	{
		return "Curso [curso=" + curso + ", etapa=" + etapa + "]";
	}  
}
