package clases;

import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		Casa casa1[] = new Casa[5];
		Apartamento apart1[] = new Apartamento[5];
		int opcion = 0;

		do {
			System.out.println("\n=Bob construye=\n");
			System.out.println("--Seleccione una opcion: --\n");
			System.out.println("[1. Alta de casa          ]");
			System.out.println("[2. Alta de apartamento   ]");
			System.out.println("[3. Listar todo           ]");
			System.out.println("[4. Eliminar construccion ]");
			System.out.println("[5. Modificar construccion]");
			System.out.println("[6. Salir                 ]\n");
			opcion = lector.nextInt();

			switch (opcion) {

			case 1:

				System.out.println("=REGISTRO CASA=");
				lector.nextLine();
				System.out.println("Ingrese nombre: ");
				String nombreCasa = lector.nextLine();
				System.out.println("ingrese id: ");
				int idCasa = lector.nextInt();
				lector.nextLine();
				System.out.println("Ingrese direccion: ");
				String dirCasa = lector.nextLine();
				System.out.println("Ingrese codigo postal: ");
				int codPostalCasa = lector.nextInt();
				System.out.println("Ingrese año de finalizacion de la construccion: ");
				int anioConstruccion = lector.nextInt();
				System.out.println("Ingrese superficie total en metros cuadrados: ");
				double superTotal = lector.nextDouble();
				lector.nextLine();
				System.out.println("Ingrese nombre del propietario: ");
				String propietario = lector.nextLine();
				System.out.println("Tiene disponibilidad de garaje: ");
				String garaje = lector.next();
				System.out.println("Ingrese numero de pisos: ");
				int numPisos = lector.nextInt();

				altaCasa(casa1, nombreCasa, idCasa, dirCasa, codPostalCasa, anioConstruccion, superTotal, propietario,
						garaje, numPisos);
				break;

			case 2:

				System.out.println("=REGISTRO APARTAMENTO=");
				lector.nextLine();
				System.out.println("Ingrese nombre: ");
				String nombreApartamento = lector.nextLine();
				System.out.println("ingrese id: ");
				int idApartamento = lector.nextInt();
				lector.nextLine();
				System.out.println("Ingrese direccion: ");
				String dirApartamento = lector.nextLine();
				System.out.println("Ingrese codigo postal: ");
				int codPostalApartamento = lector.nextInt();
				System.out.println("Ingrese año de finalizacion de la construccion: ");
				int anioConstruccionApartamento = lector.nextInt();
				System.out.println("Ingrese superficie total en metros cuadrados: ");
				double superTotalApartamento = lector.nextDouble();
				lector.nextLine();
				System.out.println("Ingrese nombre del propietario: ");
				String propietarioApartamento = lector.nextLine();
				System.out.println("Ingrese bloques de apartamento: ");
				String torre = lector.nextLine();
				System.out.println("Tiene balcones: ");
				String balcon = lector.next();

				altaApartamento(apart1, nombreApartamento, idApartamento, dirApartamento, codPostalApartamento,
						anioConstruccionApartamento, superTotalApartamento, propietarioApartamento, torre, balcon);
				break;

			case 3:

				listaCasa(casa1);
				listaApartamento(apart1);
				break;

			case 4:

				System.out.println("Seleccione tipo de construccion que desea eliminar: ");
				System.out.println("[1. Casa       ]");
				System.out.println("[2. Apartamento]");
				int opcionEliminar = lector.nextInt();
				System.out.println("Ingrese id de la construccion que desea eliminar: ");
				int idEliminar = lector.nextInt();

				if (opcionEliminar == 1) {
					bajaCasa(idEliminar, casa1);

				}

				if (opcionEliminar == 2) {
					bajaApartamento(idEliminar, apart1);

				}
				break;

			case 5:

				System.out.println("Seleccione tipo de construccion que desea modificar: ");
				System.out.println("[1. Casa       ]");
				System.out.println("[2. Apartamento]");
				int opcionMod = lector.nextInt();
				System.out.println("Ingrese id de la construccion que desea modificar: ");
				int idMod = lector.nextInt();
				String nuevoNombreCasa = null;
				String nuevoPropietarioCasa = null;
				String nuevoNombreApart = null;
				String nuevoPropietarioApart = null;
				int atributoModCasa = 0;
				int atributoModApart = 0;

				if (opcionMod == 1) {
					System.out.println("\nSeleccione dato que desea modificar: \n");
					System.out.println("[1. Nombre               ]");
					System.out.println("[2. Nombre de propietario]");
					atributoModCasa = lector.nextInt();

					modCasa(casa1, opcionMod, idMod, atributoModCasa, nuevoNombreCasa, nuevoPropietarioCasa);
					System.out.println("Construccion modificada correctamente. ");
				}

				if (opcionMod == 2) {

					System.out.println("\nSeleccione dato que desea modificar: \n");
					System.out.println("[1. Nombre               ]");
					System.out.println("[2. Nombre de propietario]");
					atributoModApart = lector.nextInt();

					modApart(apart1, opcionMod, idMod, atributoModApart, nuevoNombreApart, nuevoPropietarioApart);
					System.out.println("Construccion modificada correctamente. ");

				}
				break;

			case 6:

				System.out.println("Saliendo...");

			}

		} while (opcion <= 5);

	}

	public static void altaCasa(Casa[] a, String nombreCasa, int idCasa, String dirCasa, int codPostalCasa,
			int anioConstruccion, double superTotal, String propietario, String garaje, int numPisos) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == null) {
				a[i] = new Casa(nombreCasa, idCasa, dirCasa, codPostalCasa, anioConstruccion, superTotal, propietario,
						garaje, numPisos);
				System.out.println("\nCasa ingresada correctamente. \n");
				break;
			}
		}

	}

	public static void altaApartamento(Apartamento[] b, String nombreApartamento, int idApartamento,
			String dirApartamento, int codPostalApartamento, int anioConstruccionApartamento,
			double superTotalApartamento, String propietarioApartamento, String torre, String balcon) {
		for (int i = 0; i < b.length; i++) {
			if (b[i] == null) {
				b[i] = new Apartamento(nombreApartamento, idApartamento, dirApartamento, codPostalApartamento,
						anioConstruccionApartamento, superTotalApartamento, propietarioApartamento, torre, balcon);
				System.out.println("\nApartamento ingresado correctamente. \n");
				break;
			}
		}
	}

	public static void listaCasa(Casa[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.println("\n=CASA=       | N° "+i+"\n");
				System.out.println("-Nombre: " + a[i].getNombre());
				System.out.println("-Id: " + a[i].getId());
				System.out.println("-Direccion: " + a[i].getDireccion());
				System.out.println("-Codigo postal: " + a[i].getCodPostal());
				System.out.println("-Año de finalizacion de la construccion: " + a[i].getAnioConstruccion());
				System.out.println("-Superficie total en metros cuadrados: " + a[i].getSuperficieTotal() + " m²");
				System.out.println("-Nombre del propietario: " + a[i].getPropietario());
				System.out.println("-Disponibilidad de garaje: " + a[i].getGaraje());
				System.out.println("-Numero de pisos: " + a[i].getNumPisos());
		
				
			}
		}

	}

	public static void listaApartamento(Apartamento[] b) {
		for (int i = 0; i < b.length; i++) {
			if (b[i] != null) {
				System.out.println("\n=APARTAMENTO= | N° "+i+"\n");
				System.out.println("-Nombre: " + b[i].getNombre());
				System.out.println("-Id: " + b[i].getId());
				System.out.println("-Direccion: " + b[i].getDireccion());
				System.out.println("-Codigo postal: " + b[i].getCodPostal());
				System.out.println("-Año de finalizacion de la construccion: " + b[i].getAnioConstruccion());
				System.out.println("-Superficie total en metros cuadrados: " + b[i].getSuperficieTotal() + " m²");
				System.out.println("-Nombre del propietario: " + b[i].getPropietario());
				System.out.println("-Bloques de apartamento: " + b[i].getTorre());
				System.out.println("-Disponibilidad de balcones: " + b[i].getBalcon());
			}
		}

	}

	public static void bajaCasa(int id, Casa[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i].getId() == id) {
				a[i] = null;
				System.out.println("\nCasa dada de baja exitosamente.\n");
				break;
			}
		}

	}

	public static void bajaApartamento(int id, Apartamento[] b) {
		for (int i = 0; i < b.length; i++) {
			if (b[i].getId() == id) {
				b[i] = null;
				System.out.println("\nApartamento dado de baja exitosamente.\n");
				break;
			}
		}

	}

	public static void modCasa(Casa[] a, int opcionMod, int idMod, int atributoModCasa, String nuevoNombreCasa,
			String nuevoPropietarioCasa) {

		Scanner lector = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null && a[i].getId() == idMod) {

				if (atributoModCasa == 1) {
					System.out.println("Ingrese nuevo nombre: ");
					nuevoNombreCasa = lector.nextLine();
					a[i].setNombre(nuevoNombreCasa);
					break;

				}
				if (atributoModCasa == 2) {
					System.out.println("Ingrese nombre del nuevo propietario: ");
					nuevoPropietarioCasa = lector.nextLine();
					a[i].setPropietario(nuevoPropietarioCasa);
					break;

				}

			}

		}

	}

	public static void modApart(Apartamento[] b, int opcionMod, int idMod, int atributoModApart,
			String nuevoNombreApart, String nuevoPropietarioApart) {

		Scanner lector = new Scanner(System.in);
		for (int i = 0; i < b.length; i++) {
			if (b[i] != null && b[i].getId() == idMod) {

				if (atributoModApart == 1) {
					System.out.println("Ingrese nuevo nombre: ");
					nuevoNombreApart = lector.nextLine();
					b[i].setNombre(nuevoNombreApart);
					break;

				}
				if (atributoModApart == 2) {
					System.out.println("Ingrese nombre del nuevo propietario: ");
					nuevoPropietarioApart = lector.nextLine();
					b[i].setPropietario(nuevoPropietarioApart);
					break;

				}

			}

		}

	}

}
