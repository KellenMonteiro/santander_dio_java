package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class ExamplePredicate {
  public static void main(String[] args) {
    
    List<String> linguagensProg = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");


    Predicate<String> definirCaracteres = palavra -> palavra.length() < 4;

    
    linguagensProg.stream()
        .filter(definirCaracteres)
        .forEach(System.out::println);
  }
}