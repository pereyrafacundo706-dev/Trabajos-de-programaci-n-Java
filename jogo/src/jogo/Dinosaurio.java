package jogo;

public class Dinosaurio implements Acciones {
	
	String nombreD;

	public String getNombreD() {
		return nombreD;
	}

	public void setNombreD(String nombreD) {
		this.nombreD = nombreD;
	}

	public Dinosaurio(String nombreD) {
		super();
		this.nombreD = nombreD;
	}

	public void comer() {
		System.out.println("El dinosaurio acaba de comer 50kg de carne...");
	}

	public void dormir() {
		System.out.println("El dinosuario esta durmiendo 3 horas...");

	}

}
