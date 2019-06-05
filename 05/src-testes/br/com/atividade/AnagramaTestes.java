package br.com.atividade;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnagramaTestes {
Anagrama pString1, pString2;
	
	@Before
	public void Palindromo() {
		pString1 = new Anagrama();
		pString2 = new Anagrama();
	}
	@Test
	public void positivo() {
		//arranjar
		String palavra1 = "elvis";
		String palavra2 = "lives";
		//Agir
		boolean resultado = pString1.isAnagrama(palavra1, palavra2);
		//Assert
		Assert.assertTrue(resultado);
	}
	
	@Test
	public void negativo() {
		//arranjar
		String palavra1 = "cafe";
		String palavra2 = "efae";
		//Agir
		boolean resultado = pString1.isAnagrama(palavra1, palavra2);
		//Asser
		Assert.assertFalse(resultado);		
	}

	
	@Test()
	public void execaoPalavraNula() {
		pString2.isAnagrama(null, null);
	}

}
