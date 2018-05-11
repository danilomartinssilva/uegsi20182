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
public class Juridica extends Person {
   private String cnpj ;
   
   public void setCNPJ(String cnpj){
       this.cnpj = cnpj;
   }
   public String getCNPJ(){
       return this.cnpj;
   } 
}
