package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;


public class ExampleBinaryOperator {
  public static void main(String[] args) {
    
    List<Integer> inteiros = Arrays.asList(15, 85, 22, 36, 47);


    BinaryOperator<Integer> somar = Integer::sum;

    
    int resultado = inteiros.stream()
        .reduce(0, Integer::sum);

  
    System.out.println("A soma dos números é: " + resultado);
  }
}