package Problema2;
/**
*
* @author Andrés Cuéllar
*/
public class Rectangulo extends Cuadrilatero {

	private double l = 0.0;
	private double n = 0.0;
	

	public void Area(double l, double n) throws IllegalArgumentException {
		this.l = l;
		this.n = n;
		
	}
	
	public double getArea() throws IllegalArgumentException {
		return l*n;
	}

	public void Perimetro(double l, double n) throws IllegalArgumentException {
		this.l = l;
		this.n = n;
	}
	
	public double getPerimetro() throws IllegalArgumentException {
		return (2*l)+(2*n);
	}

	

}
