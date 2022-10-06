package br.ufrn.imd.modelo;

import br.ufrn.imd.controle.AcimaVelocidadeException;
import br.ufrn.imd.controle.PistaException;

public class Pista {

    public void iniciar() throws PistaException {
        Automovel a = new Automovel();

        try {
            a.acelerar(50);
            System.out.println("Autom�vel acelerando ... " + a.getVelocidadeAtual());
            a.acelerar(50);
            System.out.println("Autom�vel acelerando ... " + a.getVelocidadeAtual());
            a.acelerar(50);
        } catch (AcimaVelocidadeException ave) {
            throw new PistaException("Problema na Pista!", ave);
        }
    }
}
