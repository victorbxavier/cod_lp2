package imd.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Animal {
    protected String nome;
    protected Date dataNascimento;
    protected int peso;
    protected boolean alimentado;
    protected String alimentacao;
    protected int ultConsulta;

    public Animal() {
        this.alimentado = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataString) throws ParseException {
        Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);
        this.dataNascimento = data;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isAlimentado() {
        return alimentado;
    }

    public void setAlimentado(boolean alimentado) {
        this.alimentado = alimentado;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public int getUltConsulta() {
        return ultConsulta;
    }

    public void setUltConsulta(int ultConsulta) {
        this.ultConsulta = ultConsulta;
    }

    public void comer() {

        this.setAlimentado(true);

    }

    public int calcularIdade(Animal animal) {

        LocalDate diaHj = LocalDate.now();
        Period p = Period.between(diaHj, this.dataNascimento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        return p.getYears();

    }

    public void print(Animal animal) {
        System.out.println("Nome: " + nome);
        System.out.println("Data: " + calcularIdade(animal));
        System.out.println("Peso:" + peso);
        System.out.println("Alimentado: " + alimentado);
        System.out.println("Alimentacao: " + alimentacao);
    }
}
