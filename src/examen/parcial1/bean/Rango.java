package examen.parcial1.bean;

public class Rango {
	
	// Anotación: Estos strings habrá que convertirlos a integer en un dao
	
	// ##### ATRIBUTOS
	String min;
	String max;
	
	// ##### MÉTODOS
	// Constructor limpio
	public Rango() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Constructor por campos
	public Rango(String min, String max) {
		super();
		this.min = min;
		this.max = max;
	}
	
	// Getters y Setters
	public String getMin() {
		return min;
	}
	public void setMin(String min) {
		this.min = min;
	}
	public String getMax() {
		return max;
	}
	public void setMax(String max) {
		this.max = max;
	}
	
	

}
