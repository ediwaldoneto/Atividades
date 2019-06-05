package Aula;

public class Calculador implements Calculadora{

	@Override
	public int somar(String n1, String n2)  {
		int num1 = 0;
		int num2 = 0;
		num1 = Integer.parseInt(n1);
		num2 = Integer.parseInt(n2);	
		
		System.out.println("A soma de n1 + n2 = "+ ( num1 + num2));
		return num1 + num2;
	}

	@Override
	public double dividir(String n1, String n2) {
		int num1 = 0;
		int num2 = 0;
		try {
			num1 = Integer.parseInt(n1);
			num2 = Integer.parseInt(n2);
			System.out.println("A divisao de n1 + n2 = "+  (num1 / num2));
		}catch (Exception e) {
			
		}
		
		return num1 / num2;
	}

	@Override
	public double raizQuadrada(String n1) {
		int num1 = 0;
		try {
			num1 = Integer.parseInt(n1);
			System.out.println("A raiz quadrada é = "+ (Math.sqrt(num1)));
		}catch (Exception e) {
			
		}
		return Math.sqrt(num1);
	}

}
