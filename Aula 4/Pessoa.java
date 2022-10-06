
/**
 * Escreva a descrição da classe Pessoa aqui.
 *
 * @author (seu nome)
 * @version (número de versão ou data)
 */
public class Pessoa {
    private String nome;
    private double altura;

    /**
     * COnstrutor para objetos da classe Pessoa
     */
    public Pessoa() {
        nome = "";
        altura = 0.0;
    }

    public void setNome(String name) {
        nome = name;
    }

    public String getNome() {
        return nome;
    }

    public void setAltura(double vlr) {
        altura = vlr;
    }

    public double getAltura() {
        return altura;
    }
}    
