package clases;

public class Libro extends Publicacion {

	String isbn;
	String genero;
	String tapa;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTapa() {
		return tapa;
	}

	public void setTapa(String tapa) {
		this.tapa = tapa;
	}

	public Libro(String titulo, String fecha, String autores, int id, int numPaginas, String isbn, String genero,
			String tapa) {
		super(titulo, fecha, autores, id, numPaginas);
		this.isbn = isbn;
		this.genero = genero;
		this.tapa = tapa;
	}

}
