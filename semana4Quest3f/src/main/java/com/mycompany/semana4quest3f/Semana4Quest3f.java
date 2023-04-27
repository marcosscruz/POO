/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana4quest3f;

import java.util.Scanner;

/**
 *
 * @author marce
 */
public class Semana4Quest3f {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Pessoa pessoa1 = new Pessoa();
        
        pessoa1.displayMessage();  // chamando o metodo displayMessage() sem argumento
        
        // lendo o nome da pessoa usando Scanner e chamando o método displayMessage(String nome)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seu nome: ");
        String nome = scanner.nextLine();
        pessoa1.displayMessage(nome);

        scanner.close();
    }
}
