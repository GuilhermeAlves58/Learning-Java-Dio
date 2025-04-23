package problem_set.Collections.stream;

import java.util.*;
import java.util.function.*;

public class Stream {
    // Functional Interface
    @FunctionalInterface
    interface Calculator {
        int operation(int a, int b);
    }

    public static void main(String[] args) {
        // Classe Anônima
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running task with anonymous class");
            }
        };
        task.run();

        // Lambda Expression
        Calculator sum = (a, b) -> a + b;
        System.out.println("Sum using lambda: " + sum.operation(5, 3)); // Resultado: 8

        // Method Reference com forEach
        List<String> names = Arrays.asList("Ana", "Carlos", "Bruna");
        System.out.println("Names using method reference:");
        names.forEach(System.out::println); // Usa o método println diretamente

        // Method Reference com parseInt e construtor
        Function<String, Integer> toInteger = Integer::parseInt;
        Supplier<Date> dateSupplier = Date::new;
        System.out.println("Parsed integer: " + toInteger.apply("123"));
        System.out.println("New date: " + dateSupplier.get());

        // Stream API - Filtrar, ordenar e imprimir nomes
        List<String> names2 = Arrays.asList("Ana", "Carlos", "Bruna", "Beatriz");
        System.out.println("Filtered and sorted names starting with B:");
        names2.stream()
                .filter(name -> name.startsWith("B"))
                .sorted()
                .forEach(System.out::println);

        // Stream API - Soma de números pares
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sumEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of even numbers: " + sumEven);
    }
}
