/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

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
        //Maneira mais detalhada, mais trabalhosa
        //Index i = new Index();
        Index.retorno();    
        //Maneira mais simples, maneira mais utilizada
        retorno();
        //Final
        int idade = 12;
        double pi = 3.14;
        boolean verdade = idade >= 12;
        char letra = 'd';
        String nome = "Danilo Martins da Silva";
        System.out.println("Opa o Java está funcionando aqui!!!!!");
        System.out.println("Minha idade: "+ (idade));
        System.out.println("O Valor do PI X 2=  "+ (pi*2) );
        System.out.println("O valor da variável verdadeiro = "+verdade);
        System.out.println("O valor da variável letra é:  "+letra);
        System.out.println("O valor da variável nome é:  "+nome);        

    }
     static public void retorno(){
        String cidade = "Rio Verde";
        String nome = "Douglas";
        String rua = "Rua do diogo";
        String bairro = "Vila Olinda - Faixa de Gaza";
        String estado = "Goiás";
        String pais = "Brasil";
        System.out.println("Os dados do Douglas:"
                + " Cidade:"+cidade+
                " nome: "+nome+ "\nRua:"+ rua);
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         System.out.println("Valor "+ a);
         
        
    }

}
