package javaestudos.heranca;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Calendario {
    public static void main(String[] args) {
        //Exemplo005
        Calendar agora = Calendar.getInstance();
        
        System.out.println(agora);
        System.out.println();
        
        //Exemplo006
        System.out.println("A data corrente é: " + agora.getTime());
        //A data corrente é: Wed Apr 01 18:03:29 BRT 2020
        
        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás: " + agora.getTime());
        //15 dias atrás: Tue Mar 17 18:04:37 BRT 2020
        
        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois: " + agora.getTime());
        //4 meses depois: Fri Jul 17 18:06:02 BRT 2020
        
        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: " + agora.getTime());
        //2 anos depois: Sun Jul 17 18:06:02 BRT 2022
        System.out.println();
        
        //Exemplo007
        System.out.printf("%tc\n", agora);
        //dom. jul. 17 19:13:15 BRT 2022
        System.out.printf("%tF\n", agora);
        //2022-07-17
        System.out.printf("%tD\n", agora);
        //07/17/22
        System.out.printf("%tr\n", agora);
        //07:13:15 PM
        System.out.printf("%tT\n", agora);
        System.out.println();
        //19:13:15
        
        //Exemplo008
        /*String datetToStr = DateFormat.getInstance().format(agora);
        
        System.out.println(datetToStr);
        // 14/07/19 22:40
        
        datetToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);
        
        System.out.println(datetToStr);
        //14 de Julho de 2019 22h40min55s BRT
        
        System.out.println();*/
        
        //Exemplo009
        Date momentoExato = new Date();
        Date momentoExatoCompleto = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        //01/04/2020
        
        SimpleDateFormat formatterData = new SimpleDateFormat("dd/MM/yyyy HH/mm/ss z");
        //01/04/2020 19/40/38 BRT
        
        String dataFormatada = formatter.format(momentoExato);
        String dataFormatadaCompleta = formatterData.format(momentoExatoCompleto);
        System.out.println(dataFormatada);
        System.out.println(dataFormatadaCompleta);
        System.out.println();
        
        //Exemplo010
        //LocalDate - Formato padrão é yyyy-MM-dd
        LocalDate hoje = LocalDate.now();
        //2020-04-01
        LocalDate ontem = hoje.minusDays(1);
        //2020-03-31
        
        //LocalTime - Exemplo: horário com nonosegundos: 12:22:10:121212121
        LocalTime localTimeAgora = LocalTime.now();
        //19:53:20.036805500
        LocalTime maisUmaHora = localTimeAgora.plusHours(1);
        //20:53:20.036805500
        
        //LocalDateTime - Junção do LocalDate e o LocalTime. Exemplo: 2nd Octuber 2007 at 13:45.30.123456789
        LocalDateTime localAgora = LocalDateTime.now();
        //2020-04-01T19:57:28.978946300
        System.out.println(localAgora);
        
        LocalDateTime futuro = localAgora.plusHours(1).plusDays(2).plusSeconds(12);
        //2020-04-03T20:57:40.978946300
        
        //Exercícios
        System.out.println(hoje);
        System.out.println(ontem);
        System.out.println(localTimeAgora);
        System.out.println(maisUmaHora);
        System.out.println(futuro);
        
        System.out.println();
        
    }
}
