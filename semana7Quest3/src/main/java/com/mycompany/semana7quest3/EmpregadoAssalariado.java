/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana7quest3;

/**
 *
 * @author marcos
 */

// a classe concreta EmpregadoAssalariado estende a classe abstrata Funcionario
public class EmpregadoAssalariado extends Funcionario{
    private double salarioSemanal;
    
    //cosntrutor
    public EmpregadoAssalariado(String primeiroNome, String ultimoNome, String numSocialSeguro, double salarioSemanal){
        super(primeiroNome, ultimoNome, numSocialSeguro);
        
        if(salarioSemanal < 0.0)
            throw new IllegalArgumentException("Salário semanal deve ser >= 0.0");
        this.salarioSemanal = salarioSemanal;
    }
    
    // configura o salário
    public void setSalarioSemanal(double salarioSemanal){
        if(salarioSemanal < 0.0)
            throw new IllegalArgumentException("Salário semanal deve ser >= 0.0");
        this.salarioSemanal = salarioSemanal;
    }
    public double getSalarioSemanal(){
        return salarioSemanal;
    }
    
    // calcula os rendimentos 
    // sobrescreve o método gannhos de Funcionario
    @Override
    public double ganhos(){
        return getSalarioSemanal();
    }
    
    // retorna a representação String do objeto
    @Override
    public String toString(){
        return String.format(
            "empregado assalariado: %s%n%s: $%,.2f",
            super.toString(), "salário semanal",
            getSalarioSemanal()
        );
    }
}
