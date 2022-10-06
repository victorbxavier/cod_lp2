

public class Carro extends Veiculo {

    private int potencia;
    private int qtdPortas;

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    @Override
    public void print() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Número da placa:" + getnPlaca());
        System.out.println("Valor do aluguel: " + getValAlug());
        System.out.println("Potencia:" + potencia);
        System.out.println("Qtd portas:" + qtdPortas);
    }
}
