/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figurasgeometricas1;

/**
 *
 * @author Acer
 */
public class FigurasGeometricas1 {

    /**
Método main que crea un círculo, un rectángulo, un cuadrado y
un triángulo rectángulo. Para cada uno de estas figuras geométricas,
se calcula su área y perímetro.
*/
public static void main(String args[]) {
Circulo figura1 = new Circulo(2);
Rectangulo figura2 = new Rectangulo(1,2);
Cuadrado figura3 = new Cuadrado(3);
TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);

System.out.println("El area del círculo es = " + figura1.calcularArea());
System.out.println("El perimetro del circulo es = " + figura1.calcularPerimetro());
System.out.println();
System.out.println("El area del rectangulo es = " + figura2.calcularArea());
System.out.println("El perímetro del rectangulo es = " + figura2.calcularPerimetro());
System.out.println();
System.out.println("El área del cuadrado es = " + figura3.calcularArea());
System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
System.out.println();
System.out.println("El area del triangulo es = " + figura4.calcularArea());
System.out.println("El perímetro del triangulo es = " + figura4.calcularPerimetro());
figura4.determinarTipoTriangulo();
System.out.println();

}
}
