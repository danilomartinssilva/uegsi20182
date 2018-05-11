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
public class Index {

        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livro livro = new Livro();//Criada uma instâncida da classe Livro        
        livro.cadastro();
        livro.listar();
        livro.descricao = "Leandro";
        livro.listar();
        
        
    }
    
}
