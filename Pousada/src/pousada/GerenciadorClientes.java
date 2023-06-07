/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pousada;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Filipe
 */
public class GerenciadorClientes {
    private List<Cliente> clientes; // transforma a classe cliente em uma lista chamada clientes
    
    public GerenciadorClientes() {
        clientes = new ArrayList<>(); // construtor que transforma a lista clientes em um array
    }
    
    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    public void removerCliente(Cliente cliente){
        clientes.remove(cliente);
    }
        
    //getters    
    public List<Cliente> getClientes() {
        return clientes;
    }

}
