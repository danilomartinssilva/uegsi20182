/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


/**
 *
 * @author danilo
 */
public class Produto {
    private Categoria categoria;
    private String nome;
    private String descricao;
    private Double preco;
    
    public void setNome(String nome){
        this.nome = nome;        
    }
    public String getNome(){
        return this.nome;
    }    
    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }
    public Categoria getCategoria(){
        return this.categoria;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public void setPreco(Double preco){
        this.preco = preco;
    }
    public Double getPreco(){
        return this.preco;
    }
    
    public String toString(){
        return "Nome: "+this.getNome()+
                " Categoria: "+this.getCategoria().getNome()+
                " Nome: "+ this.getNome()+
                " Descricao: "+ this.getDescricao()+
                " Preço: R$"+ this.getPreco();
    }
    
    
    
}
