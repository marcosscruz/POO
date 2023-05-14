/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana7quest3;

/**
 *
 * @author marcos
 */

// superclasse abstrata Funcionario

public abstract class Funcionario {
    private final String primeiroNome;
    private final String ultimoNome;
    private final String numSocialSeguro;
    
    // construtor
    public Funcionario(String primeiroNome, String ultimoNome, String numSocialSeguro){
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.numSocialSeguro = numSocialSeguro;
    }
    
    // get e set
    public String getPrimeiroNome(){
        return primeiroNome;
    }
    public String getUltimoNome(){
        return ultimoNome;
    }
    public String getNumSeguro(){
        return numSocialSeguro;
    }
    
    // representação de String do objeto
    @Override
    public String toString(){
        return String.format(
      "%s %s%n Número social de segurança: %s",        
            getPrimeiroNome(), getUltimoNome(), getNumSeguro()
        );
    }
    
    // O método abstract deve ser sobrescrito pelas subclasses concretas
    public abstract double ganhos(); // nenhuma implementação aqui
}
