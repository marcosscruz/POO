/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana7quest3;

/**
 *
 * @author marcos
 */
public class BasePlusCommissioEmployee extends Object{
    private final String primeiroNome;
    private final String ultimoNome;
    private final String numSocialSeguro;
    private double rendaBruta;
    private double taxaComissao;
    private double salarioBase;
    
    // construtor de 6 argumentos
    public BasePlusCommissioEmployee(String primeiroNome, String ultimoNome, String numSocialSeguro, double rendaBruta, double taxaComissao, double salarioBase){
        // a chamada implicita para o construtor padrão acontece aqui
        
        if(rendaBruta < 0.0)
            throw new IllegalArgumentException("Renda bruta deve ser >= 0.0");
        if(taxaComissao <= 0.0 || taxaComissao >= 1.0)
            throw new IllegalArgumentException("Taxa de comissão deve ser > 0.0 e < 1.0");
        if(salarioBase < 0.0)
            throw new IllegalArgumentException("Salário base deve ser >= 0.0");
        
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.numSocialSeguro = numSocialSeguro;
        this.rendaBruta = rendaBruta;
        this.taxaComissao = taxaComissao;
        this.salarioBase = salarioBase;
    }
    
    // getters and setters
    public String getPrimeiroNome(){
        return primeiroNome;
    }
    public String getUltimoNome(){
        return ultimoNome;
    }
    public String getNumSocialSeguro(){
        return numSocialSeguro;
    }
    
    public void setRendaBruta(double rendaBruta){
        if(rendaBruta < 0.0)
            throw new IllegalArgumentException("Renda bruda deve ser >= 0.0");
        this.rendaBruta = rendaBruta;
    }
    public double getRendaBruta(){
        return rendaBruta;
    }
    
    public void setTaxaComissao(double taxaComissao){
        if(taxaComissao <= 0.0 || taxaComissao >= 1.0)
            throw new IllegalArgumentException("Taxa de comissão deve ser > 0.0 e < 1.0");
        this.taxaComissao = taxaComissao;
    }
    public double getTaxaComissao(){
        return taxaComissao;
    }
    
    public void setSalarioBase(double salarioBase){
        if(salarioBase < 0.0)
            throw new IllegalArgumentException("Salário base deve ser >= 0.0");
        this.salarioBase = salarioBase;
    }
    public double getSalarioBase(){
        return salarioBase;
    }
    
    // calculo lucros
    public double ganhos(){
        return salarioBase + (taxaComissao * rendaBruta);
    }
    
    // retorna a representação de String da BasePlusCommissionEmployee
    @Override
    public String toString(){
        return String.format(
            "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
            "base-salarial do empregado comissionado", primeiroNome, ultimoNome,
            "numero de segurnça social", numSocialSeguro,
            "renda bruta", rendaBruta, "taxa de comissão", taxaComissao,
            "salário base", salarioBase
        );
    }
}
