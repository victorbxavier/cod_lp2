package imd.model;

public class Girafa extends Animal {
    private int tamanhoLingua;

    public int getTamanhoLingua() {
        return tamanhoLingua;
    }

    public void setTamanhoLingua(int tamanhoLingua) {
        this.tamanhoLingua = tamanhoLingua;
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
        System.out.println("Alimentacao: " + tamanhoLingua);
    }
}
