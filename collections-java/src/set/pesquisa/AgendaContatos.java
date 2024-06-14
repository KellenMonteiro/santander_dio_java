package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

  private Set<Contatos> contatosSet;

  public AgendaContatos() {
    this.contatosSet = new HashSet<>();
  }

  public void adicionarContato(String nome, int numero) {
    contatosSet.add(new Contatos(nome, numero));
  }

  public void exibirContatos() {
    if (!contatosSet.isEmpty()) {
      System.out.println(contatosSet);
    } else {
      System.out.println("O conjunto está vazio!");
    }
  }

  public Set<Contatos> pesquisarPorNome(String nome) {
    Set<Contatos> contatosPorNome = new HashSet<>();
    if (!contatosSet.isEmpty()) {
      for (Contatos c : contatosSet) {
        if (c.getNome().startsWith(nome)) {
          contatosPorNome.add(c);
        }
      }
      return contatosPorNome;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  public Contatos atualizarNumeroContato(String nome, int novoNumero) {
    Contatos contatoAtualizado = null;
    if (!contatosSet.isEmpty()) {
      for (Contatos c : contatosSet) {
        if (c.getNome().equalsIgnoreCase(nome)) {
          c.setNumero(novoNumero);
          contatoAtualizado = c;
          break;
        }
      }
      return contatoAtualizado;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  public static void main(String[] args) {

    AgendaContatos agendaContatos = new AgendaContatos();


    agendaContatos.exibirContatos();

    agendaContatos.adicionarContato("Maria", 000000000);
    agendaContatos.adicionarContato("Kellen", 111111111);
    agendaContatos.adicionarContato("Kauan", 222222222);
    agendaContatos.adicionarContato("Keven", 333333333);
    agendaContatos.adicionarContato("Ivan", 444444444);
    agendaContatos.adicionarContato("Isadora", 55555555);

    agendaContatos.exibirContatos();

    System.out.println(agendaContatos.pesquisarPorNome("Maria"));


    Contatos contatoAtualizado = agendaContatos.atualizarNumeroContato("Isadora", 555566666);
    System.out.println("Contato atualizado: " + contatoAtualizado);

    System.out.println("Contatos na agenda após atualização:");
    agendaContatos.exibirContatos();
  }
}