package examen.parcial1.actionForm;

import org.apache.struts.action.ActionForm;

public class CorteActionForm  extends ActionForm{

	// ##### ATRIBUTOS
	String corte;

	// ##### MÉTODOS
	// Constructor vacío
	public CorteActionForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Constructor con campos
	public CorteActionForm(String corte) {
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
