package javaPrimerosPasos;

public class EjemploScope {
	public static void main(String[] args) {
		System.out.println("Probando Condicionales");

		int edad = 17;
		int cantidadPersonas = 1;

		boolean esPareja;
		if (cantidadPersonas > 1) {
			esPareja = true;
		} else {
			esPareja = false;
		}
		boolean puedeEntrar = edad >= 18 || esPareja;

		if (puedeEntrar) {
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted NO puede entrar");
		}
	}
}
