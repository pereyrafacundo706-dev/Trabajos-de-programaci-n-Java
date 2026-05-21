package clases;

public class Profesor extends Persona {

	int sueldo;
	String materiaDictada;
	String experiencia;
	String horario;

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public String getMateriaDictada() {
		return materiaDictada;
	}

	public void setMateriaDictada(String materiaDictada) {
		this.materiaDictada = materiaDictada;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Profesor(String nombre, String apellido, int edad, int ci, String correo, int sueldo, String materiaDictada,
			String experiencia, String horario) {
		super(nombre, apellido, edad, ci, correo);
		this.sueldo = sueldo;
		this.materiaDictada = materiaDictada;
		this.experiencia = experiencia;
		this.horario = horario;
	}

}
