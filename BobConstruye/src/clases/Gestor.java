package clases;
import java.util.Scanner;
public class Gestor {

	public static void main(String[] args) {
	
		Scanner lector = new Scanner(System.in);
		
		Casa casa1 = new Casa(null, 0, null, 0, 0, 0, null, null, 0);
		Apartamento apart1 = new Apartamento (null, 0, null, 0, 0, 0, null, null, null);
		
		System.out.println("\n=Bienvenido al programa=\n");
		System.out.println("=REGISTRO CASA=");
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
		
		casa1.setNombre(nombreCasa);
		casa1.setId(idCasa);
		casa1.setDireccion(dirCasa);
		casa1.setCodPostal(codPostalCasa);
		casa1.setAnioConstruccion(anioConstruccion);
		casa1.setSuperficieTotal(superTotal);
		casa1.setPropietario(propietario);
		casa1.setGaraje(garaje);
		casa1.setNumPisos(numPisos);
		
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
		
		apart1.setNombre(nombreApartamento);
		apart1.setId(idApartamento);
		apart1.setDireccion(dirApartamento);
		apart1.setCodPostal(codPostalApartamento);
		apart1.setAnioConstruccion(anioConstruccionApartamento);
		apart1.setSuperficieTotal(superTotalApartamento);
		apart1.setPropietario(propietarioApartamento);
		apart1.setTorre(torre);
		apart1.setBalcon(balcon);
		
		System.out.println("\n=CASA=\n");
		System.out.println("-Nombre: "+casa1.getNombre());
		System.out.println("-Id: "+casa1.getId());
		System.out.println("-Direccion: "+casa1.getDireccion());	
		System.out.println("-Codigo postal: "+casa1.getCodPostal());
		System.out.println("-Año de finalizacion de la construccion: "+casa1.getAnioConstruccion());	
		System.out.println("-Superficie total en metros cuadrados: "+casa1.getSuperficieTotal()+" m²");
		System.out.println("-Nombre del propietario: "+casa1.getPropietario());	
		System.out.println("-Disponibilidad de garaje: "+casa1.getGaraje());
		System.out.println("-Numero de pisos: "+casa1.getNumPisos());
		
		System.out.println("\n=APARTAMENTO=\n");
		System.out.println("-Nombre: "+apart1.getNombre());
		System.out.println("-Id: "+apart1.getId());
		System.out.println("-Direccion: "+apart1.getDireccion());	
		System.out.println("-Codigo postal: "+apart1.getCodPostal());
		System.out.println("-Año de finalizacion de la construccion: "+apart1.getAnioConstruccion());	
		System.out.println("-Superficie total en metros cuadrados: "+apart1.getSuperficieTotal()+" m²");
		System.out.println("-Nombre del propietario: "+apart1.getPropietario());	
		System.out.println("-Bloques de apartamento: "+apart1.getTorre());
		System.out.println("-Disponibilidad de balcones: "+apart1.getBalcon());
		
		
		
		
		

	}

}
