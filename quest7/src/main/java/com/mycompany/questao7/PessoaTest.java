/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao7;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class PessoaTest {
    public static void main(String[] args) {
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
