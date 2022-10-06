public class CalculaIMC {


    public static void main(String args[]) {
        Pessoa p1 = new Pessoa();

        p1.setPeso(82);
        p1.setAltura(1.75);

        double imc = p1.calcularIMC();

        System.out.println("Peso   => " + p1.getPeso());
        System.out.println("Altura => " + p1.getAltura());
        System.out.println("IMC    = " + imc);
        System.out.println(p1.informarIMC(imc));

    }
}