/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pousada;

/**
 *
 * @author marce
 */
public class Funcionario {
    private String cargo;
    private String salario;
    
    public Funcionario(String cargo, String salario){
        this.cargo = cargo;
        this.salario = salario;
    }
    
    // Getters e setters
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public String getSalario(){
        return salario;
    }
    public void setSalario(String salario){
        this.salario = salario;
    }
}
