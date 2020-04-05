package javaestudos.strings;

public class ExercicioStrings {
    public static void main(String[] args) {
        var nome = "Marcio Sousa";
        
        System.out.println(nome.toCharArray());
        System.out.println(nome.split(" "));
        System.out.println(nome.concat(" de Java."));
        System.out.println("12552 ass".replaceAll("[0,2]", "#"));
    }
}
