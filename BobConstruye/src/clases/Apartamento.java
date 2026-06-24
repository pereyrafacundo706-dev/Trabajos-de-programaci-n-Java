package clases;

public class Apartamento extends Edificio {

	String torre;
	String balcon;



	public String getTorre() {
		return torre;
	}

	public void setTorre(String torre) {
		this.torre = torre;
	}

	public String getBalcon() {
		return balcon;
	}

	public void setBalcon(String balcon) {
		this.balcon = balcon;
	}

	public Apartamento(String nombre, int id, String direccion, int codPostal, int anioConstruccion, double superficieTotal,
			String propietario, String torre, String balcon) {
		super(nombre, id, direccion, codPostal, anioConstruccion, superficieTotal, propietario);
		
		this.torre = torre;
		this.balcon = balcon;
	}

}
