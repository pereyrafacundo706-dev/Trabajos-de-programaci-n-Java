package clases;

public class Director extends Persona {

	String oficina;
	int salarioDir;
	String experienciaDir;

	public String getOficina() {
		return oficina;
	}

	public void setOficina(String oficina) {
		this.oficina = oficina;
	}

	public int getSalarioDir() {
		return salarioDir;
	}

	public void setSalarioDir(int salarioDir) {
		this.salarioDir = salarioDir;
	}

	public String getExperienciaDir() {
		return experienciaDir;
	}

	public void setExperienciaDir(String experienciaDir) {
		this.experienciaDir = experienciaDir;
	}

	public Director(String nombre, String apellido, int edad, int ci, String correo, String oficina, int salarioDir,
			String experienciaDir) {
		super(nombre, apellido, edad, ci, correo);
		this.oficina = oficina;
		this.salarioDir = salarioDir;
		this.experienciaDir = experienciaDir;
	}

}
