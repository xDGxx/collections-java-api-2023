package map.OperacoesBasicas.Pesquisa;

import map.OperacoesBasicas.AgendaContatos;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

import static com.sun.tools.javac.resources.CompilerProperties.Fragments.Local;

public class AgendaEvento {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEvento(){
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
//        Set<LocalDate> dataSet= eventoMap.keySet();
//        Collection<Evento> values = eventoMap.values();
        LocalDate dataAtual = LocalDate.now(); //Mostra data atual do sistema.
        LocalDate proximaData= null;
        Evento proximoEvento= null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventoMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) == entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + "acontecerá na data " + proximaData);
                break;
            }
        }
    }



    public static void main(String[] args) {
        AgendaEvento agendaEvento = new AgendaEvento();
        agendaEvento.adicionarEvento(LocalDate.of(2022, Month.APRIL, 15), "Evento 1", "Atração 1");
        agendaEvento.adicionarEvento(LocalDate.of(2021, Month.AUGUST, 10), "Evento 2", "Atração 2");
        agendaEvento.adicionarEvento(LocalDate.of(2018, Month.JULY, 30), "Evento 3", "Atração 3");
        agendaEvento.adicionarEvento(LocalDate.of(2023, Month.JANUARY, 23), "Evento 4", "Atração 4");
        agendaEvento.adicionarEvento(LocalDate.of(2015, Month.DECEMBER, 11), "Evento 5", "Atração 5");
    }
}
