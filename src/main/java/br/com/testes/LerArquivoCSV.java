package br.com.testes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LerArquivoCSV {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// Forma 01
//		File file = new File("c:\\Filmes\\movielist.csv");
//		Scanner sc = null;
//		try {
//			sc = new Scanner(file);
//			while (sc.hasNextLine()) {
//				String linha = sc.nextLine();
//				System.out.println(linha);
//			}
//		} catch (IOException e) {
//			throw new RuntimeException("Erro ao ler o arquivo!: " + e.getMessage());
//		}finally {
//			if (sc != null) {
//				sc.close();
//			}
//		}
		
		// Forma 02
		String path = "c:\\Filmes\\movielist.csv";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String linha = br.readLine();
			linha = br.readLine();
			while (linha != null) {
				String[] linhaVetor = linha.split(";");
				
				String ano = linhaVetor[0];
				String titulo = linhaVetor[1];
				String estudio = linhaVetor[2];
				String produtor = linhaVetor[3];
				
				String vencedor;
				if (linhaVetor.length < 5) {
					vencedor = "null";
				}else {
					vencedor = linhaVetor[4];
				}
				
				System.out.println(ano + " - " + titulo + " - " + estudio
				 + " - " + produtor + " - " + vencedor);
				
				linha = br.readLine();
				
			}
			
		} catch (Exception e) {
			throw new RuntimeException("Erro ao ler o arquivo!: " + e.getMessage());
		}
		
	}
}
