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
public class GerenciadorUsuarios {
    private ArrayList<Usuario> listaUsuarios;
    
    public GerenciadorUsuarios() {
        listaUsuarios = new ArrayList<>();
    }
    
    public Funcionario criarFuncionario (String nome, String senha) {
        Funcionario funcionario = new Funcionario(nome, senha);
        listaUsuarios.add(funcionario);
        return funcionario;
    }
    
    public Administrador criarAdministrador(String nome, String senha) {
        Administrador administrador = new Administrador(nome, senha);
        listaUsuarios.add(administrador);
        return administrador;
    }
    
    public List<Usuario> getUsuarios() {
        return listaUsuarios;
    }
}
