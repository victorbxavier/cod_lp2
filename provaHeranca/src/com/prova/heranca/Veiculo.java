package com.prova.heranca;

public class Veiculo {

    protected String marca;
    protected String modelo;
    protected String nPlaca;
    protected double valAlug;
    protected boolean alug;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getnPlaca() {
        return nPlaca;
    }

    public void setnPlaca(String nPlaca) {
        this.nPlaca = nPlaca;
    }

    public double getValAlug() {
        return valAlug;
    }

    public void setValAlug(double valAlug) {
        this.valAlug = valAlug;
    }

    public boolean isAlug() {
        return alug;
    }

    public void setAlug(boolean alug) {
        this.alug = alug;
    }

    public void print() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Número da placa:" + nPlaca);
        System.out.println("Valor do aluguel: " + valAlug);
    }
}
