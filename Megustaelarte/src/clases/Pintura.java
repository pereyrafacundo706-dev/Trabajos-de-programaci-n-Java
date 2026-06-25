package clases;

public class Pintura extends ObraArte {

	String tecnica;
	double dimensionAlto;
	double dimensionAncho;

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public double getDimensionAlto() {
		return dimensionAlto;
	}

	public void setDimensionAlto(double dimensionAlto) {
		this.dimensionAlto = dimensionAlto;
	}

	public double getDimensionAncho() {
		return dimensionAncho;
	}

	public void setDimensionAncho(double dimensionAncho) {
		this.dimensionAncho = dimensionAncho;
	}

	public Pintura(String titulo, String autor, int id, double precio, int anioCreacion, String estiloArte,
			String tecnica, double dimensionAlto, double dimensionAncho) {
		super(titulo, autor, id, precio, anioCreacion, estiloArte);
		this.tecnica = tecnica;
		this.dimensionAlto = dimensionAlto;
		this.dimensionAncho = dimensionAncho;
	}

}
