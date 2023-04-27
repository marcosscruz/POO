/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana4quest4d;

/**
 *
 * @author marcos
 */
public class sobrecargaFuncao {

    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }
   
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        sobrecargaFuncao calc = new sobrecargaFuncao();

        int resultado1 = calc.somar(2, 3); // resultado1 = 5
        double resultado2 = calc.somar(2.5, 3.5); // resultado2 = 6.0
        int resultado3 = calc.somar(2, 3, 4); // resultado3 = 9
        
        
        System.out.println("Reusltado 1: " + resultado1);
        System.out.println("Reusltado 2: " + resultado2);
        System.out.println("Reusltado 3: " + resultado3);
    }
}
