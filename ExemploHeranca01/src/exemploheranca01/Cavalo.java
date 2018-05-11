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
public class Cavalo extends Animal {
    public String raca,corPelagem;
    private Double mediaAlturaCavalo = 2.0;
    
    private void setMediaAlturaCavalo(Double medida){
            this.mediaAlturaCavalo = medida;
    }
    
    public Double getMediaAlturaCavalo(){
        return this.mediaAlturaCavalo;
    }
    
    public void setRaca (String raca){
        this.raca = raca;
    }
    public String getRaca(){
        return this.raca;
    }
    public void setCorPelagem(String corPelagem){
        this.corPelagem = corPelagem;            
    }
    public String getCorPelagem(){
        return this.corPelagem;
    }
    private String pesoAdequadoCavalo(){
        if((this.pesoMedio/this.getMediaAlturaCavalo()) > 50 && (this.pesoMedio/this.getMediaAlturaCavalo()) <=100){
            return "O peso  do cavalo está normal";
        }
        else{
            return "O peso do cavalo está inadequado ";
        }
    }
    public String getpesoAdequadoCavalo(){
          return this.pesoAdequadoCavalo();
    }
    
    
    
    
    
   
    
    
}
