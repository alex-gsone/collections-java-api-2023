/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.java.api.pkg2023;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alex
 */
public class ListaTarefa {

    private List<Tarefa> tarefalist;

    public ListaTarefa() {
        this.tarefalist = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefalist.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for (Tarefa t : tarefalist) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefalist.removeAll(tarefasParaRemover);
    }

    public int ObterNumeroTotalTarefas() {
        return tarefalist.size();
    }

    public void ObterDescricoesTarefas() {
        System.out.println(tarefalist);
    }
    public static void main(String[] args) {
        ListaTarefa listatarefa = new ListaTarefa();
        System.out.println("O número total de tarefas é: "+listatarefa.ObterNumeroTotalTarefas());
       
        listatarefa.adicionarTarefa("Tarefa 1");
        listatarefa.adicionarTarefa("Tarefa 1");
        listatarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de tarefas é: "+listatarefa.ObterNumeroTotalTarefas());
        
        listatarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de tarefas é: "+listatarefa.ObterNumeroTotalTarefas());
        
        listatarefa.ObterDescricoesTarefas();
    }

}
