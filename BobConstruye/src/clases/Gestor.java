package clases;
import java.util.Scanner;
public class Gestor {

	public static void main(String[] args) {
	
		Scanner lector = new Scanner(System.in);
		
		Casa casa1 = new Casa(null, 0, null, 0, 0, 0, null, null, 0);
		Apartamento apart1 = new Apartamento (null, 0, null, 0, 0, 0, null, null, null);
		int opcion = 0;
		
		do {
		System.out.println("\n=Bob construye=\n");
		System.out.println("--Seleccione una opcion: --\n");
		System.out.println("[1. Alta de casa       ]");
		System.out.println("[2. Alta de apartamento]");
		System.out.println("[3. Listar todo        ]");
		System.out.println("[4. Salir              ]");
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
		
		altaCasa(casa1, nombreCasa, idCasa, dirCasa, codPostalCasa, anioConstruccion, superTotal, propietario, garaje, numPisos);
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
		
		altaApartamento(apart1, nombreApartamento, idApartamento, dirApartamento, codPostalApartamento, anioConstruccionApartamento, superTotalApartamento, propietarioApartamento, torre, balcon);
		break;
		
		case 3:
			
		listaCasa (casa1);
		listaApartamento (apart1);
		break;
		
		case 4:
			
		System.out.println("Saliendo...");	
		
		}
		
		}while (opcion <=3);	

	}
	
	public static void altaCasa (Casa casaA, String nombreCasa, int idCasa, String dirCasa, int codPostalCasa, int anioConstruccion, double superTotal, String propietario, String garaje, int numPisos) {
		
		casaA.setNombre(nombreCasa);
		casaA.setId(idCasa);
		casaA.setDireccion(dirCasa);
		casaA.setCodPostal(codPostalCasa);
		casaA.setAnioConstruccion(anioConstruccion);
		casaA.setSuperficieTotal(superTotal);
		casaA.setPropietario(propietario);
		casaA.setGaraje(garaje);
		casaA.setNumPisos(numPisos);
	}
	
	public static void altaApartamento (Apartamento apartamentoB, String nombreApartamento, int idApartamento, String dirApartamento, int codPostalApartamento, int anioConstruccionApartamento, double superTotalApartamento, String propietarioApartamento, String torre, String balcon) {
		
		apartamentoB.setNombre(nombreApartamento);
		apartamentoB.setId(idApartamento);
		apartamentoB.setDireccion(dirApartamento);
		apartamentoB.setCodPostal(codPostalApartamento);
		apartamentoB.setAnioConstruccion(anioConstruccionApartamento);
		apartamentoB.setSuperficieTotal(superTotalApartamento);
		apartamentoB.setPropietario(propietarioApartamento);
		apartamentoB.setTorre(torre);
		apartamentoB.setBalcon(balcon);
	
	}
	
	public static void listaCasa (Casa casaA) {
		
		System.out.println("\n=CASA=\n");
		System.out.println("-Nombre: "+casaA.getNombre());
		System.out.println("-Id: "+casaA.getId());
		System.out.println("-Direccion: "+casaA.getDireccion());	
		System.out.println("-Codigo postal: "+casaA.getCodPostal());
		System.out.println("-Año de finalizacion de la construccion: "+casaA.getAnioConstruccion());	
		System.out.println("-Superficie total en metros cuadrados: "+casaA.getSuperficieTotal()+" m²");
		System.out.println("-Nombre del propietario: "+casaA.getPropietario());	
		System.out.println("-Disponibilidad de garaje: "+casaA.getGaraje());
		System.out.println("-Numero de pisos: "+casaA.getNumPisos());
		
	}
	
	public static void listaApartamento (Apartamento apartA) {
		
		System.out.println("\n=APARTAMENTO=\n");
		System.out.println("-Nombre: "+apartA.getNombre());
		System.out.println("-Id: "+apartA.getId());
		System.out.println("-Direccion: "+apartA.getDireccion());	
		System.out.println("-Codigo postal: "+apartA.getCodPostal());
		System.out.println("-Año de finalizacion de la construccion: "+apartA.getAnioConstruccion());	
		System.out.println("-Superficie total en metros cuadrados: "+apartA.getSuperficieTotal()+" m²");
		System.out.println("-Nombre del propietario: "+apartA.getPropietario());	
		System.out.println("-Bloques de apartamento: "+apartA.getTorre());
		System.out.println("-Disponibilidad de balcones: "+apartA.getBalcon());
		
		
	}

}
