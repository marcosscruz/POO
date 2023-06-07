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
class Cliente {
    private int id;
    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    
    public Cliente (String cpf, String nome, String endereco, String telefone, String email) { // construtor
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
    
    //getters e setters
    
    public int getId() {
        return id;
    }
    
    public void setId(int Id) {
        this.id = id;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String Cpf) {
        this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String Nome) {
        this.nome = nome;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String Endereco) {
        this.endereco = endereco;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String Telefone) {
        this.telefone = telefone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String Email) {
        this.email = email;
    }
    
}
