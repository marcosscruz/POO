/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana7quest3;

/**
 *
 * @author marcos
 */
public class CommissionEmployeeTest {

    public static void main(String[] args){
        
        // instancia o objeto CommissionEmployee
        CommissionEmployee employee0 = new CommissionEmployee("Marcos", "Cruz", 
                "123-4567-890", 10000, .06);
        // obtem os dados do empregado comissionado
        System.out.println("Informações do funcionário obtidas pelos métodos get: ");
        System.out.printf("%n%s %s%n", "Primeiro nome é ", employee0.getPrimeiroNome());
        System.out.printf("%s %s%n", "Número social de segurança é ", employee0.getNumSocialSeguro());
        System.out.printf("%s %.2f%n", "Renda bruta é ", employee0.getRendaBruta());
        System.out.printf("%s %.2f%n", "Taxa de comissão é ", employee0.getTaxaComissao());
        
        employee0.setRendaBruta(5000);
        employee0.setTaxaComissao(.1);
        
        System.out.printf("%n%s:%n%n%s%n", "Informações atualizadas do funcionário obtidas por toString", employee0);
        
        System.out.println("==================================================================");
        
        // instacia o objeto BasePlusComissionEmployee
        BasePlusCommissioEmployee employee1 = new BasePlusCommissioEmployee("Marcos", "Cruz", "123-4567-890",
                10000, .06, 400);
        // obtem os dados do empregado comissionado com salário base
        System.out.println("Informações do funcionário obtidas pelos métodos get:");
        System.out.printf("%n%s %s%n", "Primeiro nome é ", employee1.getPrimeiroNome());
        System.out.printf("%s %s%n", "Ultimo nome é ", employee1.getUltimoNome());
        System.out.printf("%s %s%n", "Número de Segurança Social é ", employee1.getNumSocialSeguro());
        System.out.printf("%s %.2f%n", "Renda bruta é ", employee1.getRendaBruta());
        System.out.printf("%s %.2f%n", "Taxa de comissão é ", employee1.getTaxaComissao());
        System.out.printf("%s %.2f%n", "Salário-base é ", employee1.getSalarioBase());
        
        employee1.setRendaBruta(5000);
        
        System.out.printf("%n%s:%n%n%s%n", "Informações atualizadas do funcionário obtidas por toString", employee1);
        
        System.out.println("==================================================================");
        
        // instacia o objeto BasePlusComissionEmployee herdando de FuncionarioComissionado
        BaPlCoEm employee2 = new BaPlCoEm("Cruz", "Marcos", "098-7654-321",
                15000, .05, 450);
        // obtem os dados do empregado comissionado com salário base
        System.out.println("Informações do funcionário obtidas pelos métodos get:");
        System.out.printf("%n%s %s%n", "Primeiro nome é ", employee2.getPrimeiroNome());
        System.out.printf("%s %s%n", "Ultimo nome é ", employee2.getUltimoNome());
        System.out.printf("%s %s%n", "Número de Segurança Social é ", employee2.getNumSocialSeguro());
        System.out.printf("%s %.2f%n", "Renda bruta é ", employee2.getRendaBruta());
        System.out.printf("%s %.2f%n", "Taxa de comissão é ", employee2.getTaxaComissao());
        System.out.printf("%s %.2f%n", "Salário-base é ", employee2.getSalarioBase());
        
        employee2.setRendaBruta(5500);
        
        System.out.printf("%n%s:%n%n%s%n", "Informações atualizadas do funcionário obtidas por toString", employee2);
        
        // Polimorfismo Teste 
        // Atribuindo referências de superclasses e subclasses a variáveis de superclasses e de subclasses
        
        // atribui um referência de superclasse à variável se superclasse
        FuncionarioComissionado employee3 = new FuncionarioComissionado("Marcos", "Santos", "707-0707-070", 10000, .06);
        
        // atribui uma referência de subclasse à variável de subclasse
        BaPlCoEm employee4 = new BaPlCoEm("Santos", "Marcos", "242-4242-424", 5000, .04, 300);
        
        // invoca toString no objeto de superclasse utilizando a variável de superclasse
        System.out.printf(
            "%s %s:%n%n%s%n%n", 
              "Chame o toString de CommissionEmployee com referência de superclasse",
              "para objeto superclasse", employee3.toString()
        );
        
        // invoca toString no objeto de subclasse utilizando a variável de subclasse
        System.out.printf(
            "%s %s:%n%n%s%n%n",
            "Chama o toString de BasePlusCommissionEmployee com a subclasse",
            "referência ao objeto da subclasse", employee4.toString()
        );
        
        // invoca toString no objeto de subclasse utilizando a variável de superclasse
        BaPlCoEm employee5 = (BaPlCoEm) employee4; // casting explicíto
        System.out.printf(
            "%s %s:%n%n%s%n",
            "Chama o toString de BasePlusCommissionEmployee com a superclasse",
            "renferência ao objeto de subclasse", employee5
        );
    }
}