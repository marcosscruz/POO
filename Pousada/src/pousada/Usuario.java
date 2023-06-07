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
public class Usuario { // atributos da classe
    private String nome;
    private String senha;
    private int id;
    
    private int proximoId = 1; // variável estática para gerar novos IDs
    
    
    public Usuario (String nome, String senha) { //construtor
        this.nome = nome;
        this.senha = senha;
        this.id = proximoId; // define o ID do usuário com o valor atual de proximoId
        proximoId++; // incrementa o valor de proximoId para o próximo usuário
    }
    
    // getters e setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
                
}
