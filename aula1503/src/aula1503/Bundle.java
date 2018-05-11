/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1503;

import java.util.Scanner;

/**
 *
 * @author Danilo
 */
public class Bundle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Bundle b = new Bundle();
        b.eImparOuPar();*/
        eImparOuPar();      
    }
    
   static  public void eImparOuPar(){
        System.out.println("Digite um valor:");
        Scanner xpto = new Scanner(System.in);//Usuário digitar um valor
        int valor = xpto.nextInt();//Valor armazenado na variável valor
        if(valor%2==0){
            System.out.println("É par");
        }
        else{
            System.out.println("É impar");
        }
        if(valor>0){
            System.out.println("É positivo");
        }
        else{
            System.out.println("É negativo");
            
        }
                 
    }
   static public void calculaSomaInteiro(){
       ///DESENVOLVOL
   }
   
   static public void somadoscubos(){
       ///DESENVOLVOL
   }
   
}
