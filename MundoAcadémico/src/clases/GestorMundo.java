package clases;

import java.util.Scanner;

public class GestorMundo {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		Libro libro1 = new Libro(null, null, null, 0, 0, null, null, null);
		Revista revista1 = new Revista(null, null, null, 0, 0, null, null, 0);
		ArticuloCientifico articulo1 = new ArticuloCientifico(null, null, null, 0, 0, null, null, null, null);
		int opcion = 0;

		do {

			System.out.println("[Menú académico]");
			System.out.println("\n--Seleccione una opción--");
			System.out.println("[1. Registrar libro              ]");
			System.out.println("[2. Registrar revista            ]");
			System.out.println("[3. Registrar articulo científico]");
			System.out.println("[4. Listar todo                  ]");
			opcion = lector.nextInt();

			switch (opcion) {

			case 1:

				System.out.println("\n=LIBRO=");
				lector.nextLine();
				System.out.println("\nIngrese titulo del libro: ");
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

				altaLibro(libro1, tituloLibro, fechaLibro, autorLibro, idLibro, paginasLibro, isbn, genero, tapa);
				break;

			case 2:

				System.out.println("\n=REVISTA=");
				lector.nextLine();
				System.out.println("\nIngrese titulo de la revista: ");
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
				lector.nextLine();
				System.out.println("Ingrese tematica: ");
				String tematica = lector.nextLine();
				System.out.println("Ingrese edicion");
				int edicion = lector.nextInt();

				altaRevista(revista1, tituloRevista, fechaRevista, autorRevista, idRevista, paginasRevista, issn,
						tematica, edicion);
				break;

			case 3:

				System.out.println("\n=ARTICULO CIENTIFICO=");
				lector.nextLine();
				System.out.println("\nIngrese titulo del articulo cientifico: ");
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
				lector.nextLine();
				System.out.println("Ingrese un breve resumen del articulo: ");
				String sintesis = lector.nextLine();
				System.out.println("Ingrese institucion del articulo: ");
				String institucion = lector.next();

				altaArticulo(articulo1, tituloArticulo, fechaArticulo, autorArticulo, idArticulo, paginasArticulo, doi,
						revista, sintesis, institucion);
				break;

			case 4:

				listaLibro(libro1);
				listaRevista(revista1);
				listaArticulo(articulo1);
				break;

			}

		} while (opcion <= 4);
	}

	public static void altaLibro(Libro libroa, String tituloLibro, String fechaLibro, String autorLibro, int idLibro,
			int paginasLibro, String isbn, String genero, String tapa) {

		libroa.setTitulo(tituloLibro);
		libroa.setFecha(fechaLibro);
		libroa.setAutores(autorLibro);
		libroa.setId(idLibro);
		libroa.setNumPaginas(paginasLibro);
		libroa.setIsbn(isbn);
		libroa.setGenero(genero);
		libroa.setTapa(tapa);

	}

	public static void altaRevista(Revista revistab, String tituloRevista, String fechaRevista, String autorRevista,
			int idRevista, int paginasRevista, String issn, String tematica, int edicion) {

		revistab.setTitulo(tituloRevista);
		revistab.setFecha(fechaRevista);
		revistab.setAutores(autorRevista);
		revistab.setId(idRevista);
		revistab.setNumPaginas(paginasRevista);
		revistab.setIssn(issn);
		revistab.setTematica(tematica);
		revistab.setNumeroEdicion(edicion);

	}

	public static void altaArticulo(ArticuloCientifico articuloc, String tituloArticulo, String fechaArticulo,
			String autorArticulo, int idArticulo, int paginasArticulo, String doi, String revista, String sintesis,
			String institucion) {

		articuloc.setTitulo(tituloArticulo);
		articuloc.setFecha(fechaArticulo);
		articuloc.setAutores(autorArticulo);
		articuloc.setId(idArticulo);
		articuloc.setNumPaginas(paginasArticulo);
		articuloc.setDoi(doi);
		articuloc.setRevistaPublicacion(revista);
		articuloc.setSintesis(sintesis);
		articuloc.setInstitucion(institucion);

	}

	public static void listaLibro(Libro libroa) {

		System.out.println("\n=LIBRO=\n");
		System.out.println("-Titulo del libro: " + libroa.getTitulo());
		System.out.println("-Fecha de publicacion: " + libroa.getFecha());
		System.out.println("-Nombre/s de autor/es: " + libroa.getAutores());
		System.out.println("-Id: " + libroa.getId());
		System.out.println("-Cantidad de paginas: " + libroa.getNumPaginas());
		System.out.println("-ISBN: " + libroa.getIsbn());
		System.out.println("-Genero: " + libroa.getGenero());
		System.out.println("-Tipo de tapa: " + libroa.getTapa());

	}

	public static void listaRevista(Revista revistab) {

		System.out.println("\n=REVISTA=\n");
		System.out.println("-Titulo de la revista: " + revistab.getTitulo());
		System.out.println("-Fecha de publicacion: " + revistab.getFecha());
		System.out.println("-Nombre/s de autor/es: " + revistab.getAutores());
		System.out.println("-Id: " + revistab.getId());
		System.out.println("-Cantidad de paginas: " + revistab.getNumPaginas());
		System.out.println("-ISSN: " + revistab.getIssn());
		System.out.println("-Tematica: " + revistab.getTematica());
		System.out.println("-Edicion: " + revistab.getNumeroEdicion());

	}

	public static void listaArticulo(ArticuloCientifico articuloc) {

		System.out.println("\n=ARTICULO CIENTIFICO=\n");
		System.out.println("-Titulo del articulo cientifico: " + articuloc.getTitulo());
		System.out.println("-Fecha de publicacion: " + articuloc.getFecha());
		System.out.println("-Nombre/s de autor/es: " + articuloc.getAutores());
		System.out.println("-Id: " + articuloc.getId());
		System.out.println("-Cantidad de paginas: " + articuloc.getNumPaginas());
		System.out.println("-DOI: " + articuloc.getDoi());
		System.out.println("-Nombre de la revista donde se publico el articulo: " + articuloc.getRevistaPublicacion());
		System.out.println("-Resumen del articulo: " + articuloc.getSintesis());
		System.out.println("-Institucion del articulo: " + articuloc.getInstitucion());

	}
}
