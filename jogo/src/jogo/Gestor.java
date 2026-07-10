package jogo;

import java.util.Scanner;

public class Gestor implements Acciones {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		Dinosaurio dinosaurio1 = new Dinosaurio("Facundo");
		Perro perro1 = new Perro("Guillermo");

		int opcion = 0;
		do {
			System.out.println("=Menu=");
			System.out.println("1. Dar de comer al perro");
			System.out.println("2. Dormir al perro");
			System.out.println("3. Dar de comer al dinosaurio");
			System.out.println("4. Dormir al dinosaurio");
			System.out.println("5. Salir");
			opcion = kb.nextInt();

			switch (opcion) {

			case 1:
				perro1.comer();
				break;

			case 2:
				perro1.dormir();
				break;

			case 3:
				dinosaurio1.comer();
				break;

			case 4:
				dinosaurio1.dormir();
				break;
			}
		} while (opcion <= 4);

	}

	public void comer() {

	}

	public void dormir() {

	}

}
