package clases;

public class Dueño extends Persona {

	public Dueño(int tipo) {
		super(tipo);
		
	}

	public void mandarMail(Persona destinatario) {
		
	if(destinatario.getTipo() == 2) {
		
		System.out.println("Mail enviado exitosamente a encargado");
		
	
	
	}else{
		
		System.out.println("Mail no enviado. El destinatario no es compatible");
		
	}
		
	}

}
