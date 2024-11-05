package es.iesjandula.MatriculaHorarios.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

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

    public DatosAlumnos() 
    {
        super();
    }

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public String getApellidos()
	{
		return apellidos;
	}

	public void setApellidos(String apellidos)
	{
		this.apellidos = apellidos;
	}

	public String getAsignatura()
	{
		return asignatura;
	}

	public void setAsignatura(String asignatura) 
	{
		this.asignatura = asignatura;
	}

	public Integer getCursoCurso() 
	{
		return cursoCurso;
	}

	public void setCursoCurso(Integer cursoCurso) 
	{
		this.cursoCurso = cursoCurso;
	}

	public String getCursoEtapa()
	{
		return cursoEtapa;
	}

	public void setCursoEtapa(String cursoEtapa) 
	{
		this.cursoEtapa = cursoEtapa;
	}

	public Curso getCursosEtapas() 
	{
		return cursosEtapas;
	}

	public void setCursosEtapas(Curso cursosEtapas)
	{
		this.cursosEtapas = cursosEtapas;
	}

	@Override
	public String toString() 
	{
		return "DatosAlumnos [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", asignatura="
				+ asignatura + ", cursoCurso=" + cursoCurso + ", cursoEtapa=" + cursoEtapa + ", cursosEtapas="
				+ cursosEtapas + "]";
	}
}
