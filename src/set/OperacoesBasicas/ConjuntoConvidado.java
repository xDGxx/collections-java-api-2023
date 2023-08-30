package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigo){
        convidadoSet.add(new Convidado(nome, codigo));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c: convidadoSet){
            if (c.getCodigo()== codigoConvite){
                convidadoParaRemover = c;
                break;
            }
            convidadoSet.remove(convidadoParaRemover);
        }
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();
        System.out.println("Existem" + conjuntoConvidado.contarConvidados() + "dentro do set de Contar Convidados!");

        conjuntoConvidado.adicionarConvidado("Convidado 1", 1231);
        conjuntoConvidado.adicionarConvidado("Convidado 2", 1232);
        conjuntoConvidado.adicionarConvidado("Convidado 3", 1233);
        conjuntoConvidado.adicionarConvidado("Convidado 4", 1234);
        conjuntoConvidado.adicionarConvidado("Convidado 5", 1235);

        conjuntoConvidado.exibirConvidados();
    }

}
