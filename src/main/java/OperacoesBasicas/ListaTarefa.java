package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        tarefaList = new ArrayList<>();
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 4");
        listaTarefa.adicionarTarefa("Tarefa 4");
        listaTarefa.adicionarTarefa("Tarefa 5");
        listaTarefa.adicionarTarefa("Tarefa 5");
        listaTarefa.adicionarTarefa("Tarefa 6");
        listaTarefa.adicionarTarefa("Tarefa 6");
        System.out.println("O total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 13");
        System.out.println("O total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : tarefaList)
            if (tarefa.getDescricao().equals(descricao))
                tarefasParaRemover.add(tarefa);
        if (!tarefasParaRemover.isEmpty())
            tarefaList.removeAll(tarefasParaRemover);
        else
            System.out.println("Tarefa '" + descricao + "' não encontrada.");
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }
}