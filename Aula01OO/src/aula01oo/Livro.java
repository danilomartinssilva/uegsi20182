/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01oo;

/**
 *
 * @author Danilo
 */
public class Livro {
    String titulo ;
    String descricao;
    String ISBN;
    Double valor;
    
    public void cadastro(){        
        
        this.titulo = "Orientação a Objetos";
        this.descricao = "Este livro ensina orientação a objetos";
        this.valor = 30.99;
        this.ISBN = "232432432D45";
        
    }
    public void listar(){
         System.out.println("Titulo: "+ this.titulo);
         System.out.println("Descricao: "+ this.descricao);  
         System.out.println("ISBN:"+ this.ISBN);
         System.out.println("Valor: R$"+this.valor);
        
    }
    public void excluir(){
        
        
          this.titulo = "";
          this.descricao = "";
          this.valor=0.0;
          this.ISBN = "";
          
                 
          
    }
    public void alterar(){
        
        
    }

    
    
}
