package Problema2;
/**
*
* @author Andrés Cuéllar
*/
public class TrianguloIsoceles extends Triangulo {

	private double altura=0.0;

	private double l = 0.0;
	private double n = 0.0;


	public void Altura(double l,double n) throws IllegalArgumentException {
		this.l = l;
		this.n= n;
		
		altura = Math.sqrt(Math.pow(l, 2)- (Math.pow(n, 2))/4);
	}
	
	public void Perimetro(double l,double n) throws IllegalArgumentException {
		this.l = l;
		this.n = n;		
	}

	public double getArea() throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return (this.l*altura)/2;
	}

	public double getPerimetro() throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return (this.l*2)+this.n;
	}

}
