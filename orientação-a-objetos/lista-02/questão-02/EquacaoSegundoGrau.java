package q2;

import java.util.Scanner;

public class EquacaoSegundoGrau {

	private double a;
	private double b;
	private double c;

	public EquacaoSegundoGrau(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Override
	public String toString() {
		return "EquacaoSegundoGrau [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(a);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(b);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(c);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		EquacaoSegundoGrau other = (EquacaoSegundoGrau) obj;
		if (Double.doubleToLongBits(a) != Double.doubleToLongBits(other.a))
			return false;
		if (Double.doubleToLongBits(b) != Double.doubleToLongBits(other.b))
			return false;
		if (Double.doubleToLongBits(c) != Double.doubleToLongBits(other.c))
			return false;
		return true;
	}

	public double getA() {
		return this.a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return this.b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return this.c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	public double[] getRaizes() {
		
		double[] roots = new double[2]; 
		double delta = Math.pow(this.getB(), 2) - (4 * this.getA() * this.getC());

		/* case: no real roots (delta < 0) */
		if (delta < 0) {
			System.out.println("No real roots!");
			
			return roots;
		}
		
		/* case: one real root (delta == 0) */
		else if (delta == 0) {
			System.out.println("One real root!");
			roots[0] = roots[1] = (- (this.getB()) / (2 * this.getA())); 
			
			return roots;
		}
		
		/* case: two real roots (delta > 0)	*/	
		else if (delta > 0) {
			roots[0] = (- (this.getB()) + Math.sqrt(delta)) / (2 * this.getA());
			roots[1] = (- (this.getB()) - Math.sqrt(delta)) / (2 * this.getA());
			
			return roots;
		}
		
		throw new Error();
	}
	
	public static void main(String[] args) {
		
	    /* constructors */
	    Scanner scanner = new Scanner(System.in);
	    
	    /* instructions */
	    System.out.println("Consider the following 2nd degree equation: a * x2 + b * x + c = 0");
	    System.out.println("To find the equation roots, we'll use Bhaskara's Formula: (-b +- sqrt(b^2 - 4ac)) / 2a");
	    System.out.println("Insert values for a, b and c separated by space or comma: ");
	    
	    /* user input */
	    String expressionString = scanner.nextLine();
	    scanner.close();

	    /* string manipulation */
	    String[] expressionNumbers = expressionString.split("[, ]");
	    
	    /* set class attributes */
	    EquacaoSegundoGrau equacaoSegundoGrau = new EquacaoSegundoGrau(
	    		(Double.valueOf(expressionNumbers[0])),
	    		(Double.valueOf(expressionNumbers[1])),
	    		(Double.valueOf(expressionNumbers[2])));
	    
	    /* program output */
	    double[] roots = equacaoSegundoGrau.getRaizes();
	    System.out.printf("Roots: {%f, %f}", roots[0], roots[1]);
	}
	
}
