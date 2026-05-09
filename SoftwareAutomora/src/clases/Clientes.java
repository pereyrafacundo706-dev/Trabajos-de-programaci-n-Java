package clases;

public class Clientes {

	String nombre;
	String apellido;
	int cedula;

	public void setNombre(String nombre) {

		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;

	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getApellido() {
		return apellido;

	}

	public void setCedula(int cedula) {

		this.cedula = cedula;
	}

	public int getCedula() {
		return cedula;
	}

	public Clientes(String nombre, String apellido, int cedula) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
	}
	@Override
	public String toString() {
		return "[Nombre: "+ this.getNombre()+" [Apellido: "+this.getApellido()+" [Cedula: "+this.getCedula();
		
	}
}
