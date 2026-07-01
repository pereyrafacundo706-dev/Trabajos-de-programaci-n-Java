package clases;

public class ArticuloCientifico extends Publicacion {

	String doi;
	String revistaPublicacion;
	String sintesis;
	String institucion;

	public String getDoi() {
		return doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public String getRevistaPublicacion() {
		return revistaPublicacion;
	}

	public void setRevistaPublicacion(String revistaPublicacion) {
		this.revistaPublicacion = revistaPublicacion;
	}

	public String getSintesis() {
		return sintesis;
	}

	public void setSintesis(String sintesis) {
		this.sintesis = sintesis;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public ArticuloCientifico(String titulo, String fecha, String autores, int id, int numPaginas, String doi,
			String revistaPublicacion, String sintesis, String institucion) {
		super(titulo, fecha, autores, id, numPaginas);
		this.doi = doi;
		this.revistaPublicacion = revistaPublicacion;
		this.sintesis = sintesis;
		this.institucion = institucion;
	}

}
