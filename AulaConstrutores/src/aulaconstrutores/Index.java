/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaconstrutores;

/**
 *
 * @author danilo
 */
public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Aluno al = new Aluno("Danilo",
                "email@email.com.br","SI","9x9090",10);
       
        System.out.println(al.getAllData());       
        
    }
    
    
}
