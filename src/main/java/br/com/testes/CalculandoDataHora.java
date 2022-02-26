package br.com.testes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Calendar;

/**
 * @author jonas marcelo
 */
public class CalculandoDataHora {

    public static void main(String[] args) {

        // CALCULO DE DATA E HORA COM CALENDAR
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, Calendar.JANUARY, 1, 9, 0, 0);
        calendar.set(Calendar.MILLISECOND, 8);
        //Imprime data e hora da forma que foi definida
        System.out.println("Calendar definida: " + calendar.getTime());
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        calendar.add(Calendar.MINUTE, 15);
        //Imprime data e hora da depois de incrementar 5 dias na data e 15 minutos no hoário
        System.out.println("Calendar alterada: " + calendar.getTime());

        //CALCULO DE DATA COM LOCALDATE
        LocalDate data = LocalDate.of(2021, 1, 1);
        //Imprime data da forma que foi definida
        System.out.println("LocalDate definida: " + data);
        LocalDate dataAlterada = data.plusDays(1);
        //Imprime data depois de incrementar 1 dia
        System.out.println("LocalDate alterada: " + dataAlterada);

        //CALCULO DE DATA E HORA COM LOCALDATETIME
        LocalDateTime dataHora = LocalDateTime.of(2021, 1, 1, 9, 0, 0, 0);
        //Imprime data e hora da forma que foi definida
        System.out.println("LocalDateTime definida: " + dataHora);

        LocalDateTime dataHoraAlterada = dataHora.plusMonths(1).plusHours(1);
        //Imprime data e hora depois de incrementar 1 mês na data e 1 hora no horário
        System.out.println("LocalDateTime alterada: " + dataHoraAlterada);

        //MOSTRANDO A DATA E HORA COM ZONEDATETIME
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println("ZoneDateTime: " + zdt);

    }
}