package aula01heranca;


import aula01heranca.Gerente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danilo
 */
public class Diretoria extends Gerente {
        public String nomeDiretoria;
        public void setnomeDiretoria( String nomeDiretoria){
            this.nomeDiretoria = nomeDiretoria;
        }
        public String getNomeDiretoria(){
            return this.nomeDiretoria;
        }
}
