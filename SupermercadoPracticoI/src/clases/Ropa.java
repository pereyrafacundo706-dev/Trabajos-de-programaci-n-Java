package clases;

public class Ropa extends Producto {

	String material;
	String genero;
	String talle;
	String corte;
	String marca;
	String color;

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	public String getCorte() {
		return corte;
	}

	public void setCorte(String corte) {
		this.corte = corte;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Ropa(String nombre, double precio, int idProducto, int stock, String material, String genero, String talle,
			String corte, String marca, String color) {
		super(nombre, precio, idProducto, stock);
		this.material = material;
		this.genero = genero;
		this.talle = talle;
		this.corte = corte;
		this.marca = marca;
		this.color = color;
	}

}
