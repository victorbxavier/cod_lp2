import java.util.ArrayList;

public class Repositorio {
    ArrayList<Pessoa> pessoas;

    public Repositorio() {
        pessoas = new ArrayList<Pessoa>();
    }

    public void addPes(Pessoa p) {
        pessoas.add(p);
    }

    public void list() {
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.toString());   // empty line between items
            System.out.println(" ");
        }
    }
}
