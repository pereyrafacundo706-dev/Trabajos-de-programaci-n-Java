package clases;

public class Circulo extends Figurageometrica {
	
	double radio;
	double diametro;
	double circunferencia;
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getDiámetro() {
		return diametro;
	}
	public void setDiámetro(double diámetro) {
		this.diametro = diametro;
	}
	
	public Circulo(String color, double area, double perimetro, double radio, double diametro) {
		super(color, area, perimetro);
		this.radio = radio;
		this.diametro = diametro;
	}
}
