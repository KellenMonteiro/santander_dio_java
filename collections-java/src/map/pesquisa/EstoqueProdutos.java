package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
  private Map<Long, Produtos> estoqueProdutosMap;

  public EstoqueProdutos() {
    this.estoqueProdutosMap = new HashMap<>();
  }

  public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
    estoqueProdutosMap.put(cod, new Produtos(nome, preco, quantidade));
  }

  public void exibirProdutos() {
    System.out.println(estoqueProdutosMap);
  }

  public double calcularValorTotalEstoque() {
    double valorTotalEstoque = 0d;
    if (!estoqueProdutosMap.isEmpty()) {
      for (Produtos p : estoqueProdutosMap.values()) {
        valorTotalEstoque += p.getQuantidade() * p.getPreco();
      }
    }
    return valorTotalEstoque;
  }

  public Produtos obterProdutoMaisCaro() {
    Produtos produtoMaisCaro = null;
    double maiorPreco = Double.MIN_VALUE;
    for (Produtos p : estoqueProdutosMap.values()) {
      if (p.getPreco() > maiorPreco) {
        produtoMaisCaro = p;
        maiorPreco = p.getPreco();
      }
    }
    return produtoMaisCaro;
  }

  public Produtos obterProdutoMaisBarato() {
    Produtos produtoMaisBarato = null;
    double menorPreco = Double.MAX_VALUE;
    for (Produtos p : estoqueProdutosMap.values()) {
      if (p.getPreco() < menorPreco) {
        produtoMaisBarato = p;
        menorPreco = p.getPreco();
      }
    }
    return produtoMaisBarato;
  }

  public Produtos obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
    Produtos produtoMaiorQuantidadeValorNoEstoque = null;
    double maiorValorTotalProdutoEstoque = 0d;
    if (!estoqueProdutosMap.isEmpty()) {
      for (Map.Entry<Long, Produtos> entry : estoqueProdutosMap.entrySet()) {
        double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
        if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
          maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
          produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
        }
      }
    }
    return produtoMaiorQuantidadeValorNoEstoque;
  }

  public static void main(String[] args) {
    EstoqueProdutos estoque = new EstoqueProdutos();

   
    estoque.exibirProdutos();


    estoque.adicionarProduto(001, "Cama", 1, 3000.0);
    estoque.adicionarProduto(002, "Estante", 5, 250.0);
    estoque.adicionarProduto(003, "Geladeira", 10, 4000.0);
    estoque.adicionarProduto(004, "Guarda Roupa", 2, 4500.0);

   
    estoque.exibirProdutos();


    System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

    
    Produtos produtoMaisCaro = estoque.obterProdutoMaisCaro();
    System.out.println("Produto mais caro: " + produtoMaisCaro);

   
    Produtos produtoMaisBarato = estoque.obterProdutoMaisBarato();
    System.out.println("Produto mais barato: " + produtoMaisBarato);


    Produtos produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
    System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
  }
}