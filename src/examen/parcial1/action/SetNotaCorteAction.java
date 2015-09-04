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
import examen.parcial1.actionForm.CorteActionForm;
import examen.parcial1.bean.Alumno;
import examen.parcial1.logica.Logica;

public class SetNotaCorteAction extends Action{
	
	/*@Override
	public ActionForward execute
	(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
	
	throws Exception 
		{
			// Aquí abajo se guardan los valores que vienen del formulario del jsp
			CorteActionForm notacorte = (CorteActionForm)form; 
			
			// Instancias de clases
			Logica logica = new Logica();
			Vector<Alumno> alumnos = new Vector<Alumno>(); // Para cargar en sesión alumnos
			String destino = "ERROR"; // Para el enrutamiento
			
			// Llamadas a métodos
			alumnos = logica.getAlusxnota(notacorte); // Almacenamos que pasan la nota de corte en
										   			  //  en el vector, para la sesión
			// Enrutamiento
			if (alumnos.isEmpty())
			{
				// No hay alumnos, luego quizá nadie supera la nota de corte
				destino = "ERROR";
				request.getSession().setAttribute("mensaje",  "No se ha encontrado ningún elemento");
			}
			else
			{
				// Cargamos los alumnos en la sesión
				destino = "SUCCESS";
				request.getSession().setAttribute("alumninotacorte", alumnos);
			}
			// TODO Auto-generated method stub
			return mapping.findForward(destino); // Según sea error/success 
		}	*/
}
