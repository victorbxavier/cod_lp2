package imd.model;

public class Tigre extends Animal {
    private String tipoTigre;

    public String getTipoTigre() {
        return tipoTigre;
    }

    public void setTipoTigre(String tipoTigre) {
        this.tipoTigre = tipoTigre;
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
        System.out.println("Alimentacao: " + tipoTigre);
    }
}
