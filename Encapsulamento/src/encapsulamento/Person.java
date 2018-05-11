/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamento;

/**
 *
 * @author danilo
 */
public class Person {
    /**
     * Atributos
     */
    private String name ;
    private String email;
    private Integer idade;
    private String phone;
    protected Boolean status;
    
    
    /**
     * Métodos de acesso 
     */
    public void setName(String name){
        this.name = name;
    }
    public void setEmail (String email){
        this.email = email;
    }
    public void setIdade (Integer idade){
        this.idade = idade;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }    
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhone(){
        return this.phone;
    }
    public Integer getIdade(){
        return this.idade;
    }
    
    
}
