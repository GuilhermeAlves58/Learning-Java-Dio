package problem_set.Collections.set;

import java.util.*;

public class CoresArcoIris {
    public static void main(String[] args) {
            Set<String> cores = new LinkedHashSet<>(Arrays.asList(
                    "vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"
            ));


            System.out.println("A) Cores uma abaixo da outra:");
            for (String cor : cores) {
                System.out.println(cor);
            }


            System.out.println("\nB) Quantidade de cores: " + cores.size());


            System.out.println("\nC) Cores em ordem alfabética:");
            Set<String> coresOrdemAlfabetica = new TreeSet<>(cores);
            for (String cor : coresOrdemAlfabetica) {
                System.out.println(cor);
            }


            System.out.println("\nD) Cores em ordem inversa da informada:");
            List<String> coresInversas = new ArrayList<>(cores);
            Collections.reverse(coresInversas);
            for (String cor : coresInversas) {
                System.out.println(cor);
            }


            System.out.println("\nE) Cores que começam com 'v':");
            for (String cor : cores) {
                if (cor.startsWith("v")) {
                    System.out.println(cor);
                }
            }


            System.out.println("\nF) Removendo cores que não começam com 'v':");
            cores.removeIf(cor -> !cor.startsWith("v"));
            for (String cor : cores) {
                System.out.println(cor);
            }


            cores.clear();
            System.out.println("\nG) Conjunto limpo.");


            System.out.println("H) O conjunto está vazio? " + cores.isEmpty());
        }
    }

