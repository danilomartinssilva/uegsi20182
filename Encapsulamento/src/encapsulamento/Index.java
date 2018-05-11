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
public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juridica j = new Juridica();
        Endereco e = new Endereco();
        Endereco1 e1 = new Endereco1();
        j.setName("Danilo Martins ME");
        j.setEmail("email@email.com.br");
        j.setIdade(21);
        j.setCNPJ("999.999.999/0001-14");
        j.setPhone("6499999999");
        e.setBairro("Centro");
        e.setCidade("Santa Helena ");
        e.setComplemento("Proximo a...");
        e.setRua("Sebastiao F. de Souza");
        
        System.out.println("Nome:" +j.getName());
        System.out.println("Email:"+j.getEmail());
        System.out.println("Idade:"+j.getIdade());
        System.out.println("Bairro:"+e.getBairro());
        System.out.println("Cidade:"+e.getCidade());
        
        Endereco e_1 = new Endereco1();
        
                
    }
    
}
