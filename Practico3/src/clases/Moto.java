package clases;

public class Moto extends Vehiculo {

	String cilindrada;
	String tipoMoto;

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getTipoMoto() {
		return tipoMoto;
	}

	public void setTipoMoto(String tipoMoto) {
		this.tipoMoto = tipoMoto;
	}

	public Moto(String marca, String modelo, String color, int año, String cilindrada, String tipoMoto) {
		super(modelo, marca, color, año);
		this.cilindrada = cilindrada;
		this.tipoMoto = tipoMoto;
	}
}
