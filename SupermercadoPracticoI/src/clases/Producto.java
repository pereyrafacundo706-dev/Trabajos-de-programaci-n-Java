package clases;

public abstract class Producto {

	private String nombre;
	private double precio;
	private int idProducto;
	private int stock;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Producto(String nombre, double precio, int idProducto, int stock) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.idProducto = idProducto;
		this.stock = stock;
	}

}
