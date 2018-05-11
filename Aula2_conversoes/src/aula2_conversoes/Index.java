/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2_conversoes;

import java.util.Scanner;



/**
 *
 * @author Danilo
 */
public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //addClient();
      //outrosInteiros();
      //outrosDecimais();
      tipobooleano();
              
      
   
    }
  static public void addClient(){
        Scanner sc = new Scanner(System.in); // Scanner, captura o que foi digitado
        System.out.println("Digite o seu nome: ");//Pede ao usuário para digitar o nome
        String name = sc.next();//Espera o usuário digitar
        System.out.println("Nome: " + name); //Retorna o que foi digitado       
        System.out.println("Digite o seu email: ");
        String email = sc.next(); //Espera o usuário digitar 
        System.out.println("O seu email é: "+email);//Retorna o que foi digitado
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();//Scanner, captura valor numérico
        System.out.println("Sua idade é: "+idade);
        System.out.println("Digite sua medida:");
        double medida = sc.nextDouble();        
        System.out.println("O valor da sua medida é: "+medida );        
        
        //Caso especial
        System.out.println("Digite o seu peso: ");
        String meupeso = sc.next();
        System.out.println("O valor do peso: "+Double.parseDouble(meupeso) + " KG");
        
    }
  
     static public void outrosInteiros(){
        System.out.println("O Tipo byte é um inteiro que vai de -127 a 128");
        System.out.println("O Tipo short é um inteiro que vai de -32768 a 32767");
        System.out.println("O tipo int é um inteiro "
                + "que vai de -2.147.486.648 a 2.147.486.647");
        System.out.println("O tipo long é umn inteiro "
                + "comporta em armazenamento na memória 8 bytes,"
                + " equivale a -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 ");
        /**
         * TESTE COM INTEIROS
         */
        byte exemplo_byte = 127;
        short exemplo_short = 32767;
         System.out.println("Exemplo_Byte: "+ exemplo_byte);
         System.out.println("Exemplo_SHORT" + exemplo_short);
        
    }
     static public void outrosDecimais(){
         System.out.println("O valor de um double vai de -1,7976E  +308 a 1,7976E +308"
                 + "oferece um precisão de  15 digitos");
         System.out.println("O valor de um float vai de -3,4028E  +38 a +3,4028E  +38"
                 + "oferece um precisão de  7 digitos");
     }
     static public void tipobooleano(){
           /**
            * Permite que apenas dois possíveis valores, 
            * e somente sejam guardados
            * VERDADEIRO E FALSEO, TRUE E FALSE
            */
           boolean teste = 2 == '2';
           System.out.println("O resultado é" + teste);
           
     }
    
}
