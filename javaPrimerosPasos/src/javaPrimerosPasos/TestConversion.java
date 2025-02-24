package javaPrimerosPasos;

public class TestConversion {
	public static void main(String[] args) {
		double variable1 = 230.89;
		int variable1Entero = (int) variable1; // Cast
		System.out.println(variable1Entero);
		
		long prueba = 1222222222222222222L;
		System.out.println(prueba);
		short numeroPequeno = 13555;
		System.out.println(numeroPequeno);
		byte numeroAunMasPequeno = 4;
		System.out.println(numeroAunMasPequeno);
		float numeroDecimalPequeno = 2.5F;
		System.out.println(numeroDecimalPequeno);
		
		int resultado = (int) variable1 + variable1Entero;
		System.out.println(resultado);
		
		double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;
        System.out.println(total);
        
        float puntoFlotante = 3.14f;
        System.out.println(puntoFlotante);
	}
}
