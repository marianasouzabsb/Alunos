package gestaodealuno.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {
	
	public static void main(String[] args) {
		
		String pos = JOptionPane.showInputDialog("Posições do array: ");
	
		double[] notas  = new double[Integer.parseInt(pos)];
		

		
		for (int i = 0 ; i < notas.length; i++) {
			String valor = JOptionPane.showInputDialog("valor da posisição do array:  " + ( i + 1));
			notas[i] = Double.valueOf(valor);
		}
		
		for(int i = 0 ; i < notas.length; i++) {
		System.out.println("Nota " + (i + 1) + " = " + notas[i]);
		}
		
}//fecha main
}

