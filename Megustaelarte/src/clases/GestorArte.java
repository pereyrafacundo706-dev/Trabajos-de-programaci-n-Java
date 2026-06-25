package clases;

import java.util.Scanner;


public class GestorArte {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
		Pintura pintura1 = new Pintura(null, null, 0, 0, 0, null, null, 0, 0);
		Escultura escultura1 = new Escultura(null, null, 0, 0, 0, null, null, 0, 0, 0, 0);
		Fotografia foto1 = new Fotografia (null, null, 0, 0, 0, null, null, null, null, null);
		int opcion = 0;
		
		do {
		System.out.println("\n=Gestor de Arte=\n");
		System.out.println("--Seleccione una opcion: --\n");
		System.out.println("[1. Alta de pintura   ]");
		System.out.println("[2. Alta de escultura ]");
		System.out.println("[3. Alta de fotografia]");
		System.out.println("[4. Listar todo       ]");
		System.out.println("[5. Salir             ]\n");
		opcion = lector.nextInt();
		
		switch (opcion) {
		
		case 1:
			
		System.out.println("\n=Pintura=\n");
		lector.nextLine();
		System.out.println("Ingrese titulo de la pintura: ");
		String tituloPintura = lector.nextLine();
		System.out.println("Ingrese nombre del autor:");
		String autorPintura = lector.nextLine();
		System.out.println("Ingrese id: ");
		int idPintura = lector.nextInt();
		System.out.println("Ingrese precio: ");
		double precioPintura = lector.nextDouble();
		System.out.println("Ingrese año de creacion: ");
		int anioPintura = lector.nextInt();
		lector.nextLine();
		System.out.println("Ingrese estilo de arte: ");
		String estiloPintura = lector.nextLine(); 
		System.out.println("ingrese tecnica: ");
		String tecnica = lector.next(); 
		System.out.println("Ingrese dimension de alto en cm: ");
		double dimensionAltoPin = lector.nextDouble();
		System.out.println("Ingrese dimension de ancho en cm: ");
		double dimensionAnchoPin = lector.nextDouble();
		
		altaPintura(pintura1, tituloPintura, autorPintura, idPintura, precioPintura, anioPintura, estiloPintura, tecnica, dimensionAltoPin, dimensionAnchoPin);
		break;
		
		case 2:
			
			System.out.println("\n=Escultura=\n");
			lector.nextLine();
			System.out.println("Ingrese titulo de la escultura: ");
			String tituloEscult = lector.nextLine();
			System.out.println("Ingrese nombre del autor:");
			String autorEscult = lector.nextLine();
			System.out.println("Ingrese id: ");
			int idEscult = lector.nextInt();
			System.out.println("Ingrese precio: ");
			double precioEscult = lector.nextDouble();
			System.out.println("Ingrese año de creacion: ");
			int anioEscult = lector.nextInt();
			lector.nextLine();
			System.out.println("Ingrese estilo de arte: ");
			String estiloEscult = lector.nextLine();
			System.out.println("Ingrese material: ");
			String material = lector.next();
			System.out.println("Ingrese peso en kg: ");
			double peso = lector.nextDouble();
			System.out.println("Ingrese dimension de alto en cm: ");
			double dimensionAlto = lector.nextDouble();
			System.out.println("Ingrese dimension de ancho en cm: ");
			double dimensionAncho = lector.nextDouble();
			System.out.println("Ingrese dimension de profundidad en cm: ");
			double dimensionProfundidad = lector.nextDouble();
			
			altaEscultura(escultura1, tituloEscult, autorEscult, idEscult, precioEscult, anioEscult, estiloEscult, material, peso, dimensionAlto, dimensionAncho, dimensionProfundidad);
			break;
			
		case 3: 
			
			System.out.println("\n=Fotografía=\n");
			lector.nextLine();
			System.out.println("Ingrese titulo de la foto: ");
			String tituloFoto = lector.nextLine();
			System.out.println("Ingrese nombre del autor:");
			String autorFoto = lector.nextLine();
			System.out.println("Ingrese id: ");
			int idFoto = lector.nextInt();
			System.out.println("Ingrese precio: ");
			double precioFoto = lector.nextDouble();
			System.out.println("Ingrese año de creacion: ");
			int anioFoto = lector.nextInt();
			lector.nextLine();
			System.out.println("Ingrese estilo de arte: ");
			String estiloFoto = lector.nextLine();
			System.out.println("Ingrese tipo de foto: ");
			String tipoFoto = lector.nextLine();
			System.out.println("Ingrese formato: ");
			String formato = lector.next();
			lector.nextLine();
			System.out.println("Ingrese camara con la que se tomo la foto: ");
			String camara = lector.nextLine();
			System.out.println("Ingrese el lente con el que se tomo la foto: ");
			String lente = lector.nextLine();
			
			altaFoto(foto1, tituloFoto, autorFoto, idFoto, precioFoto, anioFoto, estiloFoto, tipoFoto, formato, camara, lente);
			break;
			
		case 4: 
			
			listaPintura(pintura1);
			listaEscultura(escultura1);
			listaFoto(foto1);
			break;
			
		case 5:
			
			System.out.println("[Saliendo...]");
	}
		
		}while(opcion <= 4);

}
	
	public static void altaPintura (Pintura pinturaA, String tituloPintura, String autorPintura, int idPintura, double precioPintura, int anioPintura, String estiloPintura, String tecnica, double dimensionAltoPin, double dimensionAnchoPin) {
		
		pinturaA.setTitulo(tituloPintura);
		pinturaA.setAutor(autorPintura);
		pinturaA.setId(idPintura);
		pinturaA.setPrecio(precioPintura);
		pinturaA.setAnioCreacion(anioPintura);
		pinturaA.setEstiloArte(estiloPintura);
		pinturaA.setTecnica(tecnica);
		pinturaA.setDimensionAlto(dimensionAltoPin);
		pinturaA.setDimensionAncho(dimensionAnchoPin);
		
	}
	
	public static void altaEscultura(Escultura esculturaA, String tituloEscult, String autorEscult, int idEscult, double precioEscult, int anioEscult, String estiloEscult, String material, double peso, double dimensionAlto, double dimensionAncho, double dimensionProfundidad) {
		
		esculturaA.setTitulo(tituloEscult);
		esculturaA.setAutor(autorEscult);
		esculturaA.setId(idEscult);
		esculturaA.setPrecio(precioEscult);
		esculturaA.setAnioCreacion(anioEscult);
		esculturaA.setEstiloArte(estiloEscult);
		esculturaA.setMaterial(material);
		esculturaA.setPeso(peso);
		esculturaA.setDimensionAlto(dimensionAlto);
		esculturaA.setDimensionAncho(dimensionAncho);
		esculturaA.setDimensionProfundidad(dimensionProfundidad);
		
		
	}
	
	public static void altaFoto (Fotografia fotoA, String tituloFoto, String autorFoto, int idFoto, double precioFoto, int anioFoto, String estiloFoto, String tipoFoto, String formato, String camara, String lente) {
		
		fotoA.setTitulo(tituloFoto);
		fotoA.setAutor(autorFoto);
		fotoA.setId(idFoto);
		fotoA.setPrecio(precioFoto);
		fotoA.setAnioCreacion(anioFoto);
		fotoA.setEstiloArte(estiloFoto);
		fotoA.setTipoFoto(tipoFoto);
		fotoA.setFormato(formato);
		fotoA.setCamara(camara);
		fotoA.setLente(lente);
		
		
	}
	
	public static void listaPintura (Pintura pinturaA) {
		
		System.out.println("\n=Pintura=\n");
		System.out.println("-Titulo de la pintura: "+pinturaA.getTitulo());
		System.out.println("-Nombre del autor: "+pinturaA.getAutor());
		System.out.println("-Id: "+pinturaA.getId());
		System.out.println("-Precio: "+pinturaA.getPrecio());
		System.out.println("-Año de creacion: "+pinturaA.getAnioCreacion());
		System.out.println("-Estilo de arte: "+pinturaA.getEstiloArte());
		System.out.println("-Tecnica: "+pinturaA.getTecnica());
		System.out.println("-Dimension de alto en cm: "+pinturaA.getDimensionAlto());
		System.out.println("-Dimension de ancho en cm: "+pinturaA.getDimensionAncho());
		
		
	}
	
	public static void listaEscultura (Escultura escultA) {
		
		System.out.println("\n=Escultura=\n");
		System.out.println("-Titulo de la escultura: "+escultA.getTitulo());
		System.out.println("-Nombre del autor:"+escultA.getAutor());
		System.out.println("-Id: "+escultA.getId());
		System.out.println("-Precio: "+escultA.getPrecio());	
		System.out.println("-Año de creacion: "+escultA.getAnioCreacion());
		System.out.println("-Estilo de arte: "+escultA.getEstiloArte());
		System.out.println("-Material: "+escultA.getMaterial());	
		System.out.println("-peso en kg: "+escultA.getPeso());
		System.out.println("-Dimension de alto en cm: "+escultA.getDimensionAlto());
		System.out.println("-Dimension de ancho en cm: "+escultA.getDimensionAncho());
		System.out.println("-Dimension de profundidad en cm: "+escultA.getDimensionProfundidad());
		
	}
	
	public static void listaFoto (Fotografia fotoA) {
		
		System.out.println("\n=Fotografía=\n");
		System.out.println("-Titulo de la foto: "+fotoA.getTitulo());
		System.out.println("-Nombre del autor:"+fotoA.getAutor());
		System.out.println("-Id: "+fotoA.getId());
		System.out.println("-Precio: "+fotoA.getPrecio());
		System.out.println("-Año de creacion: "+fotoA.getAnioCreacion());
		System.out.println("-Estilo de arte: "+fotoA.getEstiloArte());
		System.out.println("-Tipo de foto: "+fotoA.getTipoFoto());
		System.out.println("-Formato: "+fotoA.getFormato());
		System.out.println("-Camara con la que se tomo la foto: "+fotoA.getCamara());
		System.out.println("-Lente con el que se tomo la foto: "+fotoA.getLente());
		
	}
	
}
