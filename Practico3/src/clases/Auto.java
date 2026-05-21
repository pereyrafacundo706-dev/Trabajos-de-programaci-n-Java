package clases;

public class Auto extends Vehiculo {

	String motor;
	String aireAcondicionado;
	String transmision;

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getAireAcondicionado() {
		return aireAcondicionado;
	}

	public void setAireAcondicionado(String aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}

	public String getTransmision() {
		return transmision;
	}

	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}

	public Auto(String marca, String modelo, String color, int año, String motor, String aireAcondicionado,
			String transmision) {
		super(marca, modelo, color, año);
		this.motor = motor;
		this.aireAcondicionado = aireAcondicionado;
		this.transmision = transmision;
	}

}
