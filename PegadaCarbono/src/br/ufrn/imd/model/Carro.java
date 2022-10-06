package br.ufrn.imd.model;

public class Carro extends Veiculo implements ICarbonFootprint {
    private double motor;

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    @Override
    public double getCarbonFootPrint() {
        double carbono = 0;

        if (this.motor > 2.0) {
            carbono = (double) getQuiMensal() * 1.85;
        } else if (this.motor < 1.0) {
            carbono = (double) getQuiMensal() * 0.13;
        } else {
            carbono = (double) getQuiMensal() * 1.22;
        }
        return carbono;
    }
}
