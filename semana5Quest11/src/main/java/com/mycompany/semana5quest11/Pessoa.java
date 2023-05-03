/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana5quest11;

/**
 *
 * @author marce
 */
public class Pessoa extends Object {
    private static int contador = 0;
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        contador++;
    }
    
    public static int getContador(){
        return contador;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
}
