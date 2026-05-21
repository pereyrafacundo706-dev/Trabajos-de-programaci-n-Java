package clases;

public class Triangulo extends Figurageometrica {
	
	double base;
	double altura;
	
	double lado2;
	double lado3;
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getLado2() {
		return lado2;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	public double getLado3() {
		return lado3;
	}
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	
	public Triangulo(String color, double area, double perimetro, double base, double altura, double lado2, double lado3) {
		super(color, area, perimetro);
		this.base = base;
		this.altura = altura;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

}
