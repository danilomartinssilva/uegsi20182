/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaarrays;

/**
 *
 * @author Danilo
 */
public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        arrayInteiro();
    }
    static public void arrayInteiro(){
        System.out.println("Exemplo de Array do Tipo Inteiro em Java");
        //Exemplo de declaração de vetor inteiro
        int [] valores = new int[4];
        
        //String nome = new String("Danilo");
        ///String nome;
        //nome = "Danilo";
        
        
        
        valores[0] = 10;
        valores[1] = 12;
        valores[2] = 13;
        valores[3] = 500;
        System.out.println("Posição 2 do vetor: "+ valores[2]);
        System.out.println("Posição 2 do vetor: "+ valores[3]);
        //VALORES.LENGTH = 4
        for( int i=0;i<valores.length;i++){
            
            System.out.println("Posição: "+i+" Valor: "+valores[i]);
        }
        String [] frutas = new String[5];
        frutas[0] = "Laranja";
        frutas[1] = "Maçã";
        frutas[2] = "Morango";
        frutas[3] = "Uva";
        frutas[4] = "Cajá";
        
        for( int contador=0; contador<frutas.length;contador++){
            System.out.println("\nAs frutas são: " + frutas[contador]);
        }
        
        int [] arrayInteiro = {1,2,40,60,80,90,50,8090,440,15,90};
        System.out.println("Tamanho do arryaInteiro: "+arrayInteiro.length);
        
        String [] cidade = {"Santa Helena","Rio Verde", "Turvelândia", "Acreúna","Quirinópolis","Maurilândia"};
        int meucontador=0;
        while(meucontador < cidade.length){
            System.out.println("\nAs cidadades do vetor são:" + cidade[meucontador]);
            meucontador++;
        }
        
        for(String a: cidade){
            System.out.println("Meus valores do arrayInteiro: "+ a);
        }
        
        
        
        
        
        
                
        
        //System.out.println("Vetor valores: "+ valores);
        
    }
    
    
}
