
public class TestaNotebook {

    public static void main(String args[]) {

        Pessoa p1 = new Pessoa();
        p1.setNome("Roberto");
        p1.setAltura(1.85);

        Pessoa p2 = new Pessoa();
        p2.setNome("Ana");
        p2.setAltura(1.65);

        Notebook02 nt = new Notebook02();

        nt.addNotes(p1);
        nt.addNotes(p2);

        nt.numberOfNotes();

        nt.printOut("Roberto");

    }
}