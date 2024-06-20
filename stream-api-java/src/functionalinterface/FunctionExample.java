package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class FunctionExample {
  public static void main(String[] args) {
    
    List<Integer> inteiros = Arrays.asList(15, 85, 22, 36, 47);


    Function<Integer, Integer> dobro = numero -> numero * 2;


    List<Integer> numerosDobrados = inteiros.stream()
        .map(n -> n * 2)
        .toList();

    numerosDobrados.forEach(System.out::println);
  }
}