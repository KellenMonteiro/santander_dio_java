package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
  private List<Pessoa> pessoaList;

  public OrdenacaoPessoa() {
    this.pessoaList = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, int idade, double altura) {
    pessoaList.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordenarPorIdade() {
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    if (!pessoaList.isEmpty()) {
      Collections.sort(pessoasPorIdade);
      return pessoasPorIdade;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public List<Pessoa> ordenarPorAltura() {
    List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
    if (!pessoaList.isEmpty()) {
      Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
      return pessoasPorAltura;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public static void main(String[] args) {

    OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

    ordenacaoPessoa.adicionarPessoa("Maria", 55, 1.56);
    ordenacaoPessoa.adicionarPessoa("Kellen", 30, 1.57);
    ordenacaoPessoa.adicionarPessoa("Keven", 25, 1.70);
    ordenacaoPessoa.adicionarPessoa("Kauan", 22, 1.70);

    System.out.println(ordenacaoPessoa.pessoaList);
    System.out.println(ordenacaoPessoa.ordenarPorIdade());
    System.out.println(ordenacaoPessoa.ordenarPorAltura());
  }
}