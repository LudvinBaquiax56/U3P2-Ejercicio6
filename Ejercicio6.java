import java.util.*;

public class Ejercicio6 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		double promediomayores;
		double promediomenores;

		int contadormayoresde25 = 0;
		int contadormenerosde25 = 0;		

		int totaldeedadmayores = 0;
		int totaldeedadmenores = 0;

		int edad;
		
		for (int i = 0 ; i < 10; i++) {
			System.out.println("Ingres la edad de la persona No. "+(i+1));
			edad = scanner.nextInt();
			if (edad<25) {
				totaldeedadmenores = totaldeedadmenores+edad;
				contadormenerosde25 = contadormenerosde25+1;
			} else {
				totaldeedadmayores = totaldeedadmayores+edad;
				contadormayoresde25 = contadormayoresde25+1;
			}
		}
		promediomenores = totaldeedadmenores/contadormenerosde25;
		promediomayores = totaldeedadmayores/contadormayoresde25;
		System.out.println("El promedio de edad de las personas menores de 25 anios es: "+promediomenores);
		System.out.println("El promedio de edad de las personas mayores de 25 anios es: "+promediomayores);
	}

}

