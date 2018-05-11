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
public class Animal {
    public String nome;
    public Double pesoMedio;
    public String reproducao;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setPesoMedio(Double peso){
        this.pesoMedio = peso;
    }
    public Double getPesoMedio(){
        return this.pesoMedio;
    }
    public void setReproducao(String reproducao){
        this.reproducao = reproducao;
    }
    public String getReproducao(){
        return this.reproducao;
    }
    
    
}
