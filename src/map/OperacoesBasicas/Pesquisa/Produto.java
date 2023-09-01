package map.OperacoesBasicas.Pesquisa;

public class Produto {

    private Long cod;

    public Produto(String nome, double preco, int quantidade) {
    }

    public Long getCod() {
        return cod;
    }

    public Produto(Long cod) {
        this.cod = cod;
    }

    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
