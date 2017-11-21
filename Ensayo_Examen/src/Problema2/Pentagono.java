package Problema2;
/**
*
* @author Andrés Cuéllar
*/
public class Pentagono implements Poligono {
	
	private double apotema =0;

	
	public void Apotema(double l,double r) throws IllegalArgumentException {
		apotema =  Math.sqrt(Math.pow(r, 2) - Math.pow(l/2, 2));
		
	}
	public double area(double lado, double apotema) {
        return (5 * lado * apotema) / 2;
    }

    public double perimetro(double[] lados) {
        double sum = 0;
        for (int i = 0; i < lados.length; i++) {
            sum += lados[i];
        }
        return sum;
    }

}
