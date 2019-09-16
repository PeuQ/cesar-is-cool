package q4;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

enum DiaDaSemana { 
	SEG, TER, QUA, QUI, SEX, SAB, DOM;
};

public class Data {
		
	private int dia;
	private int mes;
	private int ano;
	private DiaDaSemana diaDaSemana;
	
	public Data(int dia, int mes, int ano, DiaDaSemana diaDaSemana) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.diaDaSemana = diaDaSemana;
		this.validate();
	}
	
	public int getDia() {
		return this.dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return this.mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public DiaDaSemana getDiaDaSemana() {
		return this.diaDaSemana;
	}

	public void setDiaDaSemana(DiaDaSemana diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ano;
		result = prime * result + dia;
		result = prime * result + ((diaDaSemana == null) ? 0 : diaDaSemana.hashCode());
		result = prime * result + mes;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data other = (Data) obj;
		if (ano != other.ano)
			return false;
		if (dia != other.dia)
			return false;
		if (diaDaSemana != other.diaDaSemana)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}

	public void validate() {
		
		/* days in each month */
		int[] monthLength = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		/* validate mes */
		int mes = this.getMes() > 12 ? 12
				: this.getMes() < 1 ? 1
				: this.getMes();
		
		this.setMes(mes);
		
		/* validate dia */
		int dia = this.getDia() > monthLength[this.getMes() -1] ? monthLength[this.getMes() -1]
				: this.getDia() < 1 ? 1
				: this.getDia();
		
		this.setDia(dia);
	}
	
	public static String dataComparator(Data[] dataArray) {
		
		/* case equal dates */
		if (dataArray[0].equals(dataArray[1]))
			return ("DATAS IGUAIS!!");
		
		int dataSum01 = dataArray[0].dia + dataArray[0].mes + dataArray[0].ano;
		int dataSum02 = dataArray[1].dia + dataArray[1].mes + dataArray[1].ano;

		String statement = dataSum01 > dataSum02 ? ("DATA 01 É MAIOR") : ("DATA 02 É MAIOR");
		
		return statement;
	}
	
	public static String dataComparator(DiaDaSemana diaDaSemana) {
		
		Date now = new Date();
		
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        
        /* case equal dates */
		if (diaDaSemana.ordinal() == dayOfWeek)
			return ("DIA PARAMETRO IGUAL!!");

		String statement = (diaDaSemana.ordinal() > dayOfWeek) ? ("DIA PARAMETRO ANTES") : ("DIA PARAMETRO DEPOIS");
		
		return statement;
	}

	public static void main(String[] args) {
		
	    /* constructors */
	    Scanner scanner = new Scanner(System.in);
	    Data[] dataArray = new Data[2]; 
	    
	    for(int index = 0; index < 2; index++) {
		    /* user input */
		    System.out.println("DATA 0" + (index+1));
		    System.out.println("Insira uma data no formato: 'dd/mm/aaaa'");
		    String[] dateString = scanner.nextLine().split("/");
		    
		    System.out.println("Insira um dia da semana no formato: SEG, TER, QUA, QUI, SEX, SAB, DOM");
		    DiaDaSemana diaDaSemana = DiaDaSemana.valueOf(scanner.nextLine().toUpperCase());
 
		    /* string manipulation */
			int day = Integer.valueOf(dateString[0]);
			int month = Integer.valueOf(dateString[1]);
			int year = Integer.valueOf(dateString[2]);
			
			dataArray[index] = new Data(day, month, year, diaDaSemana);
		}
	    
	    scanner.close();
	    
	    /* compare dates */ 
		System.out.println(dataComparator(dataArray));
		System.out.println(dataComparator(dataArray[0].diaDaSemana));

	}
}
