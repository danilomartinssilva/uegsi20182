/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01heranca;

/**
 *
 * @author Danilo
 */
public class Funcionario {
    public String nome;
    public String email;
    public String telefone;
    public String endereco;
    public String cpf;
    
    //INSERCAO DE VALORES VINDOS DOS PARAMETROS NOS ATRIBUTOS
    public void setNome(String nome){
       this.nome = nome;
    }
    public void setEmail(String email){       
        
        this.email = email;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
     public void setEndereco(String endereco){
        this.endereco = endereco;
    }
     public void setCpf(String cpf){
        this.cpf = cpf;
    }
     //RETORNO DOS VALORES DOS ATRIBUTOS
    public String getNome(){
        return this.nome;
    }
    public String getEmail(){
        return this.email;        
    }
    public String getTelefone(){
        return this.telefone;        
    }
    public String getEndereco(){
        return this.endereco;
    }
    public String getCpf(){
        return this.cpf;
    }
   
    
   
}
