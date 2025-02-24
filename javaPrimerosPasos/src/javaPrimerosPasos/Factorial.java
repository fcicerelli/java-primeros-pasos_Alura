package javaPrimerosPasos;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Del 1 al 10");
		for (int i = 1; i <= 10; i++) {
			int factorial = 1;
			for (int j = i; j >= 1; j--) {
				factorial = factorial * j;
			}
			System.out.println("El factorial de " + i + " es " + factorial);
		}
		int factorial = 1;
		System.out.println();
		System.out.println("Otra forma");
		for (int i = 1; i < 11; i++) {
			factorial *= i;
			System.out.println("Factorial de " + i + " = " + factorial);
		}
	}
}
