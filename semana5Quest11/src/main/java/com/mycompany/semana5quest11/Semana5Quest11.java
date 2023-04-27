/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana5quest11;

/**
 *
 * @author marce
 */
public class Semana5Quest11 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Marcos", 21);
        Pessoa p2 = new Pessoa("Eduardo", 30);
        Pessoa p3 = new Pessoa("Pedro", 35);

        System.out.println("Quantidade de pessoas instânciadas: " + Pessoa.getContador()); // imprime 3
    }
}
