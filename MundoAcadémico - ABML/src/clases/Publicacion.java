package clases;

public abstract class Publicacion {

	private String titulo;
	private String fecha;
	private String autores;
	private int id;
	private int numPaginas;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public Publicacion(String titulo, String fecha, String autores, int id, int numPaginas) {
		super();
		this.titulo = titulo;
		this.fecha = fecha;
		this.autores = autores;
		this.id = id;
		this.numPaginas = numPaginas;
	}

}
