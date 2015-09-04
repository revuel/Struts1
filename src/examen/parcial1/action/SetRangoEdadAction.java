package examen.parcial1.action;

//##### DEPENDENCIAS
//## actionforms y struts 
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

//## Nuestras clases
import examen.parcial1.actionForm.RangoActionForm;
import examen.parcial1.bean.Alumno;
import examen.parcial1.logica.Logica;

public class SetRangoEdadAction  extends Action{

	/*@Override
	public ActionForward execute
	(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
	
	throws Exception 
		{
			// Aquí abajo se guardan los valores que vienen del formulario del jsp
			RangoActionForm rang = (RangoActionForm)form; 
			
			// Instancias de clases
			Logica logica = new Logica();
			String destino = "ERROR"; // Para el enrutamiento
			
			// Llamadas a métodos
			float notamedia = logica.getAvgnotaxrango(rang); // Pillamos la nota media
			
			// Enrutamiento
			if (notamedia == 0.0)
			{
				// No tenemos una nota media, puede haber ocurrido algún error
				destino = "ERROR";
				request.getSession().setAttribute("mensaje",  "No se ha encontrado ningún elemento");
			}
			else
			{
				destino = "SUCCESS";
				
				// Convertimos aquí a string el valor de la nota media
				String notamediastring = Float.toString(notamedia);
				
				request.getSession().setAttribute("avgnota", notamediastring);
			}
			// TODO Auto-generated method stub
			return mapping.findForward(destino); // Según sea error/success 
		}	*/
}
