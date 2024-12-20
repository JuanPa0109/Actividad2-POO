/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_propuesto_22;

/**
 *
 * @author Acer
 */


import java.util.Scanner;

public class Ejercicio_propuesto_22 {

  public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el nombre del empleado:");
            String nombreEmpleado = scanner.nextLine();
            
            System.out.println("Ingrese el salario básico por hora:");
            double salarioHora = scanner.nextDouble();
            
            System.out.println("Ingrese el número de horas trabajadas en el mes:");
            int horasTrabajadas = scanner.nextInt();
            
            // Calcular el salario mensual
            double salarioMensual = salarioHora * horasTrabajadas;
            
            // Verificar si el salario mensual es mayor que $450.000
            if (salarioMensual > 450000) {
                System.out.println("Nombre del empleado: " + nombreEmpleado);
                System.out.println("Salario mensual: $" + salarioMensual);
            } else {
                System.out.println("Nombre del empleado: " + nombreEmpleado);
            }
        }
    }
}
