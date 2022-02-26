package br.com.testes;

import java.util.Comparator;

public class AlunoComparator implements Comparator<Aluno> {

	@Override
	public int compare(Aluno a1, Aluno a2) {

		if (a1.getIdade() > a2.getIdade()) {
			return 1;
		}

		return -1;
	}

}
