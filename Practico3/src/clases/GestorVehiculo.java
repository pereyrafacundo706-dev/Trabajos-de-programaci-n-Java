package clases;

public class GestorVehiculo {

	public static void main(String[] args) {
		
		Moto moto1 = new Moto ("Baccio", "PX 125", "Azul", 2015, "125cc", "Estandar");
		System.out.println(moto1.getMarca());
		System.out.println(moto1.getModelo());
		System.out.println(moto1.getColor());
		System.out.println(moto1.getAño());
		System.out.println(moto1.getCilindrada());
		System.out.println(moto1.getTipoMoto());
		
	}

}
