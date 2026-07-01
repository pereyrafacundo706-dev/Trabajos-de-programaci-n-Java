package clases;

public class Casa extends Edificio {

	String garaje;
	int numPisos;

	public String getGaraje() {
		return garaje;
	}

	public void setGaraje(String garaje) {
		this.garaje = garaje;
	}

	public int getNumPisos() {
		return numPisos;
	}

	public void setNumPisos(int numPisos) {
		this.numPisos = numPisos;
	}

	public Casa(String nombre, int id, String direccion, int codPostal, int anioConstruccion, double superficieTotal,
			String propietario, String garaje, int numPisos) {
		super(nombre, id, direccion, codPostal, anioConstruccion, superficieTotal, propietario);
		this.garaje = garaje;
		this.numPisos = numPisos;
	}

}
