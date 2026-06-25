package clases;

public abstract class ObraArte {

	private String titulo;
	private String autor;
	private int id;
	private double precio;
	private int anioCreacion;
	private String estiloArte;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getAnioCreacion() {
		return anioCreacion;
	}

	public void setAnioCreacion(int anioCreacion) {
		this.anioCreacion = anioCreacion;
	}

	public String getEstiloArte() {
		return estiloArte;
	}

	public void setEstiloArte(String estiloArte) {
		this.estiloArte = estiloArte;
	}

	public ObraArte(String titulo, String autor, int id, double precio, int anioCreacion, String estiloArte) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.id = id;
		this.precio = precio;
		this.anioCreacion = anioCreacion;
		this.estiloArte = estiloArte;
	}

}
