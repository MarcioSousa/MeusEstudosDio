package javaestudos.heranca;

public class Principal {
    public static void main(String[] args) {
        
        Carro carro = new Carro("Nissan", "March", 1000.00, 4); //70.00
        
        Moto moto = new Moto("Ducati", "Streetfighter", 1000.00, "850"); //30.00
                
        System.out.println("A marca do Carro é: " + carro.getMarca());
        System.out.println("O modelo do Carro é: " + carro.getModelo());
        System.out.println("A quantidade de portas é: " + carro.getQuantidadeDePortas());
        System.out.println("Imposto: R$ " + carro.calculaImposto());
        
        System.out.println("A marca da Moto é: " + moto.getMarca());
        System.out.println("O modelo da Moto é: " + moto.getModelo());
        System.out.println("A quantidade de cil. é: " + moto.getCilindradas());
        System.out.println("Imposto: R$ " + moto.calculaImposto());

    }
}
