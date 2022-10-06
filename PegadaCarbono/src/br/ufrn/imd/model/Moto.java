package br.ufrn.imd.model;

public class Moto extends Veiculo implements ICarbonFootprint {
    private int cilindrada;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public double getCarbonFootPrint() {
        double carbono = 0;

        if (this.cilindrada > 650) {
            carbono = (double) getQuiMensal() * 0.65;
        } else if (this.cilindrada < 150) {
            carbono = (double) getQuiMensal() * 0.2;
        } else {
            carbono = (double) getQuiMensal() * 0.5;
        }
        return carbono;
    }
}
