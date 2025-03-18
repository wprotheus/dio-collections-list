package PesquisaEmList;

import java.util.ArrayList;
import java.util.List;

public class SomaNumero {
    private List<Numero> somaNumeroList;

    public SomaNumero() {
        this.somaNumeroList = new ArrayList<>();
    }

    public static void main(String[] args) {
        SomaNumero somaNumero = new SomaNumero();
        somaNumero.adicionarNumero(1);
        somaNumero.adicionarNumero(3);
        somaNumero.adicionarNumero(5);
        somaNumero.adicionarNumero(7);
        somaNumero.adicionarNumero(9);
        somaNumero.adicionarNumero(11);
        somaNumero.adicionarNumero(13);
        somaNumero.adicionarNumero(15);
        somaNumero.adicionarNumero(17);

        System.out.println("*** Soma dos números ***");
        if (somaNumero.calcularSoma() > 0)
            System.out.println("A soma: " + somaNumero.calcularSoma());
        else
            System.out.println("A lista está vazia.");
        System.out.println("*** Maior número ***");
        if (somaNumero.encontrarMaiorNumero() != Integer.MIN_VALUE)
            System.out.println("O maior: " + somaNumero.encontrarMaiorNumero());
        else
            System.out.println("A lista está vazia.");
        System.out.println("*** Maior número ***");
        if (somaNumero.encontrarMenorNumero() != Integer.MAX_VALUE)
            System.out.println("O menor: " + somaNumero.encontrarMenorNumero());
        else
            System.out.println("A lista está vazia.");
        System.out.println("*** Números na lista ***");
        somaNumero.exibirNumeros();
    }

    void adicionarNumero(int numero) {
        this.somaNumeroList.add(new Numero(numero));
    }

    int calcularSoma() {
        int total = 0;
        for (Numero numero : this.somaNumeroList)
            total += numero.getNumero();
        return total;
    }

    int encontrarMaiorNumero() {
        int maior = Integer.MIN_VALUE;
        if (!this.somaNumeroList.isEmpty())
            for (Numero numero : this.somaNumeroList)
                if (numero.getNumero() > maior)
                    maior = numero.getNumero();
        return maior;
    }

    int encontrarMenorNumero() {
        int menor = Integer.MAX_VALUE;
        if (!this.somaNumeroList.isEmpty())
            for (Numero numero : this.somaNumeroList)
                if (numero.getNumero() < menor)
                    menor = numero.getNumero();
        return menor;
    }

    void exibirNumeros() {
        if (!this.somaNumeroList.isEmpty())
            System.out.println(somaNumeroList);
        else
            System.out.println("Lista está vazia!");
    }


}
