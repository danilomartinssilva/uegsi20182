/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2203listas;

import java.util.ArrayList;
import java.util.List;
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
        tipoLista();
    }
    static  public void tipoLista(){
        List a = new ArrayList();
        //Inserindo os elementos no ArrayList
        a.add("Danilo Martins da Silva");
        a.add("Santa Helena de Goiás");
        a.add("Estado");
        a.add("Brasil");
        a.add("Brasil");
        a.add(2);
        a.add("@@");
        //Retorna o elemento conforme o índice
        System.out.println(a.get(2));
        //Retorna todos os elementos da lista
        System.out.println(a);
        //Retorna o índice do valor passado
        System.out.println("Elemento: "+a.indexOf("Brasil"));
        //Retorna menos se o índice não existe.
        Scanner sc = new Scanner(System.in);
        String valorProcurado = sc.next();
        //lastIndexOf retorna o último elementos dos procurados
        System.out.println("Não está na lista "+a.lastIndexOf(valorProcurado) );
        //IndexOf retorna o primeiro elemento dos procurados
        //Tamanho da LISTA
        System.out.println("O tamanho da minha lista é" +a.size());
        
        //Exclusão de Item da Lista
        System.out.println("Você deseja remover o quê? ");
        String valorRemovido = sc.next();
        a.remove(1);
        System.out.println("Minha lista novamente:" +a);
        a.remove(a.size()-a.size());
        System.out.println(a);
        
        
    }
}
