package br.ufrn.imd.model;

public class ContaCorrente implements Tributavel {
    protected String agencia;
    protected String numero;
    protected double saldo;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saca(double valor) {
        System.out.println("Saque de " + valor + " em [" + this.numero + "] efetuado com sucesso!");
    }

    public void deposita(double valor) {

        System.out.println("Deposito de " + valor + " em [" + this.numero + "] efetuado com sucesso!");

    }

    public boolean transfere(double valor, ContaCorrente cc) {
        System.out.println("Transferindo " + valor + " para [" + this.numero + "]");
        return true;
    }

    @Override
    public double calculaTributos() {
        double tributoCC = saldo * 0.38;
        this.saldo = this.saldo - tributoCC;
        return tributoCC;
    }
}
