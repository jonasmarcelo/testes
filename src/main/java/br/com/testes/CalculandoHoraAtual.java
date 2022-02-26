package br.com.testes;

/**
 * @author jonas
 *
 * Calcula a hora atual
 */
public class CalculandoHoraAtual {

    public static void main(String[] args) {

        //Retorna a quantidade de milisegunndos que foram passados desde 1970 a partir das 0 horas
        //O número '10800000' representa o fuso horário brasileiro que é de -3H
        long totalMilisegundos = System.currentTimeMillis() - 10800000;

        //Obtem a quantidade de segundos que foram passados desde 1970 a partir das 0 horas
        long totalSegundos = totalMilisegundos / 1000;
        //Obtem o segundo atual com o resto da divisão (%)
        long segundoAtual = totalSegundos % 60;

        //Obtem a quantidade de minutos que foram passados desde 1970 a partir das 0 horas
        long totalMinutos = totalSegundos / 60;
        //Obtem o minuto atual com o resto da divisão (%)
        long minutoAtual = totalMinutos % 60;

        //Obtem a quantidade de horas que foram passados desde 1970 a partir das 0 horas
        long totalHoras = totalMinutos / 60;
        //Obtem a hora atual com o resto da divisão (%)
        long horaAtual = totalHoras % 24;

        System.out.println("Horário atual: " + horaAtual + ":" + minutoAtual + ":" + segundoAtual);

    }
}
