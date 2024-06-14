package map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
  private Map<LocalDate, Eventos> eventosMap;

  public AgendaEventos() {
    this.eventosMap = new HashMap<>();
  }

  public void adicionarEvento(LocalDate data, String nomeEvento, String descricaoAtracao) {
    eventosMap.put(data, new Eventos(nomeEvento, descricaoAtracao));
  }

  public void exibirAgenda() {
    Map<LocalDate, Eventos> eventosTreeMap = new TreeMap<>(eventosMap);
    for (Map.Entry<LocalDate, Eventos> entry : eventosTreeMap.entrySet()) {
      LocalDate dataEvento = entry.getKey();
      Eventos evento = entry.getValue();
      System.out.println("Data: " + dataEvento + ", Evento: " + evento.getNome() + ", Atração: " + evento.getAtracao());
    }
  }

  public void obterProximoEvento() {
    LocalDate dataAtual = LocalDate.now();
    LocalDate proximaData = null;
    Eventos proximoEvento = null;
    for (Map.Entry<LocalDate, Eventos> entry : eventosMap.entrySet()) {
      LocalDate dataEvento = entry.getKey();
      if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
        proximaData = dataEvento;
        proximoEvento = entry.getValue();
        break;
      }
    }
    if (proximoEvento != null) {
      System.out.println("O próximo evento: " + proximoEvento.getNome() + " acontecerá na data " + proximaData);
    } else {
      System.out.println("Não há eventos futuros na agenda.");
    }
  }

  public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();


    agendaEventos.adicionarEvento(LocalDate.of(2024, Month.MARCH, 26), "Adobe Summit", "Tendências do marketing digital");
    agendaEventos.adicionarEvento(LocalDate.of(2024, Month.MARCH, 25), "DCD Connect", "Profissionais de Data Centers e de TI.");
    agendaEventos.adicionarEvento(LocalDate.of(2024, Month.FEBRUARY, 21), "DeveloperWeek", "Área de desenvolvimento de software e tecnologia");
    agendaEventos.adicionarEvento(LocalDate.of(2024, Month.MARCH, 6), "Data Centre World", "Encontro para profissionais de Data Centers e infraestrutura de TI");
    agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 14), "Startup Summit", "modelo de ecossistema de startups");

    
    agendaEventos.exibirAgenda();


    agendaEventos.obterProximoEvento();
  }
}