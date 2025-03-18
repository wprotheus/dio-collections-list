package OperacoesBasicas;

public class Tarefa {
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tarefa{");
        sb.append(descricao).append('\'').append('}');
        return sb.toString();
    }
}
