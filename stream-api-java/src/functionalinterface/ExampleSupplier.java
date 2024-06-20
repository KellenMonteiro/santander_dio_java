package functionalinterface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;


public class ExampleSupplier {
  public static void main(String[] args) {
    
    Supplier<String> saudacao = () -> "Olá, seja muito bem-vindo(a) ao meu repositório!";

   
    List<String> listarSaudacoes = Stream.generate(saudacao)
        .limit(10)
        .toList();

 
    listarSaudacoes.forEach(System.out::println);
  }
}