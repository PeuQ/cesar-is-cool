package Questao03;

import java.util.Scanner;

public class Medidas {

  /* attributes */
  private int temperatura;
  private double massa;
  private double distancia;
  private String unidadeDeTemperatura;
  private String unidadeDeMassa;
  private String unidadeDeDistancia;

  /* class constructors */
  public Medidas() {

  }

  public Medidas(int temperatura, double massa, double distancia, String unidadeDeTemperatura, String unidadeDeMassa,
      String unidadeDeDistancia) {
    this.temperatura = temperatura;
    this.massa = massa;
    this.distancia = distancia;
    this.unidadeDeTemperatura = unidadeDeTemperatura;
    this.unidadeDeMassa = unidadeDeMassa;
    this.unidadeDeDistancia = unidadeDeDistancia;
  }

  /* getters and setters */
  public void setTemperatura(int temperatura) {
    this.temperatura = temperatura;
  }

  public int getTemperatura() {
    return this.temperatura;
  }

  public void setUnidadeDeTemperatura(String unidade) {
    this.unidadeDeTemperatura = unidade;
  }

  public String getUnidadeDeTemperatura() {
    return this.unidadeDeTemperatura;
  }

  public void setMassa(double massa) {
    this.massa = massa;
  }

  public double getMassa() {
    return this.massa;
  }

  public void setUnidadeDeMassa(String unidade) {
    this.unidadeDeMassa = unidade;
  }

  public String getUnidadeDeMassa() {
    return this.unidadeDeMassa;
  }

  public void setDistancia(double distancia) {
    this.distancia = distancia;
  }

  public double getDistancia() {
    return this.distancia;
  }

  public void setUnidadeDeDistancia(String unidade) {
    this.unidadeDeDistancia = unidade;
  }

  public String getUnidadeDeDistancia() {
    return this.unidadeDeDistancia;
  }
}
