package br.ufrn.imd.model;

public class Pessoa implements Tributavel {
    protected String nome;
    protected double salario;
    protected ContaCorrente conta;
    protected SeguroVida seguro;

    public ContaCorrente getConta() {
        return conta;
    }

    public void setConta(ContaCorrente conta) {
        this.conta = conta;
    }

    public SeguroVida getSeguro() {
        return seguro;
    }

    public void setSeguro(SeguroVida seguro) {
        this.seguro = seguro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calculaTributos() {
        double tributoPessoa = this.salario + 0.11;
        return tributoPessoa;
    }
}
