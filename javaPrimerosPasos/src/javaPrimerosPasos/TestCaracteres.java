package javaPrimerosPasos;

public class TestCaracteres {
	public static void main(String[] args) {
        char letra = 'a';
        System.out.println(letra);
        
        char valor = 65;                    // Compila!
        System.out.println(valor);

        valor = (char) (valor + 1);         // Compila!
        System.out.println(valor);

        String palabra = "Alura cursos online de tecnología";
        System.out.println(palabra);

        palabra = palabra + 2020;
        System.out.println(palabra);
        
        System.out.println(valor + 1);		// el resultado es un número
    }
}
