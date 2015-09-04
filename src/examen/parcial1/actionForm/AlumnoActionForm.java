package examen.parcial1.actionForm;

import org.apache.struts.action.ActionForm;

public class AlumnoActionForm extends ActionForm{

	// ###### ATRIBUTOS
	
	private String nombre;
	private String apellidos;
	private String edad;
	private String nota;
	
	// ###### MÉTODOS
	
	// Constructor vacío
	public AlumnoActionForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Constructor con campos
	public AlumnoActionForm(String nombre, String apellidos, String edad, String nota) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.nota = nota;
	}

	
	// Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

}
