/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamento;

/**
 *
 * @author danilo
 */
public class Endereco {
    private String rua, cidade, 
            bairro,complemento, numero;
    
    public void setRua(String rua){
        this.rua = rua;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return this.rua;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return  this.cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return  this.bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return  this.complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return  this.numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
        Person  p = new Person();       
    }
    
    
    
   
   
    
}
