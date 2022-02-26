package br.com.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenarLista {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Renato");
        nomes.add("Adão");
        nomes.add("Eva");
        nomes.add("José");
        nomes.add("Bruno");

        // Ordena uma lista no JAVA 7
        Comparator<String> comparator1 = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        Collections.sort(nomes, comparator1);

        System.out.println("JAVA 7 - Nomes ordenados de forma crescente");
        for (String nome1 : nomes) {
            System.out.println(nome1);
        }
        System.out.println("----------------------------------------------------------------------------------------");

        // Obs: cÃ³digo em Java 8
        Comparator<String> comparator2 = Comparator.comparing(t -> t);
        nomes.sort(comparator2);

        System.out.println("JAVA 8 - Nomes ordenados de forma crescente");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("----------------------------------------------------------------------------------------");

        // Java 8 - Ordena lista de forma decrescente
        nomes.sort(Collections.reverseOrder());

        System.out.println("JAVA 8 - Nomes ordenados de forma descrecente");
        for (String s: nomes){
            System.out.println(s);
        }
    }

}
