/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pousada;

/**
 *
 * @author marce
 */
public class Usuario {
    private String nome;
    private String cpf;
    
    public Usuario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    // Getters e setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}