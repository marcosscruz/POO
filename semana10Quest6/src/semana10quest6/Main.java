/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana10quest6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author marce
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("TV", 3500.00));
        produtos.add(new Produto("Notebook", 2500.00));
        produtos.add(new Produto("Smartphone", 2000.00));

        // classificar os produtos em ordem crescente de preços 
        Collections.sort(produtos);

        // imprimir a lista de produtos ordenadas 
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
        
        System.out.println("================================================");
        
        // classificar os produtos em ordem de preço usando um Comparator
        Comparator<Produto> comparador = new PrecoComparado();
        Collections.sort(produtos, comparador);
        
        // imprimir a lista de produtos ordenadas 
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

}
