package clases;

import java.util.Scanner;

public class GestorMundo {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		Libro libro1 = new Libro(null, null, null, 0, 0, null, null, null);
		Revista revista1 = new Revista(null, null, null, 0, 0, null, null, 0);
		ArticuloCientifico articulo1 = new ArticuloCientifico(null, null, null, 0, 0, null, null, null, null);

		System.out.println("Bienvenido al programa");
		System.out.println("=LIBRO=");
		System.out.println("Ingrese titulo del libro: ");
		String tituloLibro = lector.nextLine();
		System.out.println("Ingrese fecha de publicacion: ");
		String fechaLibro = lector.next();
		lector.nextLine();
		System.out.println("Ingrese nombre/s de autor/es: ");
		String autorLibro = lector.nextLine();
		System.out.println("Ingrese id: ");
		int idLibro = lector.nextInt();
		System.out.println("Ingrese cantidad de paginas: ");
		int paginasLibro = lector.nextInt();
		System.out.println("Ingrese ISBN: ");
		String isbn = lector.next();
		System.out.println("Ingrese genero: ");
		String genero = lector.next();
		lector.nextLine();
		System.out.println("Ingrese tipo de tapa: ");
		String tapa = lector.next();

		libro1.setTitulo(tituloLibro);
		libro1.setFecha(fechaLibro);
		libro1.setAutores(autorLibro);
		libro1.setId(idLibro);
		libro1.setNumPaginas(paginasLibro);
		libro1.setIsbn(isbn);
		libro1.setGenero(genero);
		libro1.setTapa(tapa);

		System.out.println("=REVISTA=");
		lector.nextLine();
		System.out.println("Ingrese titulo de la revista: ");
		String tituloRevista = lector.nextLine();
		System.out.println("Ingrese fecha de publicacion: ");
		String fechaRevista = lector.next();
		lector.nextLine();
		System.out.println("Ingrese nombre/s de autor/es: ");
		String autorRevista = lector.nextLine();
		System.out.println("Ingrese id: ");
		int idRevista = lector.nextInt();
		System.out.println("Ingrese cantidad de paginas: ");
		int paginasRevista = lector.nextInt();
		System.out.println("Ingrese ISSN: ");
		String issn = lector.next();
		System.out.println("Ingrese tematica: ");
		String tematica = lector.next();
		System.out.println("Ingrese edicion");
		int edicion = lector.nextInt();

		revista1.setTitulo(tituloRevista);
		revista1.setFecha(fechaRevista);
		revista1.setAutores(autorRevista);
		revista1.setId(idRevista);
		revista1.setNumPaginas(paginasRevista);
		revista1.setIssn(issn);
		revista1.setTematica(tematica);
		revista1.setNumeroEdicion(edicion);

		System.out.println("=ARTICULO CIENTIFICO=");
		lector.nextLine();
		System.out.println("Ingrese titulo del articulo cientifico: ");
		String tituloArticulo = lector.nextLine();
		System.out.println("Ingrese fecha de publicacion: ");
		String fechaArticulo = lector.next();
		lector.nextLine();
		System.out.println("Ingrese nombre/s de autor/es: ");
		String autorArticulo = lector.nextLine();
		System.out.println("Ingrese id: ");
		int idArticulo = lector.nextInt();
		System.out.println("Ingrese cantidad de paginas: ");
		int paginasArticulo = lector.nextInt();
		System.out.println("Ingrese DOI: ");
		String doi = lector.next();
		System.out.println("Ingrese el nombre de la revista donde se publico el articulo: ");
		String revista = lector.next();
		System.out.println("Ingrese un breve resumen del articulo: ");
		String sintesis = lector.next();
		System.out.println("Ingrese institucion del articulo: ");
		String institucion = lector.next();

		articulo1.setTitulo(tituloArticulo);
		articulo1.setFecha(fechaArticulo);
		articulo1.setAutores(autorArticulo);
		articulo1.setId(idArticulo);
		articulo1.setNumPaginas(paginasArticulo);
		articulo1.setDoi(doi);
		articulo1.setRevistaPublicacion(revista);
		articulo1.setSintesis(sintesis);
		articulo1.setInstitucion(institucion);

		System.out.println("\n=LIBRO=\n");
		System.out.println("-Titulo del libro: "+libro1.getTitulo());
		System.out.println("-Fecha de publicacion: "+libro1.getFecha());
		System.out.println("-Nombre/s de autor/es: "+libro1.getAutores());
		System.out.println("-Id: "+libro1.getId());
		System.out.println("-Cantidad de paginas: "+libro1.getNumPaginas());
		System.out.println("-ISBN: "+libro1.getIsbn());
		System.out.println("-Genero: "+libro1.getGenero());
		System.out.println("-Tipo de tapa: "+libro1.getTapa());
		
		System.out.println("\n=REVISTA=\n");
		System.out.println("-Titulo de la revista: "+revista1.getTitulo());
		System.out.println("-Fecha de publicacion: "+revista1.getFecha());
		System.out.println("-Nombre/s de autor/es: "+revista1.getAutores());
		System.out.println("-Id: "+revista1.getId());
		System.out.println("-Cantidad de paginas: "+revista1.getNumPaginas());
		System.out.println("-ISSN: "+revista1.getIssn());
		System.out.println("-Tematica: "+revista1.getTematica());
		System.out.println("-Edicion: "+revista1.getNumeroEdicion());
		
		System.out.println("\n=ARTICULO CIENTIFICO=\n");
		System.out.println("-Titulo del articulo cientifico: "+articulo1.getTitulo());
		System.out.println("-Fecha de publicacion: "+articulo1.getFecha());
		System.out.println("-Nombre/s de autor/es: "+articulo1.getAutores());	
		System.out.println("-Id: "+articulo1.getId());	
		System.out.println("-Cantidad de paginas: "+articulo1.getNumPaginas());		
		System.out.println("-DOI: "+articulo1.getDoi());
		System.out.println("-Nombre de la revista donde se publico el articulo: "+articulo1.getRevistaPublicacion());
		System.out.println("-Resumen del articulo: "+articulo1.getSintesis());
		System.out.println("-Institucion del articulo: "+articulo1.getInstitucion());
		
	

	}

}
