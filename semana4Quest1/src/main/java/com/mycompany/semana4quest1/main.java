/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana4quest1;

/**
 *
 * @author marcos
 */
public class main {
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Marcos");
        pessoa.setSobrenome("Cruz");
        pessoa.setCpf("123.456.789-00");
        pessoa.setIdade(21);
        pessoa.setEndereco("Rua A, 123");

        System.out.println("Nome completo: " + pessoa.getNome() + " " + pessoa.getSobrenome());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Endereço: " + pessoa.getEndereco());
    }    
}
