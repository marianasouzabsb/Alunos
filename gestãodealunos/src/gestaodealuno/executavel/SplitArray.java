package gestaodealuno.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {
		
		String text = "Mari , java,80,90,59 ";
		
		String[] valoresArray = text.split(",");
		System.out.println(valoresArray);
		
		//Convertendo um Array em uma lista
		
		List<String> list = Arrays.asList(valoresArray);
		
		for (String valorString : list) {
			System.out.println(valorString);
			
		}
		//Convertendo lista para ARRAY
		
		String[] conversaoArray = list.toArray(new String[5]);
		
		for (int l = 0; l < conversaoArray.length; l++) {
			System.out.println(conversaoArray[l]);
		}
		
		
	}

}
