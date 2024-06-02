import javax.swing.JOptionPane;

public class While {

	public static void main(String[] args) {
		String clave = "Dani";
		String pass = "";
		
		while(clave.equals(pass)==false) {
			pass = JOptionPane.showInputDialog("Introduce la contraseña, por favor");
			if (clave.equals(pass)==false) {
					System.out.println("Contraseña incorecta");
		}

	}
		System.out.println("Contraseña correcta. Acceso permitido");
		

}
}
