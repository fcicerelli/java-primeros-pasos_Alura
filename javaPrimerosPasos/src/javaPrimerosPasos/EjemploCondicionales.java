package javaPrimerosPasos;

public class EjemploCondicionales {
	public static void main(String[] args) {
		System.out.println("Probando Condicionales");

		int edad = 17;
		int cantidad = 1;

		if (edad >= 18) {
			System.out.println("Usted puede entrar");
			System.out.println("Bienvenido");
		}
		else {
			if (cantidad >= 2) {
				System.out.println("Usted es menor de edad"
						+ " pero esta acompañado");
			} else {
				System.out.println("Usted no esta permitido "
					+ " entrar");
			}
		}
	}
}
