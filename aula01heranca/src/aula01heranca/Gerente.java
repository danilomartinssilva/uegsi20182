/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01heranca;

/**
 *
 * @author Danilo
 */
public class Gerente extends Funcionario {
    public int qtdfuncionariosfiscalizados;
    
    public void setQtdFuncionariosFiscalizados(int x){
        this.qtdfuncionariosfiscalizados = x;
    }
    public int getQtdFuncionariosFiscalizados(){
        return this.qtdfuncionariosfiscalizados;
    }
    
    
}
