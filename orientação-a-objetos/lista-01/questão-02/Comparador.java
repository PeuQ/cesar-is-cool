package Questao02;

import java.util.Scanner;
import java.util.Arrays;

public class Comparador {
  /* attributes */
  private int numeroUm;
  private int numeroDois;
  private int numeroTres;

  /* getters and setters */
  public void setNumeroUm(int numero) {
    this.numeroUm = numero;
  }

  public int getNumeroUm() {
    return this.numeroUm;
  }

  public void setNumeroDois(int numero) {
    this.numeroDois = numero;
  }

  public int getNumeroDois() {
    return this.numeroDois;
  }

  public void setNumeroTres(int numero) {
    this.numeroTres = numero;
  }

  public int getNumeroTres() {
    return this.numeroTres;
  }

  public int getMaior() {
    int[] array = { this.numeroUm, this.numeroDois, this.numeroTres };
    Arrays.sort(array);

    return array[array.length - 1];
  }

  /* method: main */
  public static void main(String[] args) {

    /* constructors */
    Scanner scanner = new Scanner(System.in);
    Comparador comparador = new Comparador();

    /* user input */
    System.out.println("Insert three numbers, separated by space: ");
    String numbers = scanner.nextLine();
    scanner.close();

    /* string manipulation */
    String[] numbersArray = numbers.split(" ");

    /* method call */
    int numeroUm = Integer.valueOf(numbersArray[0]);
    comparador.setNumeroUm(numeroUm);

    int numeroDois = Integer.valueOf(numbersArray[1]);
    comparador.setNumeroDois(numeroDois);

    int numeroTres = Integer.valueOf(numbersArray[2]);
    comparador.setNumeroTres(numeroTres);

    /* program output */
    int numeroMaior = comparador.getMaior();
    System.out.println("Greatest number: " + numeroMaior);
  }
}
