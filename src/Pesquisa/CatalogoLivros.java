package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livros> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livros(titulo, autor, anoPublicacao));
    }
    public List<Livros> pesquisarPorAutor(String autor) {
        List<Livros> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for(Livros l: livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livros> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livros> livrosPorIntervalosAno = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livros l: livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervalosAno.add(l);
                }
            }
        }
        return livrosPorIntervalosAno;
    }

    public Livros pesquisaPorTitulo(String titulo){
        Livros livroPorTitulo = null;
        if (livroList.isEmpty()){
            for (Livros l: livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2022);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2004);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2001);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2020);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 2021);

    }
}
