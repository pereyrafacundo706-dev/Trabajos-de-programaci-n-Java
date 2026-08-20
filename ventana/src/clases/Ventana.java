package clases;

import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {

	public Ventana() {

		this.setTitle("Ventana de Prueba");
		this.setSize(400, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setLayout(new BorderLayout());

		JLabel bienvenido = new JLabel ("Bienvenido a mi programa");
		JLabel nombre = new JLabel ("Nombre: ");
		JTextField nombrefield = new JTextField(10);
		
		JButton aceptar = new JButton ("Aceptar");
		JPanel panel = new JPanel();
		
		panel.setLayout(new FlowLayout());
		
		
		this.add(panel);
		panel.add(bienvenido);
		panel.add(nombre);
		panel.add(nombrefield);
		panel.add(aceptar);
		
		panel.setPreferredSize(new Dimension(80, 200));		
	
	}

}
