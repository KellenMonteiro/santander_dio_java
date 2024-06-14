package set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
  
  private Set<Convidados> convidadosSet;

  public ConjuntoConvidados() {
    this.convidadosSet = new HashSet<>();
  }

  public void adicionarConvidados(String nome, int codigoConvite) {
    convidadosSet.add(new Convidados(nome, codigoConvite));
  }

  public void removerConvidadoPorCodigoConvite(int codigoConvite) {
    Convidados convidadoParaRemover = null;
    if (!convidadosSet.isEmpty()) {
      for (Convidados c : convidadosSet) {
        if (c.getCodigoConvite() == codigoConvite) {
          convidadoParaRemover = c;
          break;
        }
      }
      convidadosSet.remove(convidadoParaRemover);
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  public int contarConvidados() {
    return convidadosSet.size();
  }

  public void exibirConvidados() {
    if (!convidadosSet.isEmpty()) {
      System.out.println(convidadosSet);
    } else {
      System.out.println("O conjunto está vazio!");
    }
  }

  public static void main(String[] args) {
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

 
    conjuntoConvidados.adicionarConvidados("Maria", 1978);
    conjuntoConvidados.adicionarConvidados("Kellen", 1993);
    conjuntoConvidados.adicionarConvidados("Keven", 1999);
    conjuntoConvidados.adicionarConvidados("Kauan", 2002);

   
    System.out.println("Convidados no conjunto:");
    conjuntoConvidados.exibirConvidados();

    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

   
    conjuntoConvidados.removerConvidadoPorCodigoConvite(2002);
    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");

    System.out.println("Convidados no conjunto após a remoção:");
    conjuntoConvidados.exibirConvidados();
  }
}