package com.prova.heranca;

public class LocaLisa {

    public static void main(String[] args) {
        // write your code here
        Repository rp = new Repository();

        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();
        Moto m1 = new Moto();
        Moto m2 = new Moto();
        Moto m3 = new Moto();

        //Marca
        c1.setMarca("Chevrolet");
        c2.setMarca("Chevrolet");
        c3.setMarca("Ford");

        m1.setMarca("Suzuki");
        m2.setMarca("Yamaha");
        m3.setMarca("Honda");

        //Modelo

        c1.setModelo("1");
        c2.setModelo("1");
        c3.setModelo("1");
        m1.setModelo("1");
        m2.setModelo("1");
        m3.setModelo("1");

        //nPlaca

        c1.setnPlaca("123");
        c2.setnPlaca("123");
        c3.setnPlaca("123");
        m1.setnPlaca("123");
        m2.setnPlaca("123");
        m3.setnPlaca("123");

        //valAlug
        c1.setValAlug(10);
        c2.setValAlug(20);
        c3.setValAlug(30);
        m1.setValAlug(40);
        m2.setValAlug(50);
        m3.setValAlug(60);

        //alug
        c1.setAlug(true);
        c2.setAlug(false);
        c3.setAlug(true);
        m1.setAlug(false);
        m2.setAlug(true);
        m3.setAlug(true);

        //potencia
        c1.setPotencia(400);
        c2.setPotencia(400);
        c3.setPotencia(400);

        //cili
        m1.setCilindradas(50);
        m2.setCilindradas(50);
        m3.setCilindradas(50);

        //qtdPortas
        c1.setQtdPortas(3);
        c2.setQtdPortas(5);
        c3.setQtdPortas(7);

        //tpartida
        m1.setTipoPartida("Manual");
        m2.setTipoPartida("Eletrica");
        m3.setTipoPartida("Manual");


        rp.addVeiculo(c1);
        rp.addVeiculo(c2);
        rp.addVeiculo(c3);
        rp.addVeiculo(m1);
        rp.addVeiculo(m2);
        rp.addVeiculo(m3);
        rp.exibir();
        rp.exibirAlug();
        rp.exibirNAlug();
        rp.maiorPreco();
        rp.maisMarca();

    }
}
