/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.java.api.pkg2023;

/**
 *
 * @author alex
 */
public class Tarefa {
    private String descricao;
    
    

    public String getDescricao() {
        return descricao;
    }
    
   public Tarefa(String descricao){
       this.descricao = descricao;
   }

    @Override
    public String toString() {
        return descricao;
    }
   
    
    
}
