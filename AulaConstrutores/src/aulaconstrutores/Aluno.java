/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaconstrutores;

/**
 *
 * @author danilo
 */
public class Aluno {
    
    private String nome,email,matricula,curso;
    private Integer idade;
    
    /**Tem o mesmo nome da classe**/
   /*
    public void setNome(String nome){
        this.nome = nome;
        
    }
    public String getNome(){
        return this.nome;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    public String getCurso(){
        return this.curso;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public void setIdade(Integer idade){
        this.idade = idade;
    }
    public Integer getIdade(){
        return this.idade;
    }*/
    /***
     * 
     * @param nome
     * @param email
     * @param curso
     * @param matricula
     * @param idade 
     */
     public Aluno(String nome,String email,String curso,
             String matricula, Integer idade ){
        //System.out.println("A classe foi iniciada!");
        /*this.nome = "";
        this.email = "";
        this.curso = "";
        this.idade = 10;
        this.matricula="xxxxxx";*/
        this.nome = nome;
        this.email = email;
        this.curso = curso;
        this.matricula = matricula;
        this.idade = idade;
    }
    public String getAllData(){
        return ("Nome:"+this.nome+
                "\nEmail:"+this.email+
                "\nCurso:"+this.curso+
                "\nMatricula"+this.matricula+
                "\nIdade:"+this.idade);
        
    }
    
    
}
