import java.text.ParseException;

public class ProgramaSaude {

    public static void main(String[] args) throws ParseException {
        Repositorio r = new Repositorio();
        Homem h1 = new Homem();
        Homem h2 = new Homem();

        Mulher m1 = new Mulher();
        Mulher m2 = new Mulher();

        h1.setNome("Joao");
        h1.setAltura(1.7);
        h1.setPeso(86.1);
        h1.setDataNascimento("01/01/2000");

        h2.setNome("Isaac");
        h2.setAltura(1.84);
        h2.setPeso(55);
        h2.setDataNascimento("01/01/2004");

        m1.setNome("Michelle");
        m1.setAltura(1.6);
        m1.setPeso(50);
        m1.setDataNascimento("01/01/2002");

        m2.setNome("Maria");
        m2.setAltura(1.7);
        m2.setPeso(100);
        m2.setDataNascimento("01/01/2003");

        r.addPes(h1);
        r.addPes(h2);
        r.addPes(m1);
        r.addPes(m2);

        r.list();

    }
}
