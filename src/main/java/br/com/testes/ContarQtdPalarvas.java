package br.com.testes;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ContarQtdPalarvas {

    public static void main(String[] args) {
        String texto = "Um Dez Vinte Vinte e Cinco Vinte e Dois Vinte e Um Cinquenta e Um Cinquenta e Cinco";
        String textoSplit[] = texto.split(" ");

        Map<String, Integer> mapFrequencias = new HashMap<>();
        mapFrequencias.put("Um", 0);
        mapFrequencias.put("Dez", 0);
        mapFrequencias.put("Vinte", 0);
        mapFrequencias.put("e", 0);
        mapFrequencias.put("Cinco", 0);
        mapFrequencias.put("Dois", 0);
        mapFrequencias.put("Cinquenta", 0);
        mapFrequencias.put("Cinco", 0);

        for (String chave : textoSplit) {
            mapFrequencias.put(chave, mapFrequencias.get(chave) + 1);
        }

        Map<String, Integer> mapFrequenciaOrdenado = mapFrequencias.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        for (String chave : mapFrequenciaOrdenado.keySet()) {
            System.out.println("Palavra: " + chave + " - " + "Frequência: "  + mapFrequencias.get(chave));
        }

    }
}
