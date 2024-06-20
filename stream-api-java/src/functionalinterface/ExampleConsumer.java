package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ExampleConsumer {
  public static void main(String[] args) {
    
    List<Integer> inteirosPar = Arrays.asList(15, 85, 22, 36, 47);


    Consumer<Integer> numeroPar = numero -> {
      if (numero % 2 == 0) {
        System.out.println(numero);
      }
    };


    inteirosPar.stream()
        .filter(n -> n % 2 == 0)
        .forEach(System.out::println);
  }
}