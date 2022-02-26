package br.com.testes;

import java.text.Normalizer;

public class Teste {
	
	public static void main(String[] args) {
		
//		String email = "teste@teste";
//		
//		boolean isEmailIdValid = false;
//	    if (email != null && email.length() > 0) {
//	        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
//	        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
//	        Matcher matcher = pattern.matcher(email);
//	        if (matcher.matches()) {
//	            isEmailIdValid = true;
//	        }
//	    }
//	    System.out.println(isEmailIdValid);
		
		String nomeClienteArquivo = "   Prêmíum Ànaliã Franço";
		String nomeClienteBD = "PREMIUM ANALIA FRANCO";
		
//		if(nomeClienteArquivo.toUpperCase().equals(nomeClienteBD)) {
//			System.out.println("O nome é igual!");
//		}else {
//			System.out.println("O nome é diferente!");
//		}
		
		String teste = Normalizer.normalize(nomeClienteArquivo, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "")
				.toUpperCase().trim();
		
		System.out.println(teste.trim());
		
	}

}
