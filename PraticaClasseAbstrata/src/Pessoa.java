import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Pessoa {
    protected String nome;
    protected Date dataNascimento;
    protected double peso;
    protected double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) throws ParseException {
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento);//https://www.javatpoint.com/java-string-to-date
        this.dataNascimento = date1;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public abstract String calculaIMC(double altura, double peso);

    public String toString() {
        DateFormat txtData = new SimpleDateFormat("dd/MM/yyyy");

        String imcLoc = calculaIMC(this.altura, this.peso);

        String txtClasse = "Nome:" + this.nome + "\n" + "Data de Nascimento: " + txtData.format(this.dataNascimento)
                + "\n" + "Peso: " + Double.toString(this.peso) + "\n" + "Altura: " + Double.toString(this.altura) + "\n" +
                "IMC: " + imcLoc;
        return txtClasse;
    }
}
