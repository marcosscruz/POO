/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana5quest2a;

/**
 *
 * @author marcos
 */

public class Conta {
    private static int totalContas;
    
    Conta(){
        Conta.totalContas = totalContas + 1;
    }
    
    public int getTotalContas(){
        return Conta.totalContas;
    }
    
    public static void main(String[] args) {
        Conta c = new Conta();
        int total = c.getTotalContas();
    }
}
