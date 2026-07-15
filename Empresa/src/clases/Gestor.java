package clases;
import java.util.Scanner;
public class Gestor {

	public static void main(String[] args) {
		
		Scanner lec = new Scanner(System.in);
		
		
		Dueño duenio1 = new Dueño(1);
		Encargado encargado1 = new Encargado(2);
		Empleado empleado1 = new Empleado(3);
		int opcion = 0;
		
		do {
		System.out.println("\nUsuario: ");
		System.out.println("1. Dueño");
		System.out.println("2. Encargado");
		System.out.println("3. Empleado");
		System.out.println("\nOtras opciones: ");
		System.out.println("4. Salir\n");
		opcion = lec.nextInt();
		
		switch(opcion) {
		
		case 1:
			
			int opcionD = 0;
			System.out.println("\nEnviar mail a: ");
			System.out.println("1. Encargado");
			System.out.println("2. Empleado\n");
			opcionD = lec.nextInt();
			
			if (opcionD == 1) {
				duenio1.mandarMail(encargado1);
			}
			
			if (opcionD == 2) {
				
				duenio1.mandarMail(empleado1);
			}
			break;
		
		case 2:
			
			int opcionE = 0;
			System.out.println("\nEnviar mail a: ");
			System.out.println("1. Empleado");
			System.out.println("2. Dueño\n");
			opcionE = lec.nextInt();
			
			if (opcionE == 1) {
				
				encargado1.mandarMail(empleado1);
				
			}
			if(opcionE ==2) {
				
				encargado1.mandarMail(duenio1);
				
			}
			break;
			
			
		case 3: 
			
			int opcionEm = 0;
			System.out.println("\nEnviar mail a: ");
			System.out.println("1. Encargado");
			System.out.println("2. Dueño\n");
			opcionEm = lec.nextInt();
			
			if (opcionEm == 1) {
				
				empleado1.mandarMail(encargado1);
				
			}
			
			if (opcionEm == 2) {
				
				empleado1.mandarMail(duenio1);
				
			}
			break;
		
		}

	}while(opcion <= 3);

}
}
