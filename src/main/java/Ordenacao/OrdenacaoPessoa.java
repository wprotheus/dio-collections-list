package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = getOrdenacaoPessoa();

        System.out.println("*** Lista original ***");
        if (!ordenacaoPessoa.pessoaList.isEmpty())
            ordenacaoPessoa.pessoaList.forEach(System.out::print);
        else
            System.out.println("A lista está vazia.");

        System.out.println("\n\n*** Lista por idade ***");
        if (!ordenacaoPessoa.pessoaList.isEmpty())
            ordenacaoPessoa.ordenarPorIdade().forEach(System.out::print);
        else
            System.out.println("A lista está vazia.");

        System.out.println("\n\n*** Lista por altura ***");
        if (!ordenacaoPessoa.pessoaList.isEmpty())
            ordenacaoPessoa.ordenarPorAltura().forEach(System.out::print);
        else
            System.out.println("A lista está vazia.");
    }

    private static OrdenacaoPessoa getOrdenacaoPessoa() {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Ana", 25, 1.65);
        ordenacaoPessoa.adicionarPessoa("Bruno", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Carlos", 22, 1.75);
        ordenacaoPessoa.adicionarPessoa("Ana", 25, 1.65);
        ordenacaoPessoa.adicionarPessoa("Daniela", 28, 1.70);
        ordenacaoPessoa.adicionarPessoa("Eduardo", 35, 1.85);
        ordenacaoPessoa.adicionarPessoa("Fernanda", 30, 1.60);
        ordenacaoPessoa.adicionarPessoa("Bruno", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Gabriela", 22, 1.68);
        ordenacaoPessoa.adicionarPessoa("Henrique", 29, 1.78);
        return ordenacaoPessoa;
    }

    void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        if (!pessoasPorIdade.isEmpty()) {
            Collections.sort(pessoasPorIdade);
            return pessoasPorIdade;
        }
        return null;
    }

    List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        if (!pessoasPorAltura.isEmpty()) {
            Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
            return pessoasPorAltura;
        }
        return null;
    }
}
