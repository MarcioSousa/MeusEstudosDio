package javaestudos.heranca;

import java.time.Instant;
import java.util.Date;

public class AulaData {
    public static void main(String[] args) {
        //Exemplo 1
        Date novaData = new Date();
        System.out.println(novaData);
        System.out.println();
        
        //Exemplo 2
        Long currentTimeMillis = System.currentTimeMillis();
        
        System.out.println(currentTimeMillis);
        Date novaData2 = new Date(currentTimeMillis);
        System.out.println(novaData2);
        System.out.println();
        
        //Exemplo 3
        Date dataNoPassado = new Date(1585773567337L);
        Date dataNoFuturo = new Date(5454545454547L);
        Date mesmaDataFuturo = new Date(5454545454547L);
        
        /**Comparando se a dataNoPassado é posterior a dataNoFuturo */
        boolean isAfter = dataNoPassado.after(dataNoFuturo);
        
        System.out.println(isAfter);
        //false
        
        /** Comparando se a dataNoPassado é anterior a dataNoFuturo */
        boolean isBefore = dataNoPassado.before(dataNoFuturo);
        
        System.out.println(isBefore);
        System.out.println();
        //true
        
        //Exemplo 4
        //Comparando se as datas são iguais*/
        boolean isEquals = dataNoFuturo.equals(dataNoPassado);
        
        System.out.println(isEquals);
        
        //Comparando uma data com a outra
        int compareCase1 = dataNoPassado.compareTo(dataNoFuturo); //passado -> futuro
        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado); //futuro -> passado
        int compareCase3 = dataNoFuturo.compareTo(mesmaDataFuturo);  //datas equivalentes
        
        System.out.println(compareCase1);  //-1
        System.out.println(compareCase2);  // 1     
        System.out.println(compareCase3);  // 0     
        System.out.println();
        
        //Exemplo 5
        Date dataInicio = new Date(1513124807691L);
        System.out.println(dataInicio);
        //Tue Dec 12 22:26:47 BRST 2017
        
        Instant instant = dataInicio.toInstant();
        System.out.println(instant);
        System.out.println();
        //2017-12-13T00:26:47.691Z
        
    }

}
