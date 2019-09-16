package Questao03;

import java.util.Scanner;
import Questao03.Medidas;

public class ConversorDeMedidas {

  public String converterTemperatura(Medidas medidaUm, Medidas medidaDois) {

    /* check if unidade are equal */
    String medidaUmUnidade = medidaUm.getUnidadeDeTemperatura();
    String medidaDoisUnidade = medidaDois.getUnidadeDeTemperatura();
    boolean unidadesIguais = medidaUmUnidade.equals(medidaDoisUnidade) ? true : false;
    String errorMessage = "Não é possível realizar a conversão, pois as duas medidas já estão na mesma unidade.";

    if (unidadesIguais)
      return errorMessage;
    else {
      int medidaUmTemperaturaNova = (int) ((medidaUmUnidade == "f") ? ((medidaUm.getTemperatura() - 32) / 1.8)
          : ((medidaUm.getTemperatura() * 1.8) + 32));
      medidaUm.setTemperatura(medidaUmTemperaturaNova);
      String medidaUmUnidadeDeTemperaturaNova = (medidaUmUnidade == "f") ? "c" : "f";
      medidaUm.setUnidadeDeTemperatura(medidaUmUnidadeDeTemperaturaNova);

      int medidaDoisTemperaturaNova = (int) ((medidaDoisUnidade == "f") ? ((medidaDois.getTemperatura() - 32) / 1.8)
          : ((medidaDois.getTemperatura() * 1.8) + 32));
      medidaDois.setTemperatura(medidaDoisTemperaturaNova);
      String medidaDoisUnidadeDeTemperaturaNova = (medidaUmUnidade == "f") ? "c" : "f";
      medidaDois.setUnidadeDeTemperatura(medidaDoisUnidadeDeTemperaturaNova);
    }

    String medidaUmConvertida = medidaUm.getTemperatura() + " " + medidaUm.getUnidadeDeTemperatura();
    String medidaDoisConvertida = medidaDois.getTemperatura() + " " + medidaDois.getUnidadeDeTemperatura();

    return ("Temp. 01: " + medidaUmConvertida + " | " + "Temp. 02: " + medidaDoisConvertida);
  }

  public String converterMassa(Medidas medidaUm, Medidas medidaDois) {

    /* check if unidade are equal */
    String medidaUmUnidade = medidaUm.getUnidadeDeMassa();
    String medidaDoisUnidade = medidaDois.getUnidadeDeMassa();
    boolean unidadesIguais = medidaUmUnidade.equals(medidaDoisUnidade) ? true : false;
    String errorMessage = "Não é possível realizar a conversão, pois as duas medidas já estão na mesma unidade.";

    if (unidadesIguais)
      return errorMessage;
    else {
      double medidaUmMassaNova = (medidaUmUnidade == "lb") ? (medidaUm.getMassa() / 2.2046)
          : (medidaUm.getMassa() * 2.2046);
      medidaUm.setMassa(medidaUmMassaNova);
      String medidaUmUnidadeDeMassaNova = (medidaUmUnidade == "lb") ? "kg" : "lb";
      medidaUm.setUnidadeDeMassa(medidaUmUnidadeDeMassaNova);

      double medidaDoisMassaNova = (medidaDoisUnidade == "lb") ? (medidaDois.getMassa() / 2.2046)
          : (medidaDois.getMassa() * 2.2046);
      medidaDois.setMassa(medidaDoisMassaNova);
      String medidaDoisUnidadeDeMassaNova = (medidaUmUnidade == "lb") ? "kg" : "lb";
      medidaDois.setUnidadeDeMassa(medidaDoisUnidadeDeMassaNova);
    }

    String medidaUmConvertida = medidaUm.getMassa() + " " + medidaUm.getUnidadeDeMassa();
    String medidaDoisConvertida = medidaDois.getMassa() + " " + medidaDois.getUnidadeDeMassa();

    return ("Massa 01: " + medidaUmConvertida + " | " + "Massa 02: " + medidaDoisConvertida);
  }

