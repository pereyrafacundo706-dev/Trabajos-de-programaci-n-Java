package clases;

public class Electronica extends Producto {

	String marca;
	String modelo;
	String consumo;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getConsumo() {
		return consumo;
	}

	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}

	public Electronica(String nombre, double precio, int idProducto, int stock, String marca, String modelo,
			String consumo) {
		super(nombre, precio, idProducto, stock);
		this.marca = marca;
		this.modelo = modelo;
		this.consumo = consumo;
	}


	}


