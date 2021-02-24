package gestaodealuno.executavel;

import gestaodealunos.classes.Aluno;
import gestaodealunos.classes.Diretor;
import gestaodealunos.classes.Secretario;

public class TestanddoClassesFilhas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Aluno aluno1 = new Aluno();
			
			aluno1.setNome("mariana");
			aluno1.setIdade(16);
			
			Diretor diretor = new Diretor();
			
			diretor.setNome("Busanfa");
			diretor.setIdade(50);
			
			
			Secretario secretario = new Secretario();
			secretario.setIdade(96);
			
			
			
			System.out.println(aluno1.pessoaMaiorIdade() + " : " + aluno1.msgMaioridade());
			System.out.println(diretor.pessoaMaiorIdade());
			System.out.println(secretario.pessoaMaiorIdade());
			System.out.println(aluno1.salario());
			System.out.println(diretor.salario());
			System.out.println(secretario.salario());
	}

}
