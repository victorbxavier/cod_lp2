package com.prova.heranca;

public class Moto extends Veiculo {
    private String tipoPartida;
    private int cilindradas;

    public String getTipoPartida() {
        return tipoPartida;
    }

    public void setTipoPartida(String tipoPartida) {
        this.tipoPartida = tipoPartida;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void print() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Número da placa:" + getnPlaca());
        System.out.println("Valor do aluguel: " + getValAlug());
        System.out.println("Tipo da partida:" + tipoPartida);
        System.out.println("Cilindradas:" + cilindradas);
    }
}
