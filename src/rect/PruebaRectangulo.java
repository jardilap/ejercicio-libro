/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rect;

/**
 *
 * @author ESTUDIANTE
 */
import java.util.Scanner;
public class PruebaRectangulo {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.println("Ingrese Base");
        double base = lectura.nextDouble();
        System.out.println("Ingrese Altura");
        double altura = lectura.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo(base,altura);
        double area = rectangulo.calcularArea();
        double perimetro = rectangulo.calcularPerimetro();
        
        System.out.println("Area " + area + " perimetro " + perimetro);
        
    }
}
