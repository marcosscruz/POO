/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana6quest7c;

/**
 *
 * @author marce
 */
public class Semana6Quest7c {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Pessoa p = new Pessoa("Marcos", 21);
        
        // chamada implicita do método toString()
        System.out.println(p);
        
        // chamada explicita do método toString
        String s = p.toString();
        System.out.println(s);
    }
}