  public String converterDistancia(Medidas medidaUm, Medidas medidaDois) {

    /* check if unidade are equal */
    String medidaUmUnidade = medidaUm.getUnidadeDeDistancia();
    String medidaDoisUnidade = medidaDois.getUnidadeDeDistancia();
    boolean unidadesIguais = medidaUmUnidade.equals(medidaDoisUnidade) ? true : false;
    String errorMessage = "Não é possível realizar a conversão, pois as duas medidas já estão na mesma unidade.";

    if (unidadesIguais)
      return errorMessage;
    else {
      double medidaUmDistanciaNova = (medidaUmUnidade == "mi") ? (medidaUm.getDistancia() * 1.609)
          : (medidaUm.getDistancia() / 1.609);
      medidaUm.setDistancia(medidaUmDistanciaNova);
      String medidaUmUnidadeDeDistanciaNova = (medidaUmUnidade == "mi") ? "km" : "mi";
      medidaUm.setUnidadeDeDistancia(medidaUmUnidadeDeDistanciaNova);

      double medidaDoisDistanciaNova = (medidaDoisUnidade == "mi") ? (medidaDois.getDistancia() * 1.609)
          : (medidaDois.getDistancia() / 1.609);
      medidaDois.setDistancia(medidaDoisDistanciaNova);
      String medidaDoisUnidadeDeDistanciaNova = (medidaUmUnidade == "mi") ? "km" : "mi";
      medidaDois.setUnidadeDeDistancia(medidaDoisUnidadeDeDistanciaNova);
    }

    String medidaUmConvertida = medidaUm.getDistancia() + " " + medidaUm.getUnidadeDeDistancia();
    String medidaDoisConvertida = medidaDois.getDistancia() + " " + medidaDois.getUnidadeDeDistancia();

    return ("Distancia 01: " + medidaUmConvertida + " | " + "Distancia 02: " + medidaDoisConvertida);
  }

  /* method: main */
  public static void main(String[] args) {

    /* constructors */
    Scanner scanner = new Scanner(System.in);
    ConversorDeMedidas conversorDeMedidas = new ConversorDeMedidas();
    Medidas medida01 = new Medidas();
    Medidas medida02 = new Medidas();

    /* user input */
    System.out
        .println("Insira um inteiro seguido de sua unidade, separadas por espaço (e.g.: 20 c / 10 km / 100 kg): ");
    String[] medidaUm = scanner.nextLine().split(" ");

    System.out
        .println("Insira um inteiro seguido de sua unidade, separadas por espaço (e.g.: 20 f / 10 mi / 100 lb): ");
    String[] medidaDois = scanner.nextLine().split(" ");

    scanner.close();

    /* case selector */
    if (medidaUm[1].contains("f") || medidaUm[1].contains("c")) {
      medida01.setTemperatura(Integer.valueOf(medidaUm[0]));
      medida01.setUnidadeDeTemperatura(medidaUm[1]);

      medida02.setTemperatura(Integer.valueOf(medidaDois[0]));
      medida02.setUnidadeDeTemperatura(medidaDois[1]);

      System.out.println(conversorDeMedidas.converterTemperatura(medida01, medida02));

    } else if (medidaUm[1].contains("lb") || medidaUm[1].contains("kg")) {
      medida01.setMassa(Double.valueOf(medidaUm[0]));
      medida01.setUnidadeDeMassa(medidaUm[1]);

      medida02.setMassa(Integer.valueOf(medidaDois[0]));
      medida02.setUnidadeDeMassa(medidaDois[1]);

      System.out.println(conversorDeMedidas.converterMassa(medida01, medida02));

    } else if (medidaUm[1].contains("mi") || medidaUm[1].contains("km")) {
      medida01.setDistancia(Double.valueOf(medidaUm[0]));
      medida01.setUnidadeDeDistancia(medidaUm[1]);

      medida02.setDistancia(Integer.valueOf(medidaDois[0]));
      medida02.setUnidadeDeDistancia(medidaDois[1]);

      System.out.println(conversorDeMedidas.converterDistancia(medida01, medida02));

    } else {
      System.out.println("Invalid operation!");
    }
    ;
  }
}
