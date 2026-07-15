package clases;

public abstract class Persona implements Interfaz {

	int tipo;

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Persona(int tipo) {
		super();
		this.tipo = tipo;
	}

	public void mandarMail(Persona destinatario) {

	}

}
