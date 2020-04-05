package javaestudos.heranca;

public class Carro extends Veiculo {
    
    private int quantidadeDePortas;
    
    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public Carro(String modelo, String marca, double valorVenal, int quantidadeDePortas) {
        super(modelo, marca, valorVenal);
        this.quantidadeDePortas = quantidadeDePortas;
    }
    
    @Override
    public double calculaImposto(){
        return this.getValorVenal() * 0.07;
    }
    
}
