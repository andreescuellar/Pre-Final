package Problema2;
/**
*
* @author Andr�s Cu�llar
*/
public  class Cuadrilatero implements Poligono{

	public double area(double base, double altura) {
        return (base * altura);
    }

    public double perimetro(double[] lados) {
        double sum = 0;
        for (int i = 0; i < lados.length; i++) {
            sum += lados[i];
        }
        return sum;
    }
    
}
