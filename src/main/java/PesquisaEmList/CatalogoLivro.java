package List.PesquisaEmList;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {
    private List<Livro> livrosList;

    public CatalogoLivro() {
        this.livrosList = new ArrayList<>();
    }

    public static void main(String[] args) {
        CatalogoLivro catalogoLivro = getCatalogoLivro();

        System.out.println("Pesquisa por autor");
        String autor = "Miguel de Cervantes";
        if (catalogoLivro.pesquisarPorAutor(autor) != null)
            System.out.println(catalogoLivro.pesquisarPorAutor(autor));
        else
            System.out.println("Não há livro(s) publicado(s) por esse autor.");

        System.out.println("-------------------------------------\n" +
                "Pesquisa por intervalo de ano");
        int anoInicial = 1940;
        int anoFinal = 1960;
        if (catalogoLivro.pesquisarPorIntervaloAnos(anoInicial, anoFinal) != null)
            System.out.println(catalogoLivro.pesquisarPorIntervaloAnos(anoInicial, anoFinal));
        else
            System.out.println("Não há livro(s) publicado(s) no período pesquisado.");

        System.out.println("-------------------------------------\n" +
                "Pesquisa por título");
        String titulo = "1984";
        if (catalogoLivro.pesquisarPorTitulo(titulo) != null)
            System.out.println(catalogoLivro.pesquisarPorTitulo(titulo));
        else
            System.out.println("Não há livros publicados com esse título.");
    }

    private static CatalogoLivro getCatalogoLivro() {
        CatalogoLivro catalogoLivro = new CatalogoLivro();
        catalogoLivro.adicionarLivro("20.000 Léguas Submarinas", "Júlio Verne", 1870);
        catalogoLivro.adicionarLivro("A Volta ao Mundo em 80 Dias", "Júlio Verne", 1873);
        catalogoLivro.adicionarLivro("Viagem ao Centro da Terra", "Júlio Verne", 1864);
        catalogoLivro.adicionarLivro("1984", "George Orwell", 1949);
        catalogoLivro.adicionarLivro("A Revolução dos Bichos", "George Orwell", 1945);
        catalogoLivro.adicionarLivro("O Hobbit", "J.R.R. Tolkien", 1937);
        catalogoLivro.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        catalogoLivro.adicionarLivro("Dom Quixote", "Miguel de Cervantes", 1605);
        return catalogoLivro;
    }

    void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        this.livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty())
            for (Livro livro : livrosList)
                if (livro.getAutor().equalsIgnoreCase(autor))
                    livrosPorAutor.add(livro);
        return livrosPorAutor;
    }

    List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livrosList.isEmpty())
            for (Livro livro : livrosList)
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal)
                    livrosPorIntervaloAnos.add(livro);
        return livrosPorIntervaloAnos;
    }

    Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!this.livrosList.isEmpty())
            for (Livro livro : livrosList)
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                    break;
                }
        return livroPorTitulo;
    }
}
