/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pousada;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Filipe
 */
public class Sistema {
    private List<Usuario> usuarios;
    private GerenciadorUsuarios gerenciadorUsuarios;
    private GerenciadorClientes gerenciadorClientes;
    
    public Sistema(){
        usuarios = new ArrayList<>();
        gerenciadorClientes = new GerenciadorClientes();
    }
    
    
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionario.setGerenciadorClientes(gerenciadorClientes); // adiciona funcionário à lista de gerenciador de clientes
    }
    
    
    public void adicionarCliente(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o CPF do novo cliente: ");
        String cpf = scanner.nextLine();
        System.out.println("Digite o nome do novo cliente: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o endereço do novo cliente: ");
        String endereco = scanner.nextLine();
        System.out.println("Digite o telefone do novo cliente: ");
        String telefone = scanner.nextLine();
        System.out.println("Digite o email do novo cliente: ");
        String email = scanner.nextLine();
        
        Cliente novoCliente = new Cliente(cpf, nome, endereco, telefone, email);
        gerenciadorClientes.adicionarCliente(novoCliente);
        System.out.println("Novo cliente cadastrado com sucesso!");
    }
}