package br.ufrn.imd.model;

public class Taxi extends Veiculo implements ICarbonFootprint {
    private int qtdPessoas;

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    @Override
    public double getCarbonFootPrint() {
        double carbono = 0;
        carbono = (double) getQuiMensal() * 1.10;
        return carbono;
    }
}
