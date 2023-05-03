/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana6quest6;

/**
 *
 * @author marce
 */
public class Cachorro extends Animal {
    @Override
    public void emitirSom(){
        super.emitirSom(); // chamando o método da superclasse
        System.out.println("AU AU!");
    }
}
