package javaestudos.heranca;

import java.util.Objects;

public abstract class Veiculo {
    private final String modelo;
    private final String marca;
    private double valorVenal;
    
    public double getValorVenal() {
        return valorVenal;
    }

    public void setValorVenal(double valorVenal) {
        this.valorVenal = valorVenal;
    }
    
    public Veiculo(String modelo, String marca, double valorVenal) {
        this.modelo = modelo;
        this.marca = marca;
        this.valorVenal = valorVenal;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }
    
    public void acelera(){
        System.out.println("Acelerando...");
    }

    public double calculaImposto(){
        return this.valorVenal * 0.01;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.modelo);
        hash = 17 * hash + Objects.hashCode(this.marca);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Veiculo other = (Veiculo) obj;
        if (Double.doubleToLongBits(this.valorVenal) != Double.doubleToLongBits(other.valorVenal)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return true;
    }
    
    
    
}
