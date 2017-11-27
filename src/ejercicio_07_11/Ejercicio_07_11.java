package ejercicio_07_11;


import java.util.Scanner;

public class Ejercicio_07_11 {
	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner
		double[] numeros = new double[10]; // Create an array of lentgh 10

		// Prommpt the user to enter ten numbers
		System.out.print("Ingrese diez numeros: ");
		for (int i = 0; i < numeros.length; i++)
			numeros[i] = input.nextDouble();

		// Displays the mean and standard deviation
		System.out.println("The mean is " + mean(numeros));
		System.out.println("The standard deviation is " + desviacion(numeros));
	}

	/** Compute the deviation of double values */
	public static double desviacion(double[] x) {
		double desviacion = 0;
		double media = mean(x);
		for (double e: x) {
			desviacion += Math.pow(e - media, 2);
		}
		return Math.sqrt(desviacion / (x.length - 1));
	}

	/** Compute the mean of an array of double values */
	public static double mean(double[] x) {
		double mean = 0;
		for (double e: x) {
			mean += e;
		}
		return mean / x.length;
	}
}