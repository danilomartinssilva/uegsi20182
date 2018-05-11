/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novoteste;

/**
 *
 * @author danilo
 */
public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("TTESTE"); 
       Livro l = new Livro();
      Author a = new Author();
      a.setEmail("teste");
      a.setName("TESTE");
      l.setAuthor(a);
        System.out.println(l.getAuthor().getEmail());
       
       
    }
    
}
