package examen.parcial1.bean;

public class Corte {
	
	// Anotación: En el dao cambiar este string por un integer para la consulta
	
	// ##### ATRIBUTOS
	String corte;

	// ##### MÉTODOS
	// Constructor vacío
	public Corte() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Constructor con campos
	public Corte(String corte) {
		super();
		this.corte = corte;
	}
	
	// Getters y Setters
	public String getCorte() {
		return corte;
	}

	public void setCorte(String corte) {
		this.corte = corte;
	}
}
