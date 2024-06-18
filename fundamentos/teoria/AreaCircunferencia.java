package fundamentos.teoria;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.1415; // Usar final para fazer uma cte.
		
		double area = PI * raio * raio;
		
		
		System.out.println("A �rea � de " + area + " cm quadrados");
		
		
		raio = 10;
		area = PI * raio * raio;
		
		System.out.println("A �rea � de " + area + " cm quadrados");
	}

}
