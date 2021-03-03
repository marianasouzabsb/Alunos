package gestaodealunos.classes;

public class Matriz {
	public static void main(String[] args) {

		int notas[][] = new int[1][3];

		notas[0][0] = 80;
		notas[0][1] = 50;
		notas[0][2] = 70;

		
		for (int l = 0; l < notas.length; l++) { // percorrer linhas

			for (int c = 0; c < notas[l].length; c++) { // colunas
				System.out.println(notas[l][c]);
			}
		}
	}
}
