package gestaodealuno.executavel;

import gestaodealunos.classes.Aluno;
import gestaodealunos.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {

		double[] notas = { 89.5, 20, 98, 45 }; // java
		double[] notas2 = { 46.2, 75, 11, 100}; // Logica
		double[] notas3 = { 35, 89, 55.8, 78}; // Banco de dados
		
		

		Aluno aluno = new Aluno();
		aluno.setNome("Mariana Oliveira");
		aluno.setNomeEscola("IESB");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("George");

		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("JAVA");
		disciplina.setNota(notas);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Logica");
		disciplina2.setNota(notas2);

		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Banco de dados");
		disciplina3.setNota(notas3);

		aluno.getDisciplinas().add(disciplina);
		aluno.getDisciplinas().add(disciplina2);
		aluno.getDisciplinas().add(disciplina3);
		
		aluno2.getDisciplinas().add(disciplina);
		aluno2.getDisciplinas().add(disciplina2);
		
		//--------------------------------------------------------
		Aluno[] arrayAlunos = new Aluno[2];
		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno2;
		
		for (int pos = 0; pos < arrayAlunos.length; pos++ ) {
			System.out.println("Nome: " + arrayAlunos[pos].getNome());
			
			for (Disciplina disc : arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Discplina: " + disc.getDisciplina());
				
				for(int posnota = 0; posnota < disc.getNota().length ; posnota++) {
					System.out.println("Nota " + (posnota + 1) + " : " + disc.getNota()[posnota]);
				}
			}
		}
		
		
		
		//----------------------------------------------------------------------------------------------
		

		for (Disciplina disc : aluno.getDisciplinas()) {
			System.out.println("---------------------------------------- ");
			System.out.println("Discplina: " + disc.getDisciplina());

			double notaMax = 0;
			double notaMin = 0;

			for (int pos = 0; pos < disc.getNota().length; pos++) {
				System.out.println("Nota " + (pos + 1) + " : " + disc.getNota()[pos]);

				if (pos == 0) {
					notaMax = disc.getNota()[pos];
				} else {
					if (disc.getNota()[pos] > notaMax) {
						notaMax = disc.getNota()[pos];
					}
				}

				if (pos == 0) {
					notaMin = disc.getNota()[pos];
				} else {
					if (disc.getNota()[pos] < notaMin) {
						notaMin = disc.getNota()[pos];
					}
				}
			}

			System.out.println("Maior nota: " + disc.getDisciplina() + " : " + notaMax);
			System.out.println("Menor nota: " + disc.getDisciplina() + " : " + notaMin);
		}

	}// fecha main
}
