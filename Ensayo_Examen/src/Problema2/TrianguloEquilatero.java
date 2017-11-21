package Problema2;
/**
*
* @author Andrés Cuéllar
*/
public class TrianguloEquilatero extends Triangulo {
	
	private double altura=0.0;
	private double l = 0.0;



	public void Altura(double l) throws IllegalArgumentException {
		this.l = l;
		
		altura = Math.sqrt(Math.pow(l, 2)- (Math.pow(l, 2))/4);
	}

	public double getArea() throws IllegalArgumentException {
		return (this.l*altura)/2;
		
	}
	
	public void Perimetro(double l) throws IllegalArgumentException {
		this.l = l;
	}

	public double getPerimetro() throws IllegalArgumentException {
		return  this.l*3;
		
	}
}
