/**
 * Escreva a descrição da classe Notebook aqui.
 *
 * @author (seu nome)
 * @version (número de versão ou data)
 */

import java.util.ArrayList;

public class Notebook02 {
    // Storage for an arbitrary number of notes.
    private ArrayList<Pessoa> notes;

    /**
     * Perform any initialization that is required for the
     * notebook.
     */
    public Notebook02() {
        notes = new ArrayList<Pessoa>();
    }

    // resposta padr�o.
    public void printOut(String name) {
        // controle da busca ...
        boolean find = false;

        for (Pessoa p : notes) {
            if (p.getNome().equals(name)) {
                System.out.println("Altura: " + p.getAltura());
                find = true;
            }
        }
        if (!find) System.out.println("Nao encontrou");
    }

    public void addNotes(Pessoa p) {
        notes.add(p);
        System.out.println("Pessoa " + p.getNome() + " incluida no notes ....");
    }

    public int numberOfNotes() {
        return notes.size();
    }

}
