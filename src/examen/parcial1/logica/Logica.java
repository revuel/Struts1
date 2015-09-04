package examen.parcial1.logica;

//###### DEPENDENCIAS
import java.util.Vector;

import examen.parcial1.bean.Libro;

//import es.ufv.tap.libreria.logica.Logica;
import examen.parcial1.actionForm.AlumnoActionForm;
import examen.parcial1.actionForm.CorteActionForm;
import examen.parcial1.actionForm.LibroActionForm;
import examen.parcial1.actionForm.RangoActionForm;
import examen.parcial1.bean.Alumno;
import examen.parcial1.dao.Dao;

public class Logica {
	
	// ###### MÉTODOS
	
	// Constructor
	public Logica()
	{
		
	}

	// ## Llamadas a métodos del Dao
	
	// Insertar alumno con su nota (3.5 puntos) 
	/*public void setAlu(AlumnoActionForm alu)
	{
		Dao dao = new Dao();
		dao.crearConexion();
		dao.insertarAlumno(alu);
		dao.cerrarConexion();
	}
	
	// Obtener un listado de alumnos por nota de corte (3.5 puntos)
	public  Vector<Alumno> getAlusxnota(CorteActionForm notacorte)
	{
		Vector<Alumno> listalu = new Vector<Alumno>();
		
		Dao dao = new Dao();
		dao.creaConexion();
		listalu = dao.alumnosNotacorte(notacorte);
		dao.cerrarConexion();
		
		return listalu;
		
	}
	
	// Obtener la nota media a partir de un rango de edad (3 puntos)
	public float getAvgnotaxrango(RangoActionForm rang)
	{
		float media;
		
		Dao dao = new Dao();
		dao.creaConexion();
		media = dao.notamediaRangoedad(rang);
		dao.cerrarConexion();
		
		return media;
	}

	// Obtener a todos los alumnos (parte hecha opcional)
	public Vector<Alumno> getAlumnos() 
	{
		Vector<Alumno> listalu = new Vector<Alumno>();
		
		Dao dao = new Dao();
		dao.creaConexion();
		listalu = dao.getAlumnos();
		dao.cerrarConexion();
		
		return listalu;
	}*/
	
	public Vector<Libro> getLibros(String titulo, String autor, String isbn)
	{
		Vector<Libro> libros = null;
		Dao dao = new Dao();
		dao.creaConexion();
		libros = dao.getLibros(titulo, autor, isbn);
		dao.cerrarConexion();
		return libros;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Logica logica = new Logica();
		Vector<Libro> libs = logica.getLibros("", "", "");
		for (int i = 0; i < libs.size(); i++)
		{
			System.out.println("titulo: " +libs.elementAt(i).getTitulo());
			System.out.println("autor: " +libs.elementAt(i).getAutor());
			System.out.println("isbn: " +libs.elementAt(i).getIsbn());
		}
		
	}

	public void setLib(LibroActionForm lib) {
		Dao dao = new Dao();
		dao.creaConexion();
		dao.insertarLibro(lib);
		dao.cerrarConexion();
		
	}

	public Vector<Libro> listalibros() {
		// TODO Auto-generated method stub
		Vector<Libro> listalu = new Vector<Libro>();
		
		Dao dao = new Dao();
		dao.creaConexion();
		listalu = dao.listalibros();
		dao.cerrarConexion();
		
		return listalu;
	}
}
