package clases;

public class Escultura extends ObraArte {

	String material;
	double peso;
	double dimensionAlto;
	double dimensionAncho;
	double dimensionProfundidad;

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
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

	public double getDimensionProfundidad() {
		return dimensionProfundidad;
	}

	public void setDimensionProfundidad(double dimensionProfundidad) {
		this.dimensionProfundidad = dimensionProfundidad;
	}

	public Escultura(String titulo, String autor, int id, double precio, int anioCreacion, String estiloArte,
			String material, double peso, double dimensionAlto, double dimensionAncho, double dimensionProfundidad) {
		super(titulo, autor, id, precio, anioCreacion, estiloArte);
		this.material = material;
		this.peso = peso;
		this.dimensionAlto = dimensionAlto;
		this.dimensionAncho = dimensionAncho;
		this.dimensionProfundidad = dimensionProfundidad;
	}

}
