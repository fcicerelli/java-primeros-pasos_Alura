package javaPrimerosPasos;

public class CalculoValorConDescuento {
	public static void main(String[] args) {

		double valorCompra = 350.0;
		double descuento = 0.0;

		if (valorCompra >= 100.0 && valorCompra <= 199.99) {
			descuento = 10.0;
		} else if (valorCompra >= 200.0 && valorCompra <= 299.99) {
			descuento = 15.0;
		} else if (valorCompra >= 300.0) {
			descuento = 20.0;
		}

		double valorFinal = valorCompra - (valorCompra * descuento / 100);

		System.out.println("Valor de la compra: $" + valorCompra);
		System.out.println("Descuento: " + descuento);
		System.out.println("Valor final: $" + valorFinal);
	}
}
