package examen.parcial1.actionForm;

import org.apache.struts.action.ActionForm;

public class RangoActionForm extends ActionForm{

	// ##### ATRIBUTOS
		String min;
		String max;
		
		// ##### MÉTODOS
		// Constructor limpio
		public RangoActionForm() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		// Constructor por campos
		public RangoActionForm(String min, String max) {
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
