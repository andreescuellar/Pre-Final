package Problema2;

/**
*
* @author Andrés Cuéllar
*/ 
public class Cuadrado extends Cuadrilatero{
	
	private double l = 0.0;
	

	public void Area(double l) throws IllegalArgumentException {
		this.l = l;
		
	}
	
	public double getArea() throws IllegalArgumentException {
		return l*l;
	}

	public void Perimetro(double l) throws IllegalArgumentException {
		this.l = l;
	}
	
	public double getPerimetro() throws IllegalArgumentException {
		return l*4;
	}


}
