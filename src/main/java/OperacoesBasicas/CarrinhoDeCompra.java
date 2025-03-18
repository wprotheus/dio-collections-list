package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    private List<Item> itemList;

    public CarrinhoDeCompra() {
        this.itemList = new ArrayList<>();
    }

    public static void main(String[] args) {
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
        carrinho.adicionarItem("cafe", 30.00, 5);
        carrinho.adicionarItem("arroz", 35.00, 1);
        carrinho.adicionarItem("arroz", 35.00, 1);
        carrinho.adicionarItem("arroz", 35.00, 1);
        carrinho.adicionarItem("laranja", 10.00, 15);
        carrinho.adicionarItem("abacate", 10.00, 3);
        carrinho.adicionarItem("açúcar", 20.00, 1);
        carrinho.exibirItens();
        System.out.println("O valor total do carrinho é: R$ " + carrinho.calcularValorTotal());
        carrinho.removerItem("arroz");
        carrinho.exibirItens();
        System.out.println("O valor total do carrinho é: R$ " + carrinho.calcularValorTotal());
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        for (Item item : itemList) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                item.setQuantidade(item.getQuantidade() + quantidade);
                return;
            }
        }
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : itemList)
            if (i.getNome().equalsIgnoreCase(nome))
                itensParaRemover.add(i);
        if (!itensParaRemover.isEmpty())
            itemList.removeAll(itensParaRemover);
        else
            System.out.println("Item '" + nome + "' não encontrado no carrinho!");
    }

    public double calcularValorTotal() {
        if (itemList.isEmpty()) {
            System.out.println("O carrinho está vazio! Valor total = R$ 0.00");
            return 0.0;
        }
        double total = 0;
        for (Item item : itemList)
            total += item.getPreco() * item.getQuantidade();
        return total;
    }

    public void exibirItens() {
        for (Item item : itemList)
            System.out.println(item.toString());
    }
}
