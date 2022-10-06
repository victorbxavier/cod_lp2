package imd.model;

public class Elefante extends Animal {
    private int tamanhoTromba;

    public int getTamanhoTromba() {
        return tamanhoTromba;
    }

    public void setTamanhoTromba(int tamanhoTromba) {
        this.tamanhoTromba = tamanhoTromba;
    }

    @Override
    public void comer() {
        super.comer();
    }

    public void print(Animal animal) {
        System.out.println("Nome: " + getNome());
        System.out.println("Data: " + calcularIdade(animal));
        System.out.println("Peso:" + getPeso());
        System.out.println("Alimentado: " + isAlimentado());
        System.out.println("Alimentacao: " + getAlimentacao());
        System.out.println("Alimentacao: " + tamanhoTromba);
    }
}
