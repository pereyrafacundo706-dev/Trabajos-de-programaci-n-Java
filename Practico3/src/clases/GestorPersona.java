package clases;

public class GestorPersona {

	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno ("Facundo", "Pereyra", 16, 58067214, "pereyrafacundo706@gmail.com", "2do", 6);
		System.out.println(alumno1.getNombre());
		System.out.println(alumno1.getApellido());
		System.out.println(alumno1.getEdad());
		System.out.println(alumno1.getCi());
		System.out.println(alumno1.getCorreo());
		System.out.println(alumno1.getCurso());
		System.out.println(alumno1.getPromedio());
		
		Profesor profesor1 = new Profesor ("Facundo", "Lagos", 24, 58067214, "facu.lagalvar@gmail.com", 41200, "Matematica", "3 años", "8a16");
		System.out.println(profesor1.getNombre());
		System.out.println(profesor1.getApellido());
		System.out.println(profesor1.getEdad());
		System.out.println(profesor1.getCi());
		System.out.println(profesor1.getCorreo());
		System.out.println(profesor1.getSueldo());
		System.out.println(profesor1.getMateriaDictada());
		System.out.println(profesor1.getExperiencia());
		System.out.println(profesor1.getHorario());
		
		Director director = new Director ("Luis", "Fernandez", 53, 5780643, "fernandezluis@gmai.com", "Direccion", 85000, "15");
		System.out.println(director.getNombre());
		System.out.println(director.getApellido());
		System.out.println(director.getEdad());
		System.out.println(director.getCi());
		System.out.println(director.getCorreo());
		System.out.println(director.getOficina());
		System.out.println(director.getSalarioDir());
		System.out.println(director.getExperienciaDir());
		
	}

}
