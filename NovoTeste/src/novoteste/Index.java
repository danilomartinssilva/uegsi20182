/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novoteste;

import java.util.ArrayList;

/**
 *
 * @author danilo
 */
public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Livro l = new Livro();
       //l.setAuthor(author);
        ArrayList<Livro> lista = new ArrayList();
        Livro l = new Livro();
        Livro l1 = new Livro();
        l.setNome("Danilo");
        l1.setNome("Teste");
        lista.add(l);
        lista.add(l1);
        for(int i=0;i<lista.size();i++){
            System.out.println("Resultado"+lista.get(i).getNome());
        }
        
        
        
        
        
        
       
    }
    
}
