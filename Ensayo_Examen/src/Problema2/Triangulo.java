package Problema2;
/**
*
* @author Andr�s Cu�llar
*/
public  class Triangulo implements Poligono {

	
    public double area(double base, double altura) {
        return (base * altura) / 2;
    }

    
    public double perimetro(double[] lados) {
        int sum = 0;
        for (int i = 0; i < lados.length; i++) {
            sum += lados[i];
        }
        return sum;
    }
}
