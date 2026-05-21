package clases;

public class Alumno extends Persona {

	String curso;
	double promedio;

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	public Alumno(String nombre, String apellido, int edad, int ci, String correo, String curso, double promedio) {
		super(nombre, apellido, edad, ci, correo);
		this.curso = curso;
		this.promedio = promedio;

	}
}
