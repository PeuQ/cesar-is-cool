package q3;

import java.util.ArrayList;
import java.util.Scanner;

public class SomaDupla {
	
	public static String getSomaIndices(ArrayList<String> valores, int alvo) {
		
		int previousElement = 0, previousIndex = 0;
		for (String element:valores) {
			int currentElement = Integer.valueOf(element);
			int currentIndex = valores.indexOf(element);

			if((previousElement + currentElement) == alvo) {
				return ("Indexes: [" + previousIndex + ", " + currentIndex + "]");
			}
			else {
				previousElement = currentElement;
				previousIndex = currentIndex;
			}
		}
		
		return ("Indices indeterminados!");
	}
	
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 
        ArrayList<String> valores = new ArrayList<String>(); 
                
	    /* user input */
	    System.out.println("Insira, um por um, os valores que compoem o ArrayList.");
	    System.out.println("Ao encerrar, insira a palavra 'parar'!");
	    
	    int alvo;
        while(true) {
        	String valor = scanner.nextLine();
        	
        	if (valor.equalsIgnoreCase("parar")) {
        	    System.out.println("Insira os valor 'alvo': ");
        	    alvo = scanner.nextInt();
            	break;
        	}
        	
        	valores.add(valor);
        } 
        
	    scanner.close();
    	System.out.println(getSomaIndices(valores, alvo));
	}
}
