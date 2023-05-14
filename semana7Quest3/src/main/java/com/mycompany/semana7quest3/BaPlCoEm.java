/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana7quest3;

/**
 *
 * @author marcos
 */

// BasePlusCommissionEmployee herda variáveis de instância protected de CommissionEmployee
public class BaPlCoEm extends FuncionarioComissionado{
    private double salarioBase;
    
    // construtor de 6 argumentos
   public BaPlCoEm(String primeiroNome, String ultimoNome, String numSeguro, double rendaBruta, double taxaComissao, double salarioBase){
       super(primeiroNome, ultimoNome, numSeguro, rendaBruta, taxaComissao);
       
       if(salarioBase < 0.0)
           throw new IllegalArgumentException("Salário base deve ser > 0.0");
       this.salarioBase = salarioBase;
   }
   
   // definindo get e set
   public void setSalarioBase(double salarioBase){
       if(salarioBase < 0.0)
           throw new IllegalArgumentException("Salário base deve ser > 0.0");
       this.salarioBase = salarioBase;
   }
   public double getSalarioBase(){
       return salarioBase;
   }
   
   // calcula os lucros
   @Override
   public double ganhos(){
       return getSalarioBase() + super.ganhos();
   }
   
   // retorna a representação de String da BasePlusCommissionEmployee
    @Override
    public String toString(){
        return String.format(
            "%s %s%n%s: %.2f", "assalariado base",
                super.toString(), "salário base",
                getSalarioBase()
        );
    }
}
