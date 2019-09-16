package Questao04;

import java.util.Scanner;

public class Estatistica {
	
    private int maiorValor;
	
    /* class constructors */
  	public Estatistica (int maiorValor) {
  		this.maiorValor = maiorValor;
  	}
  	
  	public void setMaiorValor(int maiorValor) {
  		this.maiorValor = maiorValor;
  	}
  	
  	public int getMaiorValor() {
  		return maiorValor;
  	}
  	
  	public int somatorio() {
  		int somatorio = 0;
  		int contador = 0;
  		while(contador <= maiorValor) {
  			somatorio += contador;
  			contador++;
  		}
  		
  		return somatorio;
  	}
  	
  	public float media () {
  		float soma = 0;
  		float count = 0;
  		
  		do {
  			soma += count;
  			count++;
  		} while(count <= maiorValor);
  		
  		return soma / maiorValor;
  	}
  	
  	public double variancia() {
  		double variancia = 0, iterator = 0;
  		
  		for(iterator = 0; iterator <= maiorValor; iterator++)
  			variancia += Math.pow((iterator - this.media()), 2);
  		
  		return variancia/iterator;
  	}
  	
  	public void parImpar() {
  		int count = 1;
  		while(count <= maiorValor) {
  			String isPar = (count % 2 == 0) ? " é par" : " é impar";
			System.out.println(count + isPar);
		}
		count++;
	}  
  	
  	/* method main*/
  	public static void main(String[] args) {
		/* constructors */
  		Scanner input = new Scanner(System.in);
  		
  		System.out.println("Digite um numero inteiro qualquer:");
  		int maiorNumero = input.nextInt();
  		Estatistica estatistica = new Estatistica(maiorNumero);
  		input.close();
  		
  		System.out.println("somatorio: " + estatistica.somatorio());
  		System.out.println("media: " + estatistica.media());
  		System.out.println("variancia: " + estatistica.variancia());
  		estatistica.parImpar();
  		
  	}

  }
