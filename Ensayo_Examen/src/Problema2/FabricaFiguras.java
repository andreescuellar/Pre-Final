package Problema2;
/**
*
* @author Andrés Cuéllar
*/
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Andrés Cuéllar
 */
public class FabricaFiguras {

    public void GenerarFigura() {

        int numLados;
        Scanner S = new Scanner(System.in);
        System.out.println("Ingrese Lados del Poligono");
        Poligono x;

        numLados = S.nextInt();
        
        /**
        *
        *		TRIANGULO
        *
        */
        
        
        if (numLados == 3) {
            double base, altura;
            double[] lados = new double[3];

            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese lado: " + (i + 1));
                lados[i] = S.nextInt();
            }
            Arrays.sort(lados);
            
            if (lados[0] == lados[1] || lados[0] == lados[2] || lados[1] == lados[2]) {
                if (lados[0] == lados[1] && lados[1] == lados[2]) {
                    x = new TrianguloEquilatero();
                    base = lados[0];
                    altura = Math.sqrt(Math.pow(lados[0], 2) - Math.pow((lados[0] / 2), 2));
                } else {
                    x = new TrianguloIsoceles();
                    if (lados[0] == lados[1]) {
                        base = lados[2];
                        altura = Math.sqrt(Math.pow(lados[0], 2) - Math.pow((lados[2] / 2), 2));
                    } else {
                        base = lados[0];
                        altura = Math.sqrt(Math.pow(lados[1], 2) - Math.pow((lados[0] / 2), 2));
                    }
                }
            } else {
                x = new Triangulo();
                base = lados[0];
                altura = lados[1];
            }
            System.out.println("El area el triangulo es: " + x.area(base, altura));
            System.out.println("El perimetro el triangulo es: " + x.perimetro(lados));
        }
        /**
        *
        *		CUADRILATERO
        *
        */
        if (numLados == 4) {
            double base, altura;
            double[] lados = new double[2];
            System.out.println("Digite base del cuadrilatero");
            base = S.nextInt();
            System.out.println("Digite altura del cuadrilatero");
            altura = S.nextInt();
            lados[0] = 2 * base;
            lados[1] = 2 * altura;

            if (base == altura) {
                x = new Cuadrado();
                System.out.println("Area cuadrado:" + x.area(base, altura));
                System.out.println("Perimetro cuadrado:" + x.perimetro(lados));
            } else {
                x = new Rectangulo();
                System.out.println("Area Rectangulo:" + x.area(base, altura));
                System.out.println("Perimetro Rectangulo:" + x.perimetro(lados));
            }
        }
        /**
        *
        *		PENTAGONO
        *
        */
        if (numLados == 5) {
            x = new Pentagono();
            double lado, apotema;
            double[] lados = new double[1];
            System.out.println("Ingrese un lado del pentagono");
            lado = S.nextInt();
            apotema = lado / (2 * Math.tan(Math.toRadians(360 / (2 * 5))));

            System.out.println("Area Pentagono: " + Math.round(x.area(lado, apotema)));
            lados[0] = 5 * lado;
            System.out.println("Perimetro Pentagono:" + Math.round(x.perimetro(lados)));
        }
        /**
        *
        *		HEXAGONO
        *
        */
        if (numLados == 6) {
            x = new Hexagono();
            double lado, apotema;
            double[] lados = new double[1];
            System.out.println("Digite un lado del Hexagono");
            lado = S.nextInt();
            apotema = lado / (2 * Math.tan(Math.toRadians(360 / (2 * 6))));

            System.out.println("Area Hexagono: " + Math.round(x.area(lado, apotema)));
            lados[0] = 6 * lado;
            System.out.println("Perimetro Hexagono: " + Math.round(x.perimetro(lados)));
        }
        /**
        *
        *		OCTAGONO
        *
        */
        if (numLados == 8) {
            x = new Octagono();
            double lado, apotema;
            double[] lados = new double[1];
            System.out.println("Ingrese un lado del Octagono");
            lado = S.nextInt();
            apotema = lado / (2 * Math.tan(Math.toRadians(22.5)));

            System.out.println("Area Octagono :" + Math.round(x.area(lado, apotema)));
            lados[0] = 8 * lado;
            System.out.println("Perimetro Octagono es:" + Math.round(x.perimetro(lados)));
        }
     }
}