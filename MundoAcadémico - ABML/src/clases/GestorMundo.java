package clases;

import java.util.Scanner;

public class GestorMundo {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		Libro libro1[] = new Libro[5];
		Revista revista1[] = new Revista[5];
		ArticuloCientifico articulo1[] = new ArticuloCientifico[5];
		int opcion = 0;

		do {

			System.out.println("\n[Menú académico]");
			System.out.println("\n--Seleccione una opción--");
			System.out.println("[1. Registrar libro              ]");
			System.out.println("[2. Registrar revista            ]");
			System.out.println("[3. Registrar articulo científico]");
			System.out.println("[4. Listar todo                  ]");
			System.out.println("[5. Eliminar publicación         ]");
			System.out.println("[6. Modificar publicación        ]");
			System.out.println("[7. Salir                        ]\n");
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
				String institucion = lector.nextLine();

				altaArticulo(articulo1, tituloArticulo, fechaArticulo, autorArticulo, idArticulo, paginasArticulo, doi,
						revista, sintesis, institucion);
				break;

			case 4:

				listaLibro(libro1);
				listaRevista(revista1);
				listaArticulo(articulo1);
				break;

			case 5:

				System.out.println("Seleccione categoria donde desee eliminar una publicacion: ");
				System.out.println("[1. Libro              ]");
				System.out.println("[2. Revista            ]");
				System.out.println("[3. Articulo científico]");
				int opcionEliminar = lector.nextInt();
				System.out.println("Ingrese id de la publicacion que desea eliminar: ");
				int idEliminar = lector.nextInt();

				if (opcionEliminar == 1) {
					bajaLibro(idEliminar, libro1);

				}
				if (opcionEliminar == 2) {
					bajaRevista(idEliminar, revista1);
				}
				if (opcionEliminar == 3) {
					bajaArticulo(idEliminar, articulo1);

				}
				break;

			case 6:

				System.out.println("Seleccione tipo de publicacion que desee modificar: ");
				System.out.println("[1. Libro              ]");
				System.out.println("[2. Revista            ]");
				System.out.println("[3. Articulo científico]");
				int opcionMod = lector.nextInt();
				System.out.println("Ingrese id de la publicacion que desee modificar: ");
				int idMod = lector.nextInt();
				int nuevaIdLibro = 0;
				String nuevaIsbn = null;
				int nuevaIdRevista = 0;
				String nuevaIssn = null;
				int nuevaIdArticulo = 0;
				String nuevoDoi = null;
				int atributoModLibro = 0;
				int atributoModRevista = 0;
				int atributoModArticulo = 0;

				if (opcionMod == 1) {

					System.out.println("Seleccione dato que desee modificar: ");
					System.out.println("[1. Id  ]");
					System.out.println("[2. ISBN]");
					atributoModLibro = lector.nextInt();

					modLibro(libro1, opcionMod, idMod, atributoModLibro, nuevaIdLibro, nuevaIsbn);
					System.out.println("Libro modificado correctamente. ");

				}

				if (opcionMod == 2) {

					System.out.println("Seleccione dato que desee modificar: ");
					System.out.println("[1. Id  ]");
					System.out.println("[2. ISSN]");
					atributoModRevista = lector.nextInt();

					modRevista(revista1, opcionMod, idMod, atributoModRevista, nuevaIdRevista, nuevaIssn);
					System.out.println("Revista modificada correctamente. ");

				}
				if (opcionMod == 3) {

					System.out.println("Seleccione dato que desee modificar: ");
					System.out.println("[1. Id  ]");
					System.out.println("[2. DOI ]");
					atributoModArticulo = lector.nextInt();

					modArticulo(articulo1, opcionMod, idMod, atributoModArticulo, nuevaIdArticulo, nuevoDoi);
					System.out.println("Articulo cientifico modificado correctamente. ");

				}
				break;

			case 7:
				System.out.println("Saliendo... ");

			}

		} while (opcion <= 6);
	}

	public static void altaLibro(Libro[] a, String tituloLibro, String fechaLibro, String autorLibro, int idLibro,
			int paginasLibro, String isbn, String genero, String tapa) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == null) {
				a[i] = new Libro(tituloLibro, fechaLibro, autorLibro, idLibro, paginasLibro, isbn, genero, tapa);
				System.out.println("Libro ingresado correctamente. ");
				break;
			}
		}

	}

	public static void altaRevista(Revista[] b, String tituloRevista, String fechaRevista, String autorRevista,
			int idRevista, int paginasRevista, String issn, String tematica, int edicion) {
		for (int i = 0; i < b.length; i++) {
			if (b[i] == null) {
				b[i] = new Revista(tituloRevista, fechaRevista, autorRevista, idRevista, paginasRevista, issn, tematica,
						edicion);
				System.out.println("Revista ingresada correctamente. ");
				break;
			}
		}

	}

	public static void altaArticulo(ArticuloCientifico[] c, String tituloArticulo, String fechaArticulo,
			String autorArticulo, int idArticulo, int paginasArticulo, String doi, String revista, String sintesis,
			String institucion) {

		for (int i = 0; i < c.length; i++) {
			if (c[i] == null) {
				c[i] = new ArticuloCientifico(tituloArticulo, fechaArticulo, autorArticulo, idArticulo, paginasArticulo,
						doi, revista, sintesis, institucion);
				System.out.println("Articulo cientifico ingresado correctamente. ");
				break;
			}
		}

	}

	public static void listaLibro(Libro[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {

				System.out.println("\n=LIBRO=                | N° "+i+"\n");
				System.out.println("-Titulo del libro: " + a[i].getTitulo());
				System.out.println("-Fecha de publicacion: " + a[i].getFecha());
				System.out.println("-Nombre/s de autor/es: " + a[i].getAutores());
				System.out.println("-Id: " + a[i].getId());
				System.out.println("-Cantidad de paginas: " + a[i].getNumPaginas());
				System.out.println("-ISBN: " + a[i].getIsbn());
				System.out.println("-Genero: " + a[i].getGenero());
				System.out.println("-Tipo de tapa: " + a[i].getTapa());
			}

		}
	}

	public static void listaRevista(Revista[] b) {
		for (int i = 0; i < b.length; i++) {
			if (b[i] != null) {
				System.out.println("\n=REVISTA=              | N° "+i+"\n");
				System.out.println("-Titulo de la revista: " + b[i].getTitulo());
				System.out.println("-Fecha de publicacion: " + b[i].getFecha());
				System.out.println("-Nombre/s de autor/es: " + b[i].getAutores());
				System.out.println("-Id: " + b[i].getId());
				System.out.println("-Cantidad de paginas: " + b[i].getNumPaginas());
				System.out.println("-ISSN: " + b[i].getIssn());
				System.out.println("-Tematica: " + b[i].getTematica());
				System.out.println("-Edicion: " + b[i].getNumeroEdicion());

			}
		}
	}

	public static void listaArticulo(ArticuloCientifico[] c) {
		for (int i = 0; i < c.length; i++) {
			if (c[i] != null) {
				System.out.println("\n=ARTICULO CIENTIFICO=  | N° "+i+"\n");
				System.out.println("-Titulo del articulo cientifico: " + c[i].getTitulo());
				System.out.println("-Fecha de publicacion: " + c[i].getFecha());
				System.out.println("-Nombre/s de autor/es: " + c[i].getAutores());
				System.out.println("-Id: " + c[i].getId());
				System.out.println("-Cantidad de paginas: " + c[i].getNumPaginas());
				System.out.println("-DOI: " + c[i].getDoi());
				System.out.println("-Nombre de la revista donde se publico el articulo: " + c[i].getRevistaPublicacion());
				System.out.println("-Resumen del articulo: " + c[i].getSintesis());
				System.out.println("-Institucion del articulo: " + c[i].getInstitucion());

			}
		}
	}

	public static void bajaLibro(int id, Libro[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i].getId() == id) {
				a[i] = null;
				System.out.println("\nLibro dado de baja exitosamente.\n");
				break;

			}

		}

	}

	public static void bajaRevista(int id, Revista[] b) {
		for (int i = 0; i < b.length; i++) {
			if (b[i].getId() == id) {
				b[i] = null;
				System.out.println("\nRevista dada de baja exitosamente.\n");
				break;

			}

		}

	}

	public static void bajaArticulo(int id, ArticuloCientifico[] c) {
		for (int i = 0; i < c.length; i++) {
			if (c[i].getId() == id) {
				c[i] = null;
				System.out.println("\nArticulo Cientifico dado de baja exitosamente.\n");
				break;

			}

		}

	}

	public static void modLibro(Libro[] a, int opcionMod, int idMod, int atributoModLibro, int nuevaIdLibro,
			String nuevaIsbn) {

		Scanner lector = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			if (a[i] != null && a[i].getId() == idMod) {
				if (atributoModLibro == 1) {
					System.out.println("Ingrese nueva id: ");
					nuevaIdLibro = lector.nextInt();
					a[i].setId(nuevaIdLibro);
					break;
				}
				if (atributoModLibro == 2) {
					System.out.println("ingrese nueva ISBN: ");
					nuevaIsbn = lector.next();
					a[i].setIsbn(nuevaIsbn);
					break;

				}
			}

		}

	}

	public static void modRevista(Revista[] b, int opcionMod, int idMod, int atributoModRevista, int nuevaIdRevista,
			String nuevaIssn) {

		Scanner lector = new Scanner(System.in);

		for (int i = 0; i < b.length; i++) {
			if (b[i] != null && b[i].getId() == idMod) {
				if (atributoModRevista == 1) {
					System.out.println("Ingrese nueva id: ");
					nuevaIdRevista = lector.nextInt();
					b[i].setId(nuevaIdRevista);
					break;
				}
				if (atributoModRevista == 2) {
					System.out.println("ingrese nueva ISSN: ");
					nuevaIssn = lector.next();
					b[i].setIssn(nuevaIssn);
					break;

				}
			}

		}

	}

	public static void modArticulo(ArticuloCientifico[] c, int opcionMod, int idMod, int atributoModArticulo,
			int nuevaIdArticulo, String nuevoDoi) {

		Scanner lector = new Scanner(System.in);

		for (int i = 0; i < c.length; i++) {
			if (c[i] != null && c[i].getId() == idMod) {
				if (atributoModArticulo == 1) {
					System.out.println("Ingrese nueva id: ");
					nuevaIdArticulo = lector.nextInt();
					c[i].setId(nuevaIdArticulo);
					break;
				}
				if (atributoModArticulo == 2) {
					System.out.println("ingrese nuevo DOI: ");
					nuevoDoi = lector.next();
					c[i].setDoi(nuevoDoi);
					break;

				}
			}

		}

	}
}
