package examen.parcial1.action;

import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import examen.parcial1.actionForm.AlumnoActionForm;
import examen.parcial1.bean.Alumno;
import examen.parcial1.logica.Logica;

import examen.parcial1.actionForm.LibroActionForm;
import examen.parcial1.bean.Libro;

public class AddLibroAction extends Action{
	
	@Override
	public ActionForward execute
	(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
	
	throws Exception 
		{
			// Aquí abajo se guardan los valores que vienen del formulario del jsp
			LibroActionForm lib = (LibroActionForm)form; 
			
			// Instancias de clases
			Logica logica = new Logica();
			Vector<Libro> libros = new Vector<Libro>(); // Para cargar en sesión alumnos
			String destino = "ERROR"; // Para el enrutamiento
			
			// Comprobación de los rangos de la edad y la nota
			// edad
			/*if (Integer.parseInt(alu.getEdad()) < 0 || Integer.parseInt(alu.getEdad()) > 100)
			{
				return mapping.findForward(destino);
			}
			// nota
			if (Integer.parseInt(alu.getNota()) < 0 || Integer.parseInt(alu.getNota()) > 100)
			{
				return mapping.findForward(destino);
			}*/
			
			// Llamadas a métodos
			//logica.setAlu(alu); // Primero se inserta el nuevo alumno
			//alumnos = logica.getAlumnos();// Luego almacenamos los alumnos en el vector, para la sesión
			logica.setLib(lib);
			libros = logica.listalibros();
			
			// Enrutamiento
			if (libros.isEmpty())
			{
				// No hay alumnos, luego algo ha ido mal en la inserción
				destino = "ERROR";
				request.getSession().setAttribute("mensaje",  "No se ha encontrado ningún elemento");
			}
			else
			{
				// Cargamos los alumnos en la sesión
				destino = "SUCCESS";
				request.getSession().setAttribute("libritos", libros);
			}
			// TODO Auto-generated method stub
			return mapping.findForward(destino); // Según sea error/success 
		}	

}
