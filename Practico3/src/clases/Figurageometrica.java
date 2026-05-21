package clases;

public abstract class Figurageometrica {

	private String color;
	private double area;
	private double perimetro;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perímetro) {
		this.perimetro = perimetro;
	}


	public Figurageometrica(String color, double area, double perímetro) {
		super();
		this.color = color;
		this.area = area;
		this.perimetro = perimetro;
		
	}

}
