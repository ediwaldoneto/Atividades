package br.com.tsw.atividade;
public class Palindromo implements INPalindromo {

	@Override
	public boolean isPalindromo(String pString) {
		boolean isPalindromo = false;
		try {
			String stringAux = pString;
			String invertida = new StringBuffer(stringAux).reverse().toString(); 
			if(stringAux.equals(invertida)){
				isPalindromo = true;
			}else{
				isPalindromo = false;
			}
			
		}catch (Exception e) {
			
		}
		return isPalindromo;
		
	}

}
