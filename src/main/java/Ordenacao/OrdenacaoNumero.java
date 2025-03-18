package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumero {
    private List<Numero> numeroList;

    public OrdenacaoNumero() {
        numeroList = new ArrayList<>();
    }


    public static void main(String[] args) {
        OrdenacaoNumero ordenacao = new OrdenacaoNumero();

        ordenacao.adicionarNumero(new Numero(10));
        ordenacao.adicionarNumero(new Numero(25));
        ordenacao.adicionarNumero(new Numero(7));
        ordenacao.adicionarNumero(new Numero(42));
        ordenacao.adicionarNumero(new Numero(18));
        ordenacao.adicionarNumero(new Numero(7));
        ordenacao.adicionarNumero(new Numero(30));
        ordenacao.adicionarNumero(new Numero(25));
        ordenacao.adicionarNumero(new Numero(5));
        ordenacao.adicionarNumero(new Numero(50));
        ordenacao.adicionarNumero(new Numero(12));
        ordenacao.adicionarNumero(new Numero(33));
        ordenacao.adicionarNumero(new Numero(42));

        System.out.println("*** Lista inicial ***");
        if (!ordenacao.numeroList.isEmpty())
            ordenacao.numeroList.forEach(System.out::print);
        else
            System.out.println("A lista está vazia.");

        System.out.println("\n*** Lista ascendente ***");
        if (!ordenacao.numeroList.isEmpty())
            ordenacao.ordenarAscendente().forEach(System.out::print);
        else
            System.out.println("A lista está vazia.");

        System.out.println("\n*** Lista descendente ***");
        if (!ordenacao.numeroList.isEmpty())
            ordenacao.ordenarDescendente().forEach(System.out::print);
        else
            System.out.println("A lista está vazia.");
    }

    void adicionarNumero(Numero numero) {
        numeroList.add(numero);
    }

    List<Numero> ordenarAscendente() {
        List<Numero> resultado = new ArrayList<>(this.numeroList);
        if (!resultado.isEmpty()) {
            Collections.sort(resultado);
            return resultado;
        }
        return null;
    }

    List<Numero> ordenarDescendente() {
        List<Numero> resultado = new ArrayList<>(this.numeroList);
        if (!resultado.isEmpty()) {
            Collections.sort(resultado, Collections.reverseOrder());
            return resultado;
        }
        return null;
    }
}
