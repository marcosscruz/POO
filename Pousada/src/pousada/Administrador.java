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
public class Administrador extends Funcionario {
    private GerenciadorUsuarios gerenciadorUsuarios;
    
    public void setGerenciadorUsuarios(GerenciadorUsuarios gerenciadorUsuarios){
        this.gerenciadorUsuarios = gerenciadorUsuarios;
    }
    

    public Administrador(String nome, String senha) {
        super(nome, senha);
    }
    
}
