package gestaodealuno.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;
import gestaodealunos.classes.Aluno;
import gestaodealunos.classes.Disciplina;
import gestaodealunos.classes.Secretario;
import gestaodealunos.interfaces.PermitirAcesso;
import gestãodealunos.classeauxiliar.FuncaoAutenticar;
import gestãodealunos.contantes.StatusAluno;

public class PrimeiraClassejava {

	public static void main(String[] args) {
		try {

		// Validação de usuario de senha
		String login = JOptionPane.showInputDialog("Informe o LOgin");
		String senha = JOptionPane.showInputDialog("Informe o senha");

		PermitirAcesso permitirAcesso = new Secretario(login, senha);

		if (new FuncaoAutenticar(permitirAcesso).autenticar()) {

			List<Aluno> alunos = new ArrayList<Aluno>(); // Criando lista de alunos // simular um erro para tratar com try

			// Hashmap é uma lista com chave que identifica uma squencia de valores
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			for (int qtd = 1; qtd <= 2; qtd++) {
				// Recebe os dados via teclado
				String nome = JOptionPane.showInputDialog("Qual o nome do Aluno " + qtd + "?");
				/*String idade = JOptionPane.showInputDialog("Digite a Idade do Aluno");
				String dataNascimento = JOptionPane.showInputDialog("Digite data de nascimento");
				String dataMatricula = JOptionPane.showInputDialog("Digite data de Matricula");
				String nomeEscola = JOptionPane.showInputDialog("Digite o nome da escola");
				String serieMatriculado = JOptionPane.showInputDialog("Digite a serie do aluno");*/
				Aluno aluno1 = new Aluno();// faz referencia ao construtor
				aluno1.setNome(nome);
				/*aluno1.setIdade(Integer.valueOf(idade));
				aluno1.setDataNascimento(dataNascimento);
				aluno1.setSerieMatriculado(dataMatricula);
				aluno1.setNomeEscola(nomeEscola);
				aluno1.setSerieMatriculado(serieMatriculado);*/
				// Para adicionar Disciplinas
				for (int pos = 1; pos <= 1; pos++) {
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
			} // fecha For da lista de alunos

			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

			for (Aluno aluno : alunos) {
				if (aluno.getAlunoResultado().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);

				} else if (aluno.getAlunoResultado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				} else {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
			}

			System.out.println("============Lista dos Aprovados==============");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println(aluno.getNome());
			}

			System.out.println("==============Lista dos Recuperação==============");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println(aluno.getNome());
			}

			System.out.println("===========Lista dos Reprovados===============");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println(aluno.getNome());
			}
		} // fecha validação
		else {
			JOptionPane.showMessageDialog(null, "Informe o senha e login correto");
		}
		} catch (Exception e){
			e.printStackTrace();/*imprime erro no console*/
			JOptionPane.showMessageDialog(null, "Erro");
			
			for(int i = 0; i < e.getStackTrace().length; i++) {
				System.out.println(e.getStackTrace()[i].getClassName());
			}
			
		}
		
	}// Fecha Main
}// Fecha PrimeiraClassejava
