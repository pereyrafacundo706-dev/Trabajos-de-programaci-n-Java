package clases;

public class Fotografia extends ObraArte {

	String tipoFoto;
	String formato;
	String camara;
	String lente;

	public String getTipoFoto() {
		return tipoFoto;
	}

	public void setTipoFoto(String tipoFoto) {
		this.tipoFoto = tipoFoto;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getCamara() {
		return camara;
	}

	public void setCamara(String camara) {
		this.camara = camara;
	}

	public String getLente() {
		return lente;
	}

	public void setLente(String lente) {
		this.lente = lente;
	}

	public Fotografia(String titulo, String autor, int id, double precio, int anioCreacion, String estiloArte,
			String tipoFoto, String formato, String camara, String lente) {
		super(titulo, autor, id, precio, anioCreacion, estiloArte);
		this.tipoFoto = tipoFoto;
		this.formato = formato;
		this.camara = camara;
		this.lente = lente;
	}

}
