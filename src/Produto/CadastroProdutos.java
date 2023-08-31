package Produto;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
    return produtosPorNome;
    }
    public Set<Produto> exibirProdutoPorPreco(){
        Set<Produto> exibirPorPreco = new TreeSet<>(new ComparatorPorPreco());
            produtoSet.addAll(produtoSet);
        return exibirProdutoPorPreco();
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1L, "Produto 0", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 1", 13d, 3);
        cadastroProdutos.adicionarProduto(3L, "Produto 2", 11d, 19);
        cadastroProdutos.adicionarProduto(4L, "Produto 3", 19d, 2);
        cadastroProdutos.adicionarProduto(5L, "Produto 4", 12d, 8);

        System.out.println(cadastroProdutos.produtoSet);
    }
    }
