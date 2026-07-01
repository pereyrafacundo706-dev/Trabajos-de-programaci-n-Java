package clases;

public class Revista extends Publicacion {

	String issn;
	String tematica;
	int numeroEdicion;

	public String getIssn() {
		return issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	public int getNumeroEdicion() {
		return numeroEdicion;
	}

	public void setNumeroEdicion(int numeroEdicion) {
		this.numeroEdicion = numeroEdicion;
	}

	public Revista(String titulo, String fecha, String autores, int id, int numPaginas, String issn, String tematica,
			int numeroEdicion) {
		super(titulo, fecha, autores, id, numPaginas);
		this.issn = issn;
		this.tematica = tematica;
		this.numeroEdicion = numeroEdicion;
	}

}
