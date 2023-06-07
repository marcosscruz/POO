/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pousada;

/**
 *
 * @author Filipe
 */
public class Funcionario extends Usuario {
    private GerenciadorClientes gerenciadorClientes;   
    
        
    public void setGerenciadorClientes(GerenciadorClientes gerenciadorClientes){
        this.gerenciadorClientes = gerenciadorClientes;
    }
    
    public void cadastrarNovoCliente(String cpf, String nome, String endereco, String telefone, String email) {
        Cliente novoCliente = new Cliente(cpf, nome, endereco, telefone, email);
        gerenciadorClientes.adicionarCliente(novoCliente);
        System.out.println("Novo cliente cadastrado com sucesso!");
    }

    public Funcionario(String nome, String senha) {
        super(nome, senha);
    }

}
