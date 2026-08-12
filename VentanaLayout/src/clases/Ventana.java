package clases;
import java.awt.*;
import javax.swing.*;
public class Ventana extends JFrame {

	public Ventana () {
		
		this.setTitle("Registrar Usuario");
		this.setSize(300, 250);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setLayout(new FlowLayout());
		
		JLabel nombre = new JLabel ("Nombre");
		JLabel apellido = new JLabel ("Apellido");
		JLabel cedula = new JLabel ("Cedula");
		JLabel edad = new JLabel ("Edad");
		JLabel rol = new JLabel ("Rol");
		
		JTextField nombrefield = new JTextField(10);
		JTextField apellidofield = new JTextField(10);
		JTextField cedulafield = new JTextField(10);
		JTextField edadfield = new JTextField(10);
		
		String [] roles = {"Admin", "Usuario"};
		JComboBox rolbox = new JComboBox(roles);
		
		JButton registrar = new JButton ("Registrar");
		
		JPanel panel1 = new JPanel();
		
		panel1.setLayout(new GridLayout(6,2));
		
		this.add(panel1);
		
		panel1.add(nombre);
		panel1.add(nombrefield);
		panel1.add(apellido);
		panel1.add(apellidofield);
		panel1.add(cedula);
		panel1.add(cedulafield);
		panel1.add(edad);
		panel1.add(edadfield);
		panel1.add(rol);
		panel1.add(rolbox);
		
		panel1.add(registrar);
		
		
	}
	
}
