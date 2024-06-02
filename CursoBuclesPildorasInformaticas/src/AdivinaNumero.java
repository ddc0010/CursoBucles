import java.util.*;

public class AdivinaNumero {

	public static void main(String[] args) {
		
		int aleatorio = (int) (Math.random()*100);
		
		Scanner sc = new Scanner (System.in);
		
		int numero = 0; 
		
		int numIntentos = 0; 
		
		while (numero != aleatorio) {
			System.out.println("Introduce un numero, por favor");
			
			numero = sc.nextInt();
			
			if(aleatorio < numero) {
				System.out.println("El numero es mas bajo");
			}
		    else if (aleatorio > numero) {
					System.out.println("Mas alto");
				}
			}
		System.out.println("Correcto");
		}

	}
