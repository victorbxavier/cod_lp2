public class Homem extends Pessoa {
    @Override
    public String calculaIMC(double altura, double peso) {
        double imc = peso / Math.pow(altura, 2);
        String imcString = Double.toString(imc);
        if (imc < 20.7) {
            return imcString + " - abaixo do peso";
        } else if (imc < 26.4) {
            return imcString + " - peso ideal";
        } else {
            return imcString + " - acima do peso";
        }
    }
}
