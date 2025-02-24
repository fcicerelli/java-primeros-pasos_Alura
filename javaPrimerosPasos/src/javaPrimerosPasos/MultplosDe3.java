package javaPrimerosPasos;

public class MultplosDe3 {
	public static void main(String[] args) {
		System.out.println("Con módulo");
		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		System.out.println();
		System.out.println("Con step");
		for (int i = 0; i <= 100; i += 3) {
			System.out.println(i);

		}

	}
}
