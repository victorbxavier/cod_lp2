public class Mulher extends Pessoa {
    @Override
    public String calculaIMC(double altura, double peso) {
        double imc = peso / Math.pow(altura, 2);
        String imcString = Double.toString(imc);
        if (imc < 19) {
            return imcString + " - abaixo do peso";
        } else if (imc < 25.8) {
            return imcString + " - peso ideal";
        } else {
            return imcString + " - acima do peso";
        }
    }
}
