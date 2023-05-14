/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana7quest3;

/**
 *
 * @author marcos
 */
public class CommissionEmployee extends Object {
    protected final String primeiroNome;
    protected final String ultimoNome;
    protected final String numSocialSeguro;
    protected double rendaBruta; // vendas brutas
    protected double taxaComissao; // percentagem da comissão
    
    // construtor de 5 argumentos
    public CommissionEmployee(String primeiroNome, String ultimoNome, String numSocialSeguro, double rendaBruta, double taxaComissao){
        // a chamada implicita para o construtor padrão do Object ocorre aqui
        // se grossSales é invalido, lança uma exceção
        if(rendaBruta < 0.0){
            throw new IllegalArgumentException("Renda bruta deve ser > 0.0");           
        }
        // se commissionRate é invalido, lança uma exceção
        if(taxaComissao <= 0.0 || taxaComissao >= 1.0){
            throw new IllegalArgumentException("Taxa de comissão deve ser > 0.0 e < 1.0");
        }
        
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.numSocialSeguro = numSocialSeguro;
        this.rendaBruta = rendaBruta;
        this.taxaComissao = taxaComissao;
    }
    
    // os getters e setters
    public String getPrimeiroNome(){
        return primeiroNome;
    }
    public String getUltimoNome(){
        return ultimoNome;
    }
    public String getNumSocialSeguro(){
        return numSocialSeguro;
    }
    // configura a quantidade de vendas brutas
    public void setRendaBruta(double rendaBruta){
        if(rendaBruta < 0.0){
            throw new IllegalArgumentException("Renda bruta deve ser >= 0.0");
        }
        this.rendaBruta = rendaBruta;
    }
    // retorna a quantidade de vendas brutas
    public double getRendaBruta(){
        return rendaBruta;
    }
    // configura a taxa de comissão
    public void setTaxaComissao(double taxaComissao){
        if(taxaComissao <= 0.0 || taxaComissao >= 1.0)
            throw new IllegalArgumentException("Taxa de comissão deve ser > 0.0 e < 1.0");
        this.taxaComissao = taxaComissao;
    }
    public double getTaxaComissao(){
        return taxaComissao;
    }
    
    // calcula lucros
    public double ganhos(){
        return taxaComissao * rendaBruta;
    }
    
    // retorna a representação String do objeto CommissionEmployee
    @Override // indica que esse método substitui um método da superclsse
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
            "empregado comissionado", primeiroNome, ultimoNome,
            "numero social de segurnça", numSocialSeguro,
            "renda bruta", rendaBruta,
            "taxa de comissão", taxaComissao
        );
    }
}