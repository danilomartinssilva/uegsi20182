/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04042018;

/**
 *
 * @author Danilo
 */
public class Bundle {
    String nome;//ATRIBUTO 
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome = "   Danilo";
            nome = nome.concat(" Martins da Silva   ");//CONCATENA
            System.out.println(nome.endsWith("Sia"));//Verifica se existe o valor procurado no final da string
            System.out.println(nome.startsWith("Danilo"));//Verifica se existe o valor procurado no inicio da string
            nome = nome.trim();
            System.out.println(nome);
            
            
            
        
        
        
        
        
    }
    public void cadastrar(){
          
        
    }
    
    
    
}
