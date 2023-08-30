package list.OperacoesBasicas.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    //atributo

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordernarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>();
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordernarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Pessoa 1", 19, 1.73);
        ordenacaoPessoa.adicionarPessoa("Pessoa 2", 23, 1.89);
        ordenacaoPessoa.adicionarPessoa("Pessoa 3", 42, 1.82);
        ordenacaoPessoa.adicionarPessoa("Pessoa 4", 83, 1.67);

        System.out.println(ordenacaoPessoa.ordernarPorIdade());
        System.out.println(ordenacaoPessoa.ordernarPorAltura());

    }
}
