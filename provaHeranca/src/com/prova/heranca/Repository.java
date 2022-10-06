package com.prova.heranca;

import java.util.ArrayList;

public class Repository {

    private ArrayList<Veiculo> veiculos;

    public Repository() {
        veiculos = new ArrayList<Veiculo>();
    }

    public void addVeiculo(Veiculo p) {
        veiculos.add(p);
    }


    public void exibir() {
        for (Veiculo veiculo : veiculos) {
            veiculo.print();
            System.out.println();   // empty line between items
        }
    }

    public void exibirAlug() {
        double totalAlug = 0;
        for (Veiculo veiculo : veiculos) {
            if (veiculo.isAlug()) {
                veiculo.print();
                System.out.println();   // empty line between items
                totalAlug = totalAlug + veiculo.getValAlug();
            }
        }
        System.out.println("Valor total dos alugueis:" + totalAlug);
    }

    public void exibirNAlug() {
        for (Veiculo veiculo : veiculos) {
            if (!(veiculo.isAlug())) {
                veiculo.print();
                System.out.println();   // empty line between items
            }
        }
    }

    public void maiorPreco() {
        double maiorPreco = 0;
        int index = 0;
        if (!(veiculos.isEmpty())) {
            int tam = veiculos.size();
            for (int i = 0; i < tam; i++) {
                double precoAtual = veiculos.get(i).getValAlug();
                if (precoAtual > maiorPreco) {
                    maiorPreco = precoAtual;
                    index = i;
                }
            }
        }

        System.out.println("Produto com maior preco:");
        veiculos.get(index).print();

    }

    public void maisMarca() {
        int cont = 0;
        int maior = 0;
        String maisMarca = "alo";
        if (!(veiculos.isEmpty())) {
            //Loop 1
            for (Veiculo v1 : veiculos) {
                String marcaTemp = v1.getMarca();
                for (Veiculo v2 : veiculos) {
                    if (marcaTemp.equals(v2.getMarca())) {
                        cont++;
                    }
                }
                if (cont > maior) {
                    maisMarca = marcaTemp;
                    maior = cont;
                }
                cont = 0;
            }
        }
        System.out.println("Marca com maior numero de veiculos:" + maisMarca);
    }
}
