/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana10quest6;

import java.util.*;
/**
 *
 * @author marcos
 */
public class Produto implements Comparable<Produto> {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public int compareTo(Produto outroProduto) {
        // comparação com base no preço
        if (this.preco < outroProduto.getPreco()) {
            return -1;
        } else if (this.preco > outroProduto.getPreco()) {
            return 1;
        } else {
            return 0;
        }
    }
    
    @Override
    public String toString(){
        return "Produto [Nome: " + nome + "\t Preço: " + preco + "]";
    }
}
