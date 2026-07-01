package clases;

import java.util.Scanner;

public class GestorSuper {

	public static void main(String[] args) {

		Electronica electronica1[] = new Electronica[5];
		Ropa ropa1[] = new Ropa[5];
		Alimento alimento1[] = new Alimento[5];

		Scanner lector = new Scanner(System.in);

		int opcion = 0;

		do {

			System.out.println("\n=Gestor de supermercado=\n");
			System.out.println("\n-Eliga tipo de producto a registrar: \n");
			System.out.println("1. Electronica");
			System.out.println("2. Ropa");
			System.out.println("3. Alimento");
			System.out.println("\n-Otras opciones: ");
			System.out.println("\n4. Listar productos");
			System.out.println("5. Eliminar producto");
			System.out.println("6. Modificar producto");
			System.out.println("7. Salir\n");
			opcion = lector.nextInt();

			switch (opcion) {

			case 1:

				System.out.println("=Electronica=");
				System.out.println("Ingresa nombre del producto: ");
				String nombreElectro = lector.next();
				System.out.println("Ingresa precio: ");
				double precioElectro = lector.nextDouble();
				System.out.println("Ingresa la id: ");
				int idElectro = lector.nextInt();
				System.out.println("Ingresa stock: ");
				int stockElectro = lector.nextInt();
				System.out.println("Ingrese marca: ");
				String marcaElectro = lector.next();
				lector.nextLine();
				System.out.println("Ingrese modelo: ");
				String modelo = lector.nextLine();
				System.out.println("Ingrese consumo: ");
				String consumo = lector.next();
				altaElectro(electronica1, nombreElectro, precioElectro, idElectro, stockElectro, marcaElectro, modelo,
						consumo);
				break;

			case 2:

				System.out.println("=Ropa=");
				lector.nextLine();
				System.out.println("Ingresa nombre del producto: ");
				String nombreRopa = lector.nextLine();
				System.out.println("Ingresa precio: ");
				double precioRopa = lector.nextDouble();
				System.out.println("Ingresa la id: ");
				int idRopa = lector.nextInt();
				System.out.println("Ingresa stock: ");
				int stockRopa = lector.nextInt();
				System.out.println("Ingrese material: ");
				String material = lector.next();
				System.out.println("Ingrese genero: ");
				String genero = lector.next();
				System.out.println("Ingrese talle: ");
				String talle = lector.next();
				System.out.println("Ingrese corte: ");
				String corte = lector.next();
				lector.nextLine();
				System.out.println("Ingrese marca: ");
				String marca = lector.nextLine();
				System.out.println("Ingrese color: ");
				String color = lector.nextLine();
				altaRopa(ropa1, nombreRopa, precioRopa, idRopa, stockRopa, material, genero, talle, corte, marca,
						color);

				break;

			case 3:
				System.out.println("=Alimentos=");
				System.out.println("Ingresa nombre del producto: ");
				String nombreAlimento = lector.next();
				System.out.println("Ingresa precio: ");
				double precioAlimento = lector.nextDouble();
				System.out.println("Ingresa la id: ");
				int idAlimento = lector.nextInt();
				System.out.println("Ingresa stock: ");
				int stockAlimento = lector.nextInt();
				System.out.println("Ingrese marca: ");
				lector.nextLine();
				String marcaAlimento = lector.nextLine();
				System.out.println("Ingrese contenido: ");
				String contenido = lector.nextLine();
				System.out.println("Ingrese tipo de almacenamiento (Seco, refrigerado, congelado): ");
				String almacen = lector.next();
				lector.nextLine();
				System.out.println("Ingrese fecha de caducidad: ");
				String fechaCad = lector.nextLine();
				altaAlimento(alimento1, nombreAlimento, precioAlimento, idAlimento, stockAlimento, marcaAlimento,
						contenido, almacen, fechaCad);
				break;
			case 4:

				listarElectro(electronica1);

				listarRopa(ropa1);

				listarAlimentos(alimento1);
				break;

			case 5:

				System.out.println("Categoria del producto que desea eliminar:");
				System.out.println("1. Electro");
				System.out.println("2. Ropa");
				System.out.println("3. Alimento");
				int opcionEliminar = lector.nextInt();
				System.out.println("Ingrese la id de producto que desea eliminar: ");
				int idEliminar = lector.nextInt();

				if (opcionEliminar == 1) {
					bajaElectro(idEliminar, electronica1);
				}
				if (opcionEliminar == 2) {
					bajaRopa(idEliminar, ropa1);
				}
				if (opcionEliminar == 3) {
					bajaAlimento(idEliminar, alimento1);
					
				}
				break;

			case 6:

				System.out.println("Categoria del producto que desea modificar:");
				System.out.println("1. Electro");
				System.out.println("2. Ropa");
				System.out.println("3. Alimento");
				int opcionMod = lector.nextInt();
				System.out.println("Ingrese id del producto que desea modificar: ");
				int idMod = lector.nextInt();
				String nuevoNombreElectro = null;
				int nuevoStockElectro = 0;
				double nuevoPrecioElectro = 0;
				String nuevoColor = null;
				int nuevoStockRopa = 0;
				double nuevoPrecioRopa = 0;
				int nuevoStockAlimento = 0;
				double nuevoPrecioAlimento = 0;
				String nuevaFecha = null;
				int atributoModElectro = 0;
				int atributoModRopa = 0;
				int atributoModAlimento = 0;

				if (opcionMod == 1) {

					System.out.println("\nSeleccione dato que desea modificar: \n");
					System.out.println("1. Nombre");
					System.out.println("2. Stock");
					System.out.println("3. Precio");
					atributoModElectro = lector.nextInt();

					modElectro(electronica1, opcionMod, idMod, atributoModElectro, nuevoNombreElectro,
							nuevoStockElectro, nuevoPrecioElectro);

					System.out.println("\nProducto modificado correctamente. \n");
					break;

				}

				if (opcionMod == 2) {

					System.out.println("\nSeleccione dato que desea modificar: \n");
					System.out.println("1. Color");
					System.out.println("2. Stock");
					System.out.println("3. Precio");
					atributoModRopa = lector.nextInt();

					modRopa(ropa1, opcionMod, idMod, atributoModRopa, nuevoColor, nuevoStockRopa,
							nuevoPrecioRopa);

					System.out.println("\nProducto modificado correctamente. \n");
					break;

				}
				if (opcionMod == 3) {

					System.out.println("\nSeleccione dato que desea modificar: \n");
					System.out.println("1. Precio");
					System.out.println("2. Stock");
					System.out.println("3. Fecha de caducidad");
					atributoModAlimento = lector.nextInt();

					modAlimento(alimento1, opcionMod, idMod, atributoModAlimento, nuevoStockAlimento,
							nuevoPrecioAlimento, nuevaFecha);
					System.out.println("\nProducto modificado correctamente. \n");
					break;
				}

			}

		} while (opcion <= 6);

	}

