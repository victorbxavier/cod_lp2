package br.ufrn.imd.dao;

import br.ufrn.imd.controller.GeradorImpostoRenda;
import br.ufrn.imd.model.Pessoa;

import java.util.ArrayList;

public class PessoaDAO {
    private ArrayList<Pessoa> pessoas;

    public PessoaDAO() {
        pessoas = new ArrayList<Pessoa>();
    }

    public void cadastraPessoa(Pessoa p) {
        pessoas.add(p);
    }

    public void removePessoa(Pessoa p) {
        pessoas.remove(p);
    }

    public void listaPessoa() {
        for (Pessoa p : pessoas) {
            System.out.println("******************************************************************");
            System.out.println("Nome...: " + p.getNome() + "     " + "Salario.: " + p.getSalario());
            System.out.println("Agencia: " + p.getConta().getAgencia() + " Conta: " + p.getConta().getNumero() + "        " +
                    "Saldo.: " + p.getSalario());
            System.out.println("Seguro.: " + p.getSeguro().getNumero() + "      Beneficiario.:"
                    + p.getSeguro().getBeneficiado());
            System.out.println("Valor Seguro: " + p.getSeguro().getValor());
            System.out.println("******************************************************************");
        }
    }

    public void calcularTributosPessoa() {
        for (Pessoa p : pessoas) {
            System.out.println("***********************************************************");
            System.out.println("Nome...:" + p.getNome() + "     IRPF...:" + p.getSalario() * 0.11);
        }
        System.out.println("***********************************************************");
    }

    public void imprimeImpostoTotal() {
        GeradorImpostoRenda gr = new GeradorImpostoRenda();

        double maiorImposto = 0;
        String nomePessoamaiorImp = "";

        double maiorBen = 0;
        String nomePessoamaiorBen = "";

        double impRecolhido = 0;

        for (Pessoa p : pessoas) {
            if (gr.calculaValorTotalTributo(p) + (p.getSalario() * 0.11) > maiorImposto) {
                maiorImposto = gr.calculaValorTotalTributo(p) + (p.getSalario() * 0.11);
                nomePessoamaiorImp = p.getNome();
            }
            if (p.getSeguro().getValor() > maiorBen) {
                maiorBen = p.getSeguro().getValor();
                nomePessoamaiorBen = p.getSeguro().getBeneficiado();
            }
            impRecolhido = impRecolhido + (gr.calculaValorTotalTributo(p) + (p.getSalario() * 0.11));
        }
        System.out.println("Imposto total recolhido: " + impRecolhido + " Maior pagador:" + nomePessoamaiorImp
                + " Maior beneficiado: " + nomePessoamaiorBen);
    }
}
