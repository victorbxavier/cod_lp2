package br.ufrn.imd.view;

import br.ufrn.imd.controller.PistaException;
import br.ufrn.imd.model.Pista;

public class Aplicacao {

    public static void main(String[] args) {
        // write your code here
        Pista p = new Pista();
        try {
            p.iniciar();
        } catch (PistaException pe) {
            System.out.println("Pista foi bloqueada");
            System.out.println("Causado por " + pe.getCause());
        } finally {

        }
    }
}
