package br.ufrn.imd.model;

import br.ufrn.imd.controller.AcimaVelocidadeException;
import br.ufrn.imd.controller.PistaException;

public class Pista {

    public void iniciar() throws PistaException {
        Automovel a1 = new Automovel();
        a1.setVelocidadeAtual(100);
        try {
            a1.acelerar(20);
        } catch (AcimaVelocidadeException ave) {
            throw new PistaException("Ops, velocidade mt alta! ", ave);
        }
    }
}
