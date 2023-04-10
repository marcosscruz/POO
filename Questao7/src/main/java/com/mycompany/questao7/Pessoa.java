/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao7;

/**
 *
 * @author Marcos
 */
public class Pessoa {
    private String nomePessoa;
    
    public void displayMessage(){
        System.out.println("eu sou uma pessoa");
    }
    
    public void displayMessage(String Nome){
        System.out.println("olá, sou uma pessoa e meu nome é " + Nome);
    }
    
    public String getNomePessoa(){
        return nomePessoa;
    }
    
    public void setNomePessoa(String nomePessoa){
        this.nomePessoa = nomePessoa;
    }
}
