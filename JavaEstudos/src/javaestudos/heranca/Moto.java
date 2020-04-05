package javaestudos.heranca;

public class Moto extends Veiculo {
    private String cilindradas;
    
    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    public Moto(String modelo, String marca, double valorVenal, String cilindradas) {
        super(modelo, marca, valorVenal);
        this.cilindradas = cilindradas;
    }
    
    @Override
    public double calculaImposto(){
        return this.getValorVenal() * 0.03;
    }
    
}
