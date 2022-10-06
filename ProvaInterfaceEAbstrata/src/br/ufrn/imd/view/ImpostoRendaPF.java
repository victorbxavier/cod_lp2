package br.ufrn.imd.view;

import br.ufrn.imd.dao.PessoaDAO;
import br.ufrn.imd.model.ContaCorrente;
import br.ufrn.imd.model.Pessoa;
import br.ufrn.imd.model.SeguroVida;

public class ImpostoRendaPF {

    public static void main(String[] args) {
        PessoaDAO repo = new PessoaDAO();

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        Pessoa p4 = new Pessoa();
        Pessoa p5 = new Pessoa();

        p1.setNome("Roberto");
        p1.setSalario(500.00);
        ContaCorrente c1 = new ContaCorrente();
        c1.setAgencia("1020-5");
        c1.setNumero("100.231-1");
        c1.setSaldo(150.00);
        p1.setConta(c1);
        SeguroVida sv1 = new SeguroVida();
        sv1.setBeneficiado("Maria");
        sv1.setNumero(1);
        sv1.setValor(10000.00);
        sv1.calculaTributos();
        p1.setSeguro(sv1);

        p2.setNome("Dom Pedro");
        p2.setSalario(1000.00);
        ContaCorrente c2 = new ContaCorrente();
        c2.setAgencia("2105-4");
        c2.setNumero("123.564-9");
        c2.setSaldo(300.00);
        p2.setConta(c2);
        SeguroVida sv2 = new SeguroVida();
        sv2.setBeneficiado("Joao");
        sv2.setNumero(2);
        sv2.setValor(15000.00);
        sv2.calculaTributos();
        p2.setSeguro(sv2);

        p3.setNome("Rui Barbosa");
        p3.setSalario(500.00);
        ContaCorrente c3 = new ContaCorrente();
        c3.setAgencia("1020-5");
        c3.setNumero("100.231-1");
        c3.setSaldo(p1.getSalario());
        p3.setConta(c3);
        SeguroVida sv3 = new SeguroVida();
        sv3.setBeneficiado("Maria");
        sv3.setNumero(1);
        sv3.setValor(10000.00);
        sv3.calculaTributos();
        p3.setSeguro(sv3);

        p4.setNome("Rui");
        p4.setSalario(200.00);
        ContaCorrente c4 = new ContaCorrente();
        c4.setAgencia("1026-5");
        c4.setNumero("100.231-1");
        c4.setSaldo(p1.getSalario());
        p4.setConta(c4);
        SeguroVida sv4 = new SeguroVida();
        sv4.setBeneficiado("Mar");
        sv4.setNumero(1);
        sv4.setValor(10000.00);
        sv4.calculaTributos();
        p4.setSeguro(sv4);

        p5.setNome("Barbosa");
        p5.setSalario(576.00);
        ContaCorrente c5 = new ContaCorrente();
        c5.setAgencia("1027-5");
        c5.setNumero("100.231-1");
        c5.setSaldo(p1.getSalario());
        p5.setConta(c5);
        SeguroVida sv5 = new SeguroVida();
        sv5.setBeneficiado("Mario");
        sv5.setNumero(1);
        sv5.setValor(10000.00);
        sv5.calculaTributos();
        p5.setSeguro(sv5);

        repo.cadastraPessoa(p1);
        repo.cadastraPessoa(p2);
        repo.cadastraPessoa(p3);
        repo.cadastraPessoa(p4);
        repo.cadastraPessoa(p5);

        repo.imprimeImpostoTotal();
        repo.listaPessoa();
        repo.calcularTributosPessoa();
        repo.removePessoa(p2);
        repo.listaPessoa();

    }
}
