package br.com.testes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8ExpressoesLambda {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Aluno 01", 20);
		Aluno a2 = new Aluno("Aluno 02", 25);
		Aluno a3 = new Aluno("Aluno 03", 30);
		Aluno a4 = new Aluno("Aluno 04", 30);
		Aluno a5 = new Aluno("Aluno 05", 20);
		Aluno a6 = new Aluno("Aluno 06", 25);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Map<Integer, List<Aluno>> mapaIdadeAlunos = alunos.stream()
			.collect(Collectors.groupingBy(a -> a.getIdade()));
		
		System.out.println(mapaIdadeAlunos);
		
	}
}
