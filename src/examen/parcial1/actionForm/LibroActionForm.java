package examen.parcial1.actionForm;

import org.apache.struts.action.ActionForm;

public class LibroActionForm extends ActionForm{
	
	private String titulo;
	private String autor;
	private String isbn;
	
	public LibroActionForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LibroActionForm(String titulo, String autor, String isbn) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


}
