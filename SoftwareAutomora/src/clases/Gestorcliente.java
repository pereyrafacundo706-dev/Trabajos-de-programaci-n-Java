package clases;

import java.util.Scanner;

public class Gestorcliente {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		Clientes cliente = null;
		Clientes cliente2 = null;
		int opciones = 0;
		
		do {
		System.out.println("\nElija la opcion deseada: \n"
				+ "1. Ingresar datos de clientes\n"
				+ "2. Consultar datos de clientes\n"
				+ "3. Salir\n");
		opciones = lector.nextInt();
		
		switch (opciones) {
			
		case 1:
		
		System.out.println("\nIngrese su nombre: ");
			String nombre = lector.next();

		System.out.println("\nIngrese su apellido: ");
			String apellido = lector.next();

		System.out.println("\nIngrese su cedula sin puntos ni guiones: ");
			int cedula = lector.nextInt();

			cliente = new Clientes(nombre, apellido, cedula);
			cliente.setNombre(nombre);
			cliente.setApellido(apellido);
			cliente.setCedula(cedula);
			
			break;
			
		case 2:
			
			System.out.println(cliente);
			
			break;
	}
		}while (opciones<=2);
}
}
