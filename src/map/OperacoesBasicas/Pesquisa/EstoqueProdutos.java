package map.OperacoesBasicas.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome,preco, quantidade));
    }
    public void exibirProduto(){
        System.out.println(estoqueProdutosMap);
    }
    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p: estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()){
        for (Produto p: estoqueProdutosMap.values()){
        if (p.getPreco() > maiorPreco){
            produtoMaisCaro = p;
            }
         }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.adicionarProduto(1L, "Produto 1", 10, 10.0);
        estoque.adicionarProduto(2L, "Produto 2", 13, 8.0);
        estoque.adicionarProduto(3L, "Produto 3", 14, 4.0);
        estoque.adicionarProduto(4L, "Produto 4", 17, 19.0);
        estoque.adicionarProduto(5L, "Produto 5", 9, 12.0);

        estoque.exibirProduto();

        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro do estoque: R$" + estoque.obterProdutoMaisCaro());
    }
}
