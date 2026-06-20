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

			System.out.println("=Gestor de supermercado=");
			System.out.println("Eliga tipo de producto a registrar: ");
			System.out.println("1. Electronica");
			System.out.println("2. Ropa");
			System.out.println("3. Alimento");
			System.out.println("Otras opciones: ");
			System.out.println("4. Listar productos");
			System.out.println("5. Salir");
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
				System.out.println("Ingrese modelo: ");
				String modelo = lector.next();
				System.out.println("Ingrese consumo: ");
				String consumo = lector.next();
				altaElectro(electronica1, nombreElectro, precioElectro, idElectro, stockElectro, marcaElectro, modelo,
						consumo);
				break;

			case 2:

				System.out.println("=Ropa=");
				System.out.println("Ingresa nombre del producto: ");
				String nombreRopa = lector.next();
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
				System.out.println("Ingrese marca: ");
				String marca = lector.next();
				System.out.println("Ingrese color: ");
				String color = lector.next();
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
				String marcaAlimento = lector.next();
				System.out.println("Ingrese contenido: ");
				String contenido = lector.next();
				System.out.println("Ingrese tipo de almacenamiento (Seco, refrigerado, congelado): ");
				String almacen = lector.next();
				System.out.println("Ingrese fecha de caducidad: ");
				String fechaCad = lector.next();
				altaAlimento(alimento1, nombreAlimento, precioAlimento, idAlimento, stockAlimento, marcaAlimento,
						contenido, almacen, fechaCad);
				break;
			case 4:

				listarElectro(electronica1);
				listarRopa(ropa1);
				listarAlimentos(alimento1);
				break;
			}

		} while (opcion <= 4);

	}

	public static void altaElectro(Electronica[] ar, String ne, double pe, int ide, int se, String me, String m,
			String c) {

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {
				ar[i] = new Electronica(ne, pe, ide, se, me, m, c);

				break;
			}

		}

	}

	public static void altaRopa(Ropa[] ar, String nr, double pr, int idr, int sr, String mat, String g, String t,
			String cor, String mar, String col) {

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == null) {
				ar[i] = new Ropa(nr, pr, idr, sr, mat, g, t, cor, mar, col);

			}

		}

	}

	public static void altaAlimento(Alimento[] ar, String na, double pa, int ida, int sa, String ma, String con,
			String ta, String fc) {

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == null) {
				ar[i] = new Alimento(na, pa, ida, sa, ma, con, ta, fc);
			}

		}

	}

	public static void listarElectro(Electronica[] a) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] == null) {

			} else {

				System.out.println("=Electronica");

				System.out.println("Nombre: " + a[i].getNombre());
				System.out.println("Precio: " + a[i].getPrecio());
				System.out.println("Codigo id: " + a[i].getIdProducto());
				System.out.println("Stock: " + a[i].getStock());
				System.out.println("Marca: " + a[i].getMarca());
				System.out.println("Modelo: " + a[i].getMarca());
				System.out.println("Consumo: " + a[i].getConsumo());
				break;
			}
		}

	}

	public static void listarRopa(Ropa[] b) {
		for (int i = 0; i < b.length; i++) {
			if (b[i] == null) {

			} else {
				System.out.println("=Ropa");
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
				break;
			}
		}
	}

	public static void listarAlimentos(Alimento[] c) {
		for (int i = 0; i < c.length; i++) {
			if (c[i] == null) {

			} else {
				System.out.println("=Alimentos");
				System.out.println("Nombre: " + c[i].getNombre());
				System.out.println("Precio: " + c[i].getPrecio());
				System.out.println("Codigo id: " + c[i].getIdProducto());
				System.out.println("Stock: " + c[i].getStock());
				System.out.println("Marca: " + c[i].getMarca());
				System.out.println("Contenido: " + c[i].getContenido());
				System.out.println("Tipo de almacenamiento: " + c[i].getTipoAlmacenamiento());
				System.out.println("Fecha de caducidad: " + c[i].getFechaCaducidad());
				break;
			}

		}
	}
}
