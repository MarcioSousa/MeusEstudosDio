package javaestudos.operadores;

public class Incremento {
    public static void main(String[] args) {
        
        final var condicao = true;
        
        if(condicao){
            System.out.println("A condicao é verdadeira");
        }else{
            System.out.println("A condicao é falsa");
        }
        
        if(condicao){
            System.out.println("Uma única linha...");
        }
        
        final var ternario = condicao ? "é verdadeira " : "é falsa";
        
        System.out.println(ternario);
        
    }
}
