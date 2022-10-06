import java.lang.Math;

public class Pessoa {
    private double peso;
    private double altura;

    public void setPeso(double peso) {

        this.peso = peso;
    }

    public double getPeso() {

        return peso;
    }

    public void setAltura(double altura) {

        this.altura = altura;
    }

    public double getAltura() {

        return altura;
    }

    public double calcularIMC() {

        return peso / Math.pow(altura, 2);
    }

    public String informarIMC(double imc) {

        if (imc < 18.5) {

            return "Pessoa Abaixo do peso";
        } else if (imc >= 18.5 && imc < 25) {

            return "Pessoa com Peso normal";
        } else if (imc >= 25 && imc < 30) {

            return "Pessoa com Pré-obesidade";
        } else if (imc >= 30 && imc < 35) {

            return "Pessoa com Obesidade Grau 1";
        } else if (imc >= 35 && imc < 40) {

            return "Pessoa com Obesidade Grau 2";
        } else {

            return "Pessoa com Obesidade Grau 3";
        }

    }

}