package Aula;
import org.junit.Assert;
import org.junit.Test;

import Aula.Calculador;
public class CalculadorTestes {
			
	@Test
	public void somarDoisMaisDois() {
		
		String num1 = "2";
		String num2 = "2";
		
		
		Calculador cal = new Calculador();	
		int result = cal.somar(num1, num2);
		
		
		Assert.assertEquals(4, result);
	}
	
	@Test
	public void somarNegativo() {
		
		String num1 = "2";
		String num2 = "-2";
		
		
		Calculador cal = new Calculador();	
		int result = cal.somar(num1, num2);
		
		
		Assert.assertEquals(0, result, 2);
	}
	
	@Test(expected=NullPointerException.class)
	public void somarNuloComMenosDOis() {
		
		
		String num1 = null;
		String num2 = "-2";
		
		
		Calculador cal = new Calculador();	
		int result = cal.somar(num1, num2);
		
		
		 Assert.assertEquals(0, result, 2);
		 
	}
	
	@Test(expected=NumberFormatException.class)
	public void somarVazioComMenosDOis() {
		
		String num1 = "";
		String num2 = "-2";
		
		
		Calculador cal = new Calculador();	
		int result = cal.somar(num1, num2);
		
		 
		  Assert.assertEquals(0, result, 2);		 
	}
	
	@Test
	public void raiz() {
		
		String num1 = "25";
		
		Calculador cal = new Calculador();	
	
		double result = cal.raizQuadrada(num1);
		Assert.assertEquals(5, result , 0.1);

	}
	
	@Test
	public void dividirDoisMaisDois() {
		String num1 = "2";
		String num2 = "2";
		
		Calculador cal = new Calculador();	
		double result = cal.dividir(num1, num2);
		
		Assert.assertEquals(2, result , 1.0 );
		
	}
	
}
