/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_resuelto_7;

/**
 *
 * @author Acer
 */

import java.util.Scanner;


public class Ejercicio_resuelto_7 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese el valor de A:");
            int A = sc.nextInt();
            
            System.out.println("Ingrese el valor de B:");
            int B = sc.nextInt();
            
            if (A > B) {
                System.out.println("A es mayor que B");
            } else if (A < B) {
                System.out.println("A es menor que B");
            } else {
                System.out.println("A es igual a B");
            }
        }
    }
}
