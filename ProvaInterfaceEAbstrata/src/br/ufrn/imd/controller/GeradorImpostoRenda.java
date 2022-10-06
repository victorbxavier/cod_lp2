package br.ufrn.imd.controller;

import br.ufrn.imd.model.Pessoa;

public class GeradorImpostoRenda {
    protected double totalTributo;

    public double getTotalTributo() {
        return totalTributo;
    }

    public double calculaValorTotalTributo(Pessoa p) {
        this.totalTributo = (p.getConta().getSaldo() * 0.0038) + 31.50;
        return this.totalTributo;
    }
}
