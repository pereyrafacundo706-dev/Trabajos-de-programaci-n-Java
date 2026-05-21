package clases;

public class GestorFigura {

	public static void main(String[] args) {
		
		Triangulo triangulo1 = new Triangulo ("Azul", 20, 40, 5, 6, 6, 6);
		System.out.println(triangulo1.getColor());
		System.out.println(triangulo1.getArea());
		System.out.println(triangulo1.getPerimetro());
		System.out.println(triangulo1.getBase());
		System.out.println(triangulo1.getAltura());
		System.out.println(triangulo1.getLado2());
		System.out.println(triangulo1.getLado3());
		
		Circulo circulo1 = new Circulo ("Rojo", 78.54, 31.42, 5, 10);
		System.out.println(circulo1.getColor());
		System.out.println(circulo1.getArea());
		System.out.println(circulo1.getPerimetro());
		System.out.println(circulo1.getRadio());
		System.out.println(circulo1.getDiámetro());
		


	}

}
