/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploheranca01;

/**
 *
 * @author Danilo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cavalo c = new Cavalo();
        c.nome = "Corsel";
        c.setNome("Cavalo sem nome");
        c.setNome("Cavalo Marinho");
        c.setPesoMedio(90.0);
        c.setRaca("Manga Larga - Marchador");
        c.setCorPelagem("Marrom");
      //  c.setMediaAlturaCavalo(26.0);
        
        System.out.println("Nome:" + c.getNome());
        System.out.println("Peso:" + c.getPesoMedio());
        System.out.println("Raça:" +c.getRaca());
        System.out.println("Cor da pelagem" + c.getCorPelagem());
        System.out.println( c.getpesoAdequadoCavalo());
        System.out.println("Altura: " + c.getMediaAlturaCavalo());
    }
    
}
