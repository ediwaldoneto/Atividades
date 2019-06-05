package br.com.atividade;

import java.util.Arrays;

public class Anagrama implements INAnagrama {

	@Override
	public boolean isAnagrama(String pString1, String pString2) {
		boolean isAnagrama = false;
		String palavra1 = pString1;
		String palavra2 = pString2;
		
		char[] palavras1 = palavra1.toCharArray();
		char[] palavras2 = palavra2.toCharArray();
		Arrays.sort(palavras1);
	    Arrays.sort(palavras2);
	
	    try {
	    	if(Arrays.equals(palavras1, palavras2)) {
		    	isAnagrama = true;
		    	System.out.print("É Anagrama \n");
		    
		    }else {
		    	isAnagrama = false;
		    	System.out.print("Não é um Anagrama ");
		    }
	    }catch (Exception e) {
			// TODO: handle exception
		}		
		return isAnagrama;
	}

}
