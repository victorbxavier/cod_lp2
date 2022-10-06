package br.ufrn.imd.controle;

public class PistaException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public PistaException(String msg, AcimaVelocidadeException ave) {
        super(msg, ave);
    }
}
