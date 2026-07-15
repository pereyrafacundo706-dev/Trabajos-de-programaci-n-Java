package clases;

public class Encargado extends Persona {

	public Encargado(int tipo) {
		super(tipo);
		
	}

	public void mandarMail(Persona destinatario) {

		if(destinatario.getTipo() == 1) {
			
			System.out.println("Mail enviado exitosamente a dueño");
			
		}
		
		if(destinatario.getTipo() == 3) {
			
			System.out.println("Mail enviado exitosamente a empleado");
			
		}
		
	}

}
