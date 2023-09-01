package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map <String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome,telefone);
    }
    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Camila", 1199827364);
        agendaContatos.adicionarContato("Diogo", 1199715273);
        agendaContatos.adicionarContato("Camila", 219865273);
        agendaContatos.adicionarContato("Camila", 819972651);
        agendaContatos.adicionarContato("Camila", 649177289);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Diogo");
        agendaContatos.exibirContatos();
    }
}
