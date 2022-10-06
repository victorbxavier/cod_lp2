package br.ufrn.imd.controller;

public class PistaException extends Exception {
    private static final long serialVersionUID = 1L;

    public PistaException(String messagem, AcimaVelocidadeException ave) {
        super(messagem, ave);
    }
}
