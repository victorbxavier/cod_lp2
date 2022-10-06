package br.ufrn.imd.model;

import br.ufrn.imd.controller.AcimaVelocidadeException;

public class Automovel {

    private static final int VELOCIDADE_MAXIMA = 120;
    private int velocidadeAtual;

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar(int vel) throws AcimaVelocidadeException {
        if (this.velocidadeAtual + vel > VELOCIDADE_MAXIMA) {
            throw new AcimaVelocidadeException("Excedeu a velocidade maxima!");
        } else {
            this.velocidadeAtual += vel;
        }
    }

}
