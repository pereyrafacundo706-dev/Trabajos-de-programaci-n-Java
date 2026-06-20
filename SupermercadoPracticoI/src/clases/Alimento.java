package clases;

public class Alimento extends Producto{
	
	String marca;
	String contenido;
	String tipoAlmacenamiento;
	String fechaCaducidad;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public String getTipoAlmacenamiento() {
		return tipoAlmacenamiento;
	}
	public void setTipoAlmacenamiento(String tipoAlmacenamiento) {
		this.tipoAlmacenamiento = tipoAlmacenamiento;
	}
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public Alimento(String nombre, double precio, int idProducto, int stock, String marca, String contenido,
			String tipoAlmacenamiento, String fechaCaducidad) {
		super(nombre, precio, idProducto, stock);
		this.marca = marca;
		this.contenido = contenido;
		this.tipoAlmacenamiento = tipoAlmacenamiento;
		this.fechaCaducidad = fechaCaducidad;
	}

}
