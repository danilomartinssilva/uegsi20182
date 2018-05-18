/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios1705;

/**
 *
 * @author danilo
 */
public class Animal {
    /**
     * Atributos
     */   
    private String habitatNatural;
    private String regiao;
    private Double medidaAltura;
    private Double pesoMedio;    
   
    /***
     * Construtor
     */
    
    public  Animal()
    {
           this.habitatNatural = "";
           this.regiao = "";
           this.medidaAltura = 0.0;
           this.pesoMedio = 0.0;
           System.out.println("A classe foi instanciada");
    }
    
   
    /**
     * @return the habitatNatural
     */
    public String getHabitatNatural() {
        return habitatNatural;
    }

    /**
     * @return the regiao
     */
    public String getRegiao() {
        return this.regiao;
    }

    /**
     * @param regiao the regiao to set
     */
    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    /**
     * @return the medidaAltura
     */
    public Double getMedidaAltura() {
        return medidaAltura;
    }

    /**
     * @param medidaAltura the medidaAltura to set
     */
    public void setMedidaAltura(Double medidaAltura) {
        this.medidaAltura = medidaAltura;
    }

    /**
     * @return the pesoMedio
     */
    public Double getPesoMedio() {
        return pesoMedio;
    }

    /**
     * @param pesoMedio the pesoMedio to set
     */
    public void setPesoMedio(Double pesoMedio) {
        this.pesoMedio = pesoMedio;
    }
    
    
    
    
    
        
        
}
