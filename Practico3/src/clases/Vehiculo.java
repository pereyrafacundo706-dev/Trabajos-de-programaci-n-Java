package clases;

public abstract class Vehiculo {
	
	private String marca;
	private String modelo;
	private String color;
	private int año;
	
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	
	public Vehiculo(String marca, String modelo, String color, int año) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.año = año;
	}

}
