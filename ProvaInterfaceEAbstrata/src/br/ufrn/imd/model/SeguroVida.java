package br.ufrn.imd.model;

public class SeguroVida implements Tributavel {
    protected int numero;
    protected String beneficiado;
    protected double valor;
    protected double taxa;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBeneficiado() {
        return beneficiado;
    }

    public void setBeneficiado(String beneficiado) {
        this.beneficiado = beneficiado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public double calculaTributos() {
        this.taxa = this.valor * 0.38;
        this.valor = this.valor - this.taxa;
        return this.taxa;
    }
}
