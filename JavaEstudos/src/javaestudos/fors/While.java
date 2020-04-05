package javaestudos.fors;

import java.util.stream.IntStream;

public class While {
    public static void main(String[] args) {
        var x = 0;
        
        //Testa a condição antes
        while(x < 1){
            System.out.println("Dentro do While...");
            x++;
        }
        
        var y = 0;
        
        //Testa a condição depois
        //Faz no mínimo uma vez o print...
        do{
            System.out.println("Dentro do do/while...");
        }while(y++ < 5);
        
        //Instruções Lambda para Java
        //Primeiro ele imprime todos os arquivos que estão dentro do parênteses
        //Fazendo um foreach
        IntStream.of(1,2,3,4,5).forEach(n -> {System.out.println(n);});
        
        //Já aqui, ele pega somente os 3 primeiros números, iniciando da posição zero.
        IntStream.range(0,3).forEach(n -> {System.out.println("Número = " + n);});
        
        
    }
}
