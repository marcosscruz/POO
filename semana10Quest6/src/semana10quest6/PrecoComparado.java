/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana10quest6;

import java.util.Comparator;

/**
 *
 * @author marcos
 */
public class PrecoComparado implements Comparator<Produto> {
    @Override
    public int compare(Produto produto1, Produto produto2){
        // comparação de preços
        if(produto1.getPreco() < produto2.getPreco()){
            return -1;
        } else if (produto1.getPreco() > produto2.getPreco()){
            return 1;
        } else {
            return 0;
        }
    }
}
