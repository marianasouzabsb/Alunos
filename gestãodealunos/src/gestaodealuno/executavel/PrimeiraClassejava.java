package gestaodealuno.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import gestaodealunos.classes.Aluno;
import gestaodealunos.classes.Disciplina;

public class PrimeiraClassejava {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++) {
			// Recebe os dados via teclado
			String nome = JOptionPane.showInputDialog("Qual o nome do Aluno " + qtd + "?");
			String idade = JOptionPane.showInputDialog("Digite a Idade do Aluno");
			String dataNascimento = JOptionPane.showInputDialog("Digite data de nascimento");

			Aluno aluno1 = new Aluno();// faz referencia ao construtor

			aluno1.setNome(nome);
			aluno1.setIdade(Integer.valueOf(idade));
			aluno1.setDataNascimento(dataNascimento);

			// Para adicionar Disciplinas
			for (int pos = 1; pos <= 4; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Digite disciplina " + pos + " ? ");
				String notaDisciplina = JOptionPane.showInputDialog("Digite nota " + pos + " ? ");

				Disciplina disciplina = new Disciplina();

				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}
			// Para Remover disciplinas

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina");
			if (escolha == 0) { // opção sim é 0
				int continuarRemover = 0;
				int posicao = 1;
				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane
							.showInputDialog("Qual disciplina deseja remover? 1,2,3 ou 4	");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a Remover disciplinas? ");
				} // fecha while
			}
			alunos.add(aluno1); // ADD ALUNO NA LISTA

			for (Aluno aluno : alunos) {
				if (aluno.getNome().equalsIgnoreCase("mari")) {
				System.out.println(aluno);
				System.out.println("REsultado: " + aluno.getAlunoResultado());
				System.out.println("Resultado: " + aluno.getAlunoResultado());
				System.out.println("==================================================");
				break;
				}
			}
		} // fecha For da lista de alunos
	}// Fecha Main
}// Fecha PrimeiraClassejava
