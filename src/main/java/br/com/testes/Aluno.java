package br.com.testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Aluno {

	private String nome;
	private int idade;

	public Aluno() {
		super();
	}

	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return idade == other.idade && Objects.equals(nome, other.nome);
	}

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Aluno 01", 30);
		Aluno a2 = new Aluno("Aluno 02", 15);
		Aluno a3 = new Aluno("Aluno 03", 20);

		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.addAll(Arrays.asList(a1, a2, a3));

		alunos.forEach(a -> System.out.println(a.getNome() + " - " + a.getIdade()));
		
		System.out.println("--------------------------------------------------");
		Collections.sort(alunos, new AlunoComparator());
		
		alunos.forEach(a -> System.out.println(a.getNome() + " - " + a.getIdade()));

	}
	
			
	
}
