package javaPrimerosPasos;

public class EjercicioMatriz {
	public static void main(String[] args) {
		for (int fila = 0; fila <= 10; fila++) {
			for (int columna = 0; columna <= 10; columna++) {
				if (columna >= fila) {
					break;
				}
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
			if (fila >= 8) {
				break;
			}
		}
	}
}
