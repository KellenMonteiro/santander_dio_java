package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

  private Set<Produtos> produtoSet;

  public CadastroProdutos() {
    this.produtoSet = new HashSet<>();
  }

  public void adicionarProdutos(long cod, String nome, double preco, int quantidade) {
    produtoSet.add(new Produtos(cod, nome, preco, quantidade));
  }

  public Set<Produtos> exibirProdutosPorNome() {
    Set<Produtos> produtosPorNome = new TreeSet<>(produtoSet);
    if (!produtoSet.isEmpty()) {
      return produtosPorNome;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  public Set<Produtos> exibirProdutosPorPreco() {
    Set<Produtos> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
    if (!produtoSet.isEmpty()) {
      produtosPorPreco.addAll(produtoSet);
      return produtosPorPreco;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  public static void main(String[] args) {

    CadastroProdutos cadastroProdutos = new CadastroProdutos();


    cadastroProdutos.adicionarProdutos(001, "Cama Box", 1200.00, 5);
    cadastroProdutos.adicionarProdutos(002, "Guarda Roupa", 1500.00, 3);
    cadastroProdutos.adicionarProdutos(003, "Armário", 2000.00, 10);
    cadastroProdutos.adicionarProdutos(004, "Estante", 2500.00, 12);

    System.out.println(cadastroProdutos.produtoSet);

    System.out.println(cadastroProdutos.exibirProdutosPorNome());

    System.out.println(cadastroProdutos.exibirProdutosPorPreco());
  }
}