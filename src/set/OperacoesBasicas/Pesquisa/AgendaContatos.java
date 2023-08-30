package set.OperacoesBasicas.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public  Set<Contato> contatosPorNome(String nome){
        Set<Contato> contatosPorNome =new HashSet<>();
        for (Contato c: contatoSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c: contatoSet){
            if (c.getNome().equalsIgnoreCase(nome));
            c.setNumero(novoNumero);
            contatoAtualizado = c;
            break;
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Diogo", 997210280);
        agendaContatos.adicionarContato("Raphael", 923215680);
        agendaContatos.adicionarContato("Marcos", 997526783);
        agendaContatos.adicionarContato("Júnior", 997987580);
        agendaContatos.adicionarContato("César", 993275147);

        agendaContatos.exibirContato();
    }
}
