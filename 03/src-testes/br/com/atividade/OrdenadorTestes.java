package br.com.atividade;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import br.com.atividade.Ordenador;

public class OrdenadorTestes {
Ordenador o;
	
	@Before
	public void Ordenador() {
		o = new Ordenador();
	};
	
	@Test
	public void testarInserirColecaoComNumerosInteiros() {
	
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("1");
		colecao.add("2");
		colecao.add("3");
		
		
		o.inserirColecao(colecao);
		
		
		assertEquals(3, o.maiorValor);
	}
	
	@Test
	public void testarInserirColecaoComNumerosReais() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("10.12");
		colecao.add("20.2");
		colecao.add("30.1");
		
		
		o.inserirColecao(colecao);
		
		
		assertEquals(30.1, o.maiorValor);
	}
	
	@Test(expected = NullPointerException.class)
	public void testarInserindoCollectionNulo() {
		
		o.inserirColecao(null);
	}
	
	@Test
	public void testarInserindoValoresNaoNumericos() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("a");
		colecao.add("b");
		colecao.add("c");
		
		
		o.inserirColecao(colecao);
	}
	
	@Test
	public void testarinformarValorMaior() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("20");
		colecao.add("30");
		colecao.add("40");
		String valor = "100";
		
		
		o.inserirColecao(colecao);
		o.informarValor(valor);
		
		
		assertEquals(100, o.maiorValor);
	}
	
	@Test
	public void testarinformarValorMenor() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("70");
		colecao.add("80");
		colecao.add("90.4");
		String valor = "10";
		
		
		o.inserirColecao(colecao);
		o.informarValor(valor);
		
		
		assertNotEquals(10,o.maiorValor);
	}
	
	@Test
	public void testarinformarValorComDadoInvalido() {
		
		String valor = "a";
		
		
		o.informarValor(valor);
	}
	
	@Test
	public void testarinformarValorComParametroVazio() {		
		
		o.informarValor(null);
	}
	
	@Test
	public void testarGetMenorValorInserindoColecao() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("10");
		colecao.add("20");
		colecao.add("30");
		
		
		o.inserirColecao(colecao);
		
		
		assertEquals(10, o.getMenorValor());
	}
	
	@Test
	public void testarGetMenorValorInserindoColecaoEValorAleatório() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("40");
		colecao.add("19");
		colecao.add("20");
		String valAleatorio = "1.7";
		
		
		o.inserirColecao(colecao);
		o.informarValor(valAleatorio);
		
		
		assertEquals(1.7, o.getMenorValor());
		
	}
	
	@Test
	public void testarGetMenorValorEnviandoParametrosIguais() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("10");
		colecao.add("10");
		colecao.add("10");
		String valAleatorio = "10";
		
		
		o.inserirColecao(colecao);
		o.informarValor(valAleatorio);
		
		
		assertEquals(10, o.getMenorValor());
	}
	
	@Test
	public void testarGetMenorValorInserindoValorAleatorio() {
		
		String valAleatorio = "1000";
		String valAleatorio2 = "1001";
		String valAleatorio3 = "1002";
		String valAleatorio4 = "4";
		
		
		o.informarValor(valAleatorio);
		o.informarValor(valAleatorio2);
		o.informarValor(valAleatorio3);
		o.informarValor(valAleatorio4);
		
		
		assertEquals(4, o.getMenorValor());
	}
	
	@Test
	public void testarGetMenorValorInserindoDadosInvalidos() {
		
		String valAleatorio = "Abobora";
		
		
		o.informarValor(valAleatorio);
		
		
		assertEquals(0.0, o.getMenorValor());
	}
	
	@Test
	public void testarGetMenorValorInserindoDadosNulos() {
		
		String valAleatorio = null;
		
		
		o.informarValor(valAleatorio);
		
		
		assertEquals(0.0, o.getMenorValor());
	}
	
	@Test
	public void testarGetMaiorValorInserindoColecao() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("10");
		colecao.add("20");
		colecao.add("30");
		
		o.inserirColecao(colecao);
		
		
		assertEquals(30, o.getMaiorValor());
	}
	
	@Test
	public void testarGetMaiorValorInserindoColecaoEValorAleatório() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("40");
		colecao.add("19");
		colecao.add("20");
		String valAleatorio = "1.7";
		
		
		o.inserirColecao(colecao);
		o.informarValor(valAleatorio);
		
		
		assertEquals(40, o.getMaiorValor());
		
	}
	
	@Test
	public void testarGetMaiorValorEnviandoParametrosIguais() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("10");
		colecao.add("10");
		colecao.add("10");
		String valAleatorio = "10";
		
		
		o.inserirColecao(colecao);
		o.informarValor(valAleatorio);
		
		
		assertEquals(10, o.getMaiorValor());
	}
	
	@Test
	public void testarGetMaiorValorInserindoValorAleatorio() {
		
		String valAleatorio = "1000";
		String valAleatorio2 = "1001";
		String valAleatorio3 = "1002";
		String valAleatorio4 = "4";
		
		
		o.informarValor(valAleatorio);
		o.informarValor(valAleatorio2);
		o.informarValor(valAleatorio3);
		o.informarValor(valAleatorio4);
		
		
		assertEquals(1002, o.getMaiorValor());
	}
	
	@Test
	public void testarGetMaiorValorInserindoDadosInvalidos() {
		
		String valAleatorio = "Abobora";
		
		
		o.informarValor(valAleatorio);
		
		
		assertEquals(0.0, o.getMaiorValor());
	}
	
	@Test
	public void testarGetMaiorValorInserindoDadosNulos() {
		
		String valAleatorio = null;
		
		
		o.informarValor(valAleatorio);
		
		
		assertEquals(0.0, o.getMaiorValor());
	}
	
	@Test
	public void testarGetValorMedioInserindoDadosInteiros() {
		
		Collection<String> colecao = new ArrayList<String>();
			colecao.add("2");
			colecao.add("4");
			
		
		o.inserirColecao(colecao);
		
		
		assertEquals(3, o.getValorMedio());
			
	}
	
	@Test
	public void testarGetValorMedioInserindoDadosReais() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("3.5");
		colecao.add("1.5");
		
		
		o.inserirColecao(colecao);
		
		
		assertEquals(2.5, o.getValorMedio());
	}
	
	@Test 
	public void testarGetValorMedioInserindoDadosInvalidos() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("a");
		colecao.add("b");
		
		
		o.inserirColecao(colecao);
	}
	
	@Test(expected = NullPointerException.class)
	public void testarGetValorMedioInserindoDadosNulos() {
		
		Collection<String> colecao = null;
		
		
		o.inserirColecao(colecao);
	}
	
	@Test
	public void testarGetValorMedioComNumeroAleatorio() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("2");
		colecao.add("8");
		String valAleatorio = "2";
		
		
		o.inserirColecao(colecao);
		o.informarValor(valAleatorio);
		
		
		assertNotEquals(4, o.getValorMedio());
	}
	
	@Test
	public void testarGetValorMedianoInserindoCollectionComSizeImpar() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("3");
		colecao.add("4");
		colecao.add("5");
		
		
		o.inserirColecao(colecao);
		
		
		assertEquals(4, o.getValorMediano());
	}
	
	@Ignore
	public void testarGetValorMedianoInserindoMaisParametrosSizeImpar() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("1");
		colecao.add("2");
		colecao.add("3");
		colecao.add("4");
		colecao.add("5");
		colecao.add("6");
		colecao.add("7");
		colecao.add("8");
		colecao.add("9");
		
		
		o.inserirColecao(colecao);
		
		
		assertEquals(5, o.getValorMediano());
	}
	
	@Test
	public void testarGetValorMedianoInserindoVariosDadosSizePar() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("2");
		colecao.add("4");
		colecao.add("6");
		colecao.add("8");
		
		
		o.inserirColecao(colecao);
		
		
		assertEquals(5, o.getValorMediano());
	}
	
	@Test
	public void testarGetValorMedianoInserindoCollectionComSizePar() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("2");
		colecao.add("4");
		colecao.add("6");
		colecao.add("35");
		colecao.add("12");
		colecao.add("7");
		colecao.add("9.1");
		colecao.add("26");
		
		
		o.inserirColecao(colecao);
		
		
		assertEquals(23.5, o.getValorMediano());
	}
	
	@Test
	public void testarGetValorMedianoInserindoValoresInvalidos() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("2");
		colecao.add("4");
		colecao.add("c");
		colecao.add("35");
		
		
		o.inserirColecao(colecao);
	}
	
	@Test
	public void testarGetValorMedianoInserindoValoresReais() {
		
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("2");
		colecao.add("5.7");
		colecao.add("14.4");
		colecao.add("35");
		
		
		o.inserirColecao(colecao);
		
		
		assertEquals(10.05, o.getValorMediano());
	}
	
	@Test(expected = NullPointerException.class)
	public void testarGetValorMedianoInserindoValoresNulos() {
		
		Collection<String> colecao = null;
		
		
		o.inserirColecao(colecao);
	}
	
	@After
	public void destruirObjetoPersistido() {
		o = null;
	}

}
