package Questao01;

import java.util.Scanner;

public class Calculadora {
  /* attributes */
  private double resultado;

  /* method: summation */
  public double Somar(double primeiro, double segundo) {
    this.resultado = primeiro + segundo;
    System.out.print("Addition: " + resultado);
    return this.resultado;
  }

  /* method: subtraction */
  public double Subtrair(double primeiro, double segundo) {
    this.resultado = primeiro - segundo;
    System.out.print("Subtraction: " + resultado);
    return this.resultado;
  }

  /* method: multiplication */
  public double Multiplicar(double primeiro, double segundo) {
    this.resultado = primeiro * segundo;
    System.out.print("Multiplication: " + resultado);
    return this.resultado;

  }

  /* method: division */
  public double Dividir(double primeiro, double segundo) {
    this.resultado = primeiro / segundo;
    System.out.print("Division: " + resultado);
    return this.resultado;
  }

  /* method: main */
  public static void main(String[] args) {

    /* constructors */
    Scanner scanner = new Scanner(System.in);
    Calculadora calculadora = new Calculadora();

    /* instructions */
    System.out.println("[sample input: 1+3, 4* 18, 8--1, -10.2/8 ");
    System.out.println("Insert you arithmetic operation, in one line: ");

    /* user input */
    String expression = scanner.nextLine();
    scanner.close();

    /* string manipulation */
    String expressionWithoutSpaces = expression.replaceAll(" ", "");
    String[] expressionNumbers = (expressionWithoutSpaces.startsWith("-")) ? expressionWithoutSpaces.split("[*/+-]", 3)
        : expressionWithoutSpaces.split("[*/+-]", 2);

    /* string to double conversion */
    double numeroPrimeiro = (expressionNumbers.length == 3) ? Double.valueOf("-" + expressionNumbers[1])
        : Double.valueOf(expressionNumbers[0]);
    double numeroSegundo = (expressionNumbers.length == 3) ? Double.valueOf(expressionNumbers[2])
        : Double.valueOf(expressionNumbers[1]);

    /* selector */
    double resultado = (expression.contains("*")) ? calculadora.Multiplicar(numeroPrimeiro, numeroSegundo)
        : (expression.contains("/")) ? calculadora.Dividir(numeroPrimeiro, numeroSegundo)
            : (expression.contains("+")) ? calculadora.Somar(numeroPrimeiro, numeroSegundo)
                : (expression.contains("-")) ? calculadora.Subtrair(numeroPrimeiro, numeroSegundo) : null;
  }

}
