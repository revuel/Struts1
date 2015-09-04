package examen.parcial1.dao;

// ###### DEPENDENCIAS
// ## Conexiones
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
	
import java.util.ResourceBundle;
// ## Beans y actionForms
import java.util.Vector;

import examen.parcial1.bean.Libro;
//import examen.parcial1.bean.Dao;
import examen.parcial1.actionForm.AlumnoActionForm;
import examen.parcial1.actionForm.CorteActionForm;
import examen.parcial1.actionForm.LibroActionForm;
import examen.parcial1.actionForm.RangoActionForm;
import examen.parcial1.bean.Alumno;
	
public class Dao {
	
	// ###### ATRIBUTOS DE CLASE
	
	private String host;
	private String port;
	private String user;
	private String pwd;
	private String db;
	private String nameDB;
	private Connection conn;
		
	
	// ###### MÉTODOS
	
	// ## De conexión
	
	// Constructor
	public Dao()
	{
		host = "localhost";
		port = "3306";
		user = "root";
		pwd = "";
		db = "examenii";
		nameDB = "jdbc:mysql://";
		   

		
	}
	
	// Conectar
	public void creaConexion()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(nameDB+host+":"+port+"/"+db, user, pwd);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

	}
		/*
	// Desconectar
	public void cerrarConexion()
	{
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ## De consulta y manipulación de datos
	
	// Insertar alumno con su nota (3.5 puntos)
	public void insertarAlumno(AlumnoActionForm alu)
	{
		// Aquí hay que hacer la conversión de datos de string a integer 
		// para insertar en la base de datos los integers pedidos
		
		String query = "INSERT INTO alumno (nombre, apellidos, edad, nota) " +
				"VALUES ('"+alu.getNombre()+"','"+alu.getApellidos()+"'," +
						"'"+Integer.parseInt(alu.getEdad())+
						"','"+Integer.parseInt(alu.getNota())+"')";
		try
		{
			Statement stm = conn.createStatement();
			stm.execute(query);
			stm.close();
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			System.out.println(query);
			e.printStackTrace();
		}	
	}
	
	// Obtener un listado de alumnos por nota de corte (3.5 puntos)
	public Vector<Alumno> alumnosNotacorte(CorteActionForm corte)
	{
		// Preparar la nota de corte como integer
		int notacort = Integer.parseInt(corte.getCorte());
		
		// Instancia de vector de alumnos para la respuesta
		Vector<Alumno> listalumnos = new Vector<Alumno>();
		
		// Consulta
		String query = "SELECT * FROM alumno WHERE nota >='"+notacort+"'";
		
		try {
				Statement stm = conn.createStatement();
				ResultSet result = stm.executeQuery(query);
				while(result.next())
				{
					String nombre = result.getString("nombre");
					String apellidos = result.getString("apellidos");
					String edad = result.getString("edad");
					String nota = result.getString("nota");
	
					Alumno mialumno = new Alumno(nombre, apellidos, edad, nota);
					
					listalumnos.addElement(mialumno);
					
				}
			
				result.close();
				stm.close();
			} 
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return listalumnos;	
	}
	
	// Obtener la nota media a partir de un rango de edad (3 puntos)
	public float notamediaRangoedad(RangoActionForm rang)
	{
		// Convertir datos a integer para la BD
		int minimo = Integer.parseInt(rang.getMin());
		int maximo = Integer.parseInt(rang.getMax());
		float media = (float) 0.0;
		
		// Pequeño control antiusuario
		int aux = 0;
		if(minimo > maximo)
		{
			maximo = aux;
			minimo = maximo;
			minimo = aux;
		}
		
		// Consulta
		String query = "SELECT AVG(nota) FROM alumno WHERE" +
				" edad BETWEEN " + minimo + " AND " + maximo +";";
		try 
		{
			Statement stm = conn.createStatement();
			ResultSet result = stm.executeQuery(query);
			
			if(result.next())
			{
				media = result.getFloat(1);
			}
			stm.close();
			
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			System.out.println(query);
			e.printStackTrace();
		}
		
		return media;
	}
	
	// Obtener a todos los alumnos (parte hecha opcional)
	public Vector<Alumno> getAlumnos()
	{
		// Instancia de vector de alumnos para la respuesta
		Vector<Alumno> listalumnos = new Vector<Alumno>();
		
		// Consulta
		String query = "SELECT * FROM alumno";
		
		try {
				Statement stm = conn.createStatement();
				ResultSet result = stm.executeQuery(query);
				while(result.next())
				{
					String nombre = result.getString("nombre");
					String apellidos = result.getString("apellidos");
					String edad = result.getString("edad");
					String nota = result.getString("nota");
	
					Alumno mialumno = new Alumno(nombre, apellidos, edad, nota);
					
					listalumnos.addElement(mialumno);
					
				}
			
				result.close();
				stm.close();
			} 
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return listalumnos;	
	}*/
	
	/*private String host;
	private String port;
	private String cadenaConexion;
	private String user;
	private String pwd;
	private String database;
	private Connection conn;
	
	private ResourceBundle bundle = ResourceBundle.getBundle(this.getClass().getName());
	
	public Dao()
	{

		host = bundle.getString("host");
		port = bundle.getString("port");
		cadenaConexion = bundle.getString("cadenaConexion");
		user = bundle.getString("user");
		pwd = bundle.getString("pwd");
		database = bundle.getString("database");
	}*/
	
	/*public void crearConexion()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(cadenaConexion+host+":"+port+"/"+database, user, pwd);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}*/
	
	public Vector<Libro> getLibros(String titulo, String autor, String isbn)
	{
		String query = "SELECT titulo, autor, isbn from libros where 1=1";
		Vector<Libro> vec = new Vector<Libro>();
		try
		{
			if (titulo != null && titulo.length()>0)
			{
				query += " AND titulo like ? ";
			}
			if (autor!= null && autor.length()>0)
			{
				query += " AND autor like ? ";
			}
			if (isbn != null && isbn.length()>0)
			{
				query += " AND isbn like ? ";
			}
			
			PreparedStatement pstm = conn.prepareStatement(query);
			int cont = 1;
			if (titulo != null && titulo.length()>0)
			{
				pstm.setString(cont++, "%"+titulo+"%");
			}
			if (autor != null && autor.length()>0)
			{
				pstm.setString(cont++, "%"+autor+"%");
			}
			if (isbn != null && isbn.length()>0)
			{
				pstm.setString(cont++, "%"+isbn+"%");
			}
			ResultSet result = pstm.executeQuery();
			while (result.next())
			{
				Libro libro = new Libro();
				libro.setTitulo(result.getString(1));
				libro.setAutor(result.getString(2));
				libro.setIsbn(result.getString(3));
				vec.addElement(libro);
			}
			result.close();
			pstm.close();
			
		}
		catch (Exception e)
		{
			System.out.println("Dao.getLibros: "+e);
		}
		return vec;
	}
	
	public void cerrarConexion()
	{
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dao dao = new Dao();
		//dao.crearConexion();
		Vector<Libro> libs = dao.getLibros("", "", null);
		dao.cerrarConexion();
		for (int i = 0; i < libs.size(); i++)
		{
			System.out.println("titulo: " +libs.elementAt(i).getTitulo());
			System.out.println("autor: " +libs.elementAt(i).getAutor());
			System.out.println("isbn: " +libs.elementAt(i).getIsbn());
		}
		
	}

	public void insertarLibro(LibroActionForm lib) {
		// TODO Auto-generated method stub
		// Aquí hay que hacer la conversión de datos de string a integer 
				// para insertar en la base de datos los integers pedidos
				
				String query = "INSERT INTO libros (titulo, autor, isbn) " +
						"VALUES ('"+lib.getTitulo()+"','"+lib.getAutor()+"'," +
								"'"+lib.getIsbn()+"')";
				try
				{
					Statement stm = conn.createStatement();
					stm.execute(query);
					stm.close();
				} 
				catch (SQLException e)
				{
					// TODO Auto-generated catch block
					System.out.println(query);
					e.printStackTrace();
				}	
	}

	public Vector<Libro> listalibros() {
		// TODO Auto-generated method stub
		// Instancia de vector de alumnos para la respuesta
				Vector<Libro> listalibros = new Vector<Libro>();
				
				// Consulta
				String query = "SELECT titulo, autor, isbn FROM libros";
				
				try {
						Statement stm = conn.createStatement();
						ResultSet result = stm.executeQuery(query);
						while(result.next())
						{
							String ti = result.getString("titulo");
							String au = result.getString("autor");
							String is = result.getString("isbn");
			
							Libro mialumno = new Libro(ti, au, is);
							
							listalibros.add(mialumno);
							
						}
					
						result.close();
						stm.close();
					} 
					catch (SQLException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				return listalibros;	
	}
	
}
