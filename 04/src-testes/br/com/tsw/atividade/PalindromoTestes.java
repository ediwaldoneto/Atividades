package br.com.tsw.atividade;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.tsw.atividade.Palindromo;

public class PalindromoTestes {
	Palindromo pString;
	
	@Before
	public void Palindromo() {
		pString = new Palindromo();
	}
	
	@Test
	public void positivo() {
		// Arranjar os Dados de Entrada
		String palavra = "arara";
		
		// Agir
		boolean resultado = pString.isPalindromo(palavra);
		
		// Assert
		Assert.assertTrue(resultado);
	}
	
	@Test
	public void negativo() {
		// Arranjar
		String palavra = "cachorro";
		
		//Agir
		boolean resultado = pString.isPalindromo(palavra);
	
		//Assert
		Assert.assertFalse(resultado);
	}
	
	@Test
	public void execaoVazio() {
		
		pString.isPalindromo("");
	}
	
	@Test()
	public void execaoPalavraNula() {
		pString.isPalindromo(null);
	}

}