	public static void altaElectro(Electronica[] ar, String ne, double pe, int ide, int se, String me, String m,
			String c) {

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {
				ar[i] = new Electronica(ne, pe, ide, se, me, m, c);
				System.out.println("\nProducto ingresado correctamente.\n");
				break;
			}

		}

	}

	public static void altaRopa(Ropa[] ar, String nr, double pr, int idr, int sr, String mat, String g, String t,
			String cor, String mar, String col) {

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == null) {
				ar[i] = new Ropa(nr, pr, idr, sr, mat, g, t, cor, mar, col);
				System.out.println("\nProducto ingresado correctamente.\n");
				break;
			}

		}

	}

	public static void altaAlimento(Alimento[] ar, String na, double pa, int ida, int sa, String ma, String con,
			String ta, String fc) {

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == null) {
				ar[i] = new Alimento(na, pa, ida, sa, ma, con, ta, fc);
				System.out.println("\nProducto ingresado correctamente.\n");
				break;
			}

		}

	}

	public static void listarElectro(Electronica[] a) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] != null) {

				System.out.println("\n=Electronica" + "| Producto N°" + i + " |");

				System.out.println("Nombre: " + a[i].getNombre());
				System.out.println("Precio: " + a[i].getPrecio());
				System.out.println("Codigo id: " + a[i].getIdProducto());
				System.out.println("Stock: " + a[i].getStock());
				System.out.println("Marca: " + a[i].getMarca());
				System.out.println("Modelo: " + a[i].getModelo());
				System.out.println("Consumo: " + a[i].getConsumo());

			}

		}
	}

	public static void listarRopa(Ropa[] b) {
		for (int i = 0; i < b.length; i++) {

			if (b[i] != null) {

				System.out.println("\n=Ropa" + "| Producto N°" + i + " |");
				System.out.println("Nombre: " + b[i].getNombre());
				System.out.println("Precio: " + b[i].getPrecio());
				System.out.println("Codigo id: " + b[i].getIdProducto());
				System.out.println("Stock: " + b[i].getStock());
				System.out.println("Material: " + b[i].getMaterial());
				System.out.println("Genero: " + b[i].getGenero());
				System.out.println("Talle: " + b[i].getTalle());
				System.out.println("Corte: " + b[i].getCorte());
				System.out.println("Marca: " + b[i].getMarca());
				System.out.println("Color: " + b[i].getColor());
			}

		}
	}

	public static void listarAlimentos(Alimento[] c) {
		for (int i = 0; i < c.length; i++) {
			if (c[i] != null) {

				System.out.println("\n=Alimentos" + "| Producto N°" + i + " |");
				System.out.println("Nombre: " + c[i].getNombre());
				System.out.println("Precio: " + c[i].getPrecio());
				System.out.println("Codigo id: " + c[i].getIdProducto());
				System.out.println("Stock: " + c[i].getStock());
				System.out.println("Marca: " + c[i].getMarca());
				System.out.println("Contenido: " + c[i].getContenido());
				System.out.println("Tipo de almacenamiento: " + c[i].getTipoAlmacenamiento());
				System.out.println("Fecha de caducidad: " + c[i].getFechaCaducidad());

			}

		}

	}

	public static void bajaElectro(int idProducto, Electronica[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i].getIdProducto() == idProducto) {
				a[i] = null;
				System.out.println("\n[Producto eliminado exitosamente...]\n");
				break;
			}
		}
	}

	public static void bajaRopa(int idProducto, Ropa[] b) {

		for (int i = 0; i < b.length; i++) {
			if (b[i].getIdProducto() == idProducto) {
				b[i] = null;
				System.out.println("\n[Producto eliminado exitosamente...]\n");
				break;
			}
		}
	}

	public static void bajaAlimento(int idProducto, Alimento[] c) {

		for (int i = 0; i < c.length; i++) {
			if (c[i].getIdProducto() == idProducto) {
				c[i] = null;
				System.out.println("\n[Producto eliminado exitosamente...]\n");
				break;

			}
		}
	}

	public static void modElectro(Electronica[] a, int opcionMod, int idMod, int atributoModElectro,
			String nuevoNombreElectro, int nuevoStockElectro, double nuevoPrecioElectro) {

		Scanner lector = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			if (a[i] != null && a[i].getIdProducto() == idMod) {
				if (atributoModElectro == 1) {
					System.out.println("Ingrese nuevo nombre: ");
					nuevoNombreElectro = lector.nextLine();
					a[i].setNombre(nuevoNombreElectro);
					break;
				}
				if (atributoModElectro == 2) {
					System.out.println("Ingrese nuevo stock: ");
					nuevoStockElectro = lector.nextInt();
					a[i].setStock(nuevoStockElectro);
					break;
				}
				if (atributoModElectro == 3) {
					System.out.println("Ingrese nuevo precio: ");
					nuevoPrecioElectro = lector.nextDouble();
					a[i].setPrecio(nuevoPrecioElectro);
					break;
				}
			} else {

				System.out.println("Test if");

			}

		}

	}

	public static void modRopa(Ropa[] b, int opcionMod, int idMod, int atributoModRopa, String nuevoColor,
			int nuevoStockRopa, double nuevoPrecioRopa) {

		Scanner lector = new Scanner(System.in);
		for (int i = 0; i < b.length; i++) {
			if (b[i] != null && b[i].getIdProducto() == idMod) {

				if (atributoModRopa == 1) {
					System.out.println("Ingrese nuevo color: ");
					nuevoColor = lector.nextLine();
					b[i].setColor(nuevoColor);
					break;
				}
				if (atributoModRopa == 2) {
					System.out.println("Ingrese nuevo stock: ");
					nuevoStockRopa = lector.nextInt();
					b[i].setStock(nuevoStockRopa);
					break;
				}
				if (atributoModRopa == 3) {
					System.out.println("Ingrese nuevo precio: ");
					nuevoPrecioRopa = lector.nextDouble();
					b[i].setPrecio(nuevoPrecioRopa);
					break;
				}
			} else {

				System.out.println("Test if");

			}

		}

	}

	public static void modAlimento(Alimento[] c, int opcionMod, int idMod, int atributoModAlimento,
			int nuevoStockAlimento, double nuevoPrecioAlimento, String nuevaFecha) {

		Scanner lector = new Scanner(System.in);
		for (int i = 0; i < c.length; i++) {
			if (c[i] != null && c[i].getIdProducto() == idMod) {

				if (atributoModAlimento == 1) {
					System.out.println("Ingrese nuevo precio: ");
					nuevoPrecioAlimento = lector.nextInt();
					c[i].setPrecio(nuevoPrecioAlimento);
					break;
				}
				if (atributoModAlimento == 2) {
					System.out.println("Ingrese nuevo stock: ");
					nuevoStockAlimento = lector.nextInt();
					c[i].setStock(nuevoStockAlimento);
					break;
				}
				if (atributoModAlimento == 3) {
					System.out.println("Ingrese nueva fecha de caducidad: ");
					nuevaFecha = lector.next();
					c[i].setFechaCaducidad(nuevaFecha);
					break;
				}

			}
		}
	}

}
