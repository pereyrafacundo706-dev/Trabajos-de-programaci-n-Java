package jogo;

public class Perro implements Acciones {
	
	String nombreP;
	
	

	public Perro(String nombreP) {
		super();
		this.nombreP = nombreP;
	}

	public String getNombreP() {
		return nombreP;
	}

	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}

	public void comer() {
		System.out.println("El perro acaba de comer 600g de croquetas...");
	}

	public void dormir() {
		System.out.println("El perro esta durmiendo 12 horas...");
	}
	

}
