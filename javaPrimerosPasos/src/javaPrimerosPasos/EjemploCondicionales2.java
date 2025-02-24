package javaPrimerosPasos;

public class EjemploCondicionales2 {
	public static void main(String[] args) {
		System.out.println("Probando Condicionales");

		int edad = 17;
		int cantidadPersonas = 1;

		boolean esPareja = cantidadPersonas > 1;
		boolean puedeEntrar = edad >= 18 || esPareja;

		if (puedeEntrar) {
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted NO puede entrar");
		}
	}
}
