package br.ufrn.imd.view;

import br.ufrn.imd.control.Repository;
import br.ufrn.imd.model.Carro;
import br.ufrn.imd.model.Moto;
import br.ufrn.imd.model.Taxi;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Repository r = new Repository();

        Carro c1 = new Carro();
        Carro c2 = new Carro();

        Moto m1 = new Moto();
        Moto m2 = new Moto();

        Taxi t1 = new Taxi();
        Taxi t2 = new Taxi();

        c1.setQuiMensal(100);
        c1.setMotor(0.9);

        c2.setQuiMensal(100);
        c2.setMotor(2.1);

        m1.setQuiMensal(100);
        m1.setCilindrada(651);

        m2.setQuiMensal(100);
        m2.setCilindrada(149);

        t1.setQuiMensal(100);
        t1.setQtdPessoas(5);

        t2.setQuiMensal(100);
        t2.setQtdPessoas(10);

        r.addVeiculo(c1);
        r.addVeiculo(c2);
        r.addVeiculo(m1);
        r.addVeiculo(m2);
        r.addVeiculo(t1);
        r.addVeiculo(t2);

        r.getCarbonFootPrint();
    }
}
