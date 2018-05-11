package encapsulamento;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danilo
 */
public class Fisica extends Person {
    private String CPF;
    public void setCPF( String cpf){
        this.CPF = cpf;
    }
    
    public String getCPF(){
        return this.CPF;
    }
    
}
