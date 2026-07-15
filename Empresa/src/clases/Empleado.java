package clases;

public class Empleado extends Persona{

	
	public Empleado(int tipo) {
		super(tipo);
		
	}

	public void mandarMail(Persona destinatario) {
		
		if(destinatario.getTipo() == 1) {
			
			System.out.println("Mail no enviado. El destinatario es incompatible.");
			
			
		}
		
		if(destinatario.getTipo() == 2){
			
			System.out.println("Mail enviado exitosamente a encargado.");
			
		}
			
			
		}
		
	}


