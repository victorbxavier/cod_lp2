package br.ufrn.imd.control;

import br.ufrn.imd.model.Carro;
import br.ufrn.imd.model.Moto;
import br.ufrn.imd.model.Taxi;
import br.ufrn.imd.model.Veiculo;

import java.util.ArrayList;

public class Repository {
    private ArrayList<Veiculo> veiculos;

    public Repository() {
        veiculos = new ArrayList<Veiculo>();
    }

    public void addVeiculo(Veiculo v) {
        veiculos.add(v);
    }

    public void getCarbonFootPrint() {
        for (Veiculo v : veiculos) {
            if (v instanceof Moto) {
                System.out.println("Este veiculo  " + ((Moto) v).getCarbonFootPrint() + " de pegadas de carbono");
            } else if (v instanceof Carro) {
                System.out.println("Este veiculo gera " + ((Carro) v).getCarbonFootPrint() + " de pegadas de carbono");
            } else if (v instanceof Taxi) {
                System.out.printf("Este veiculo gera %.2f ", ((Taxi) v).getCarbonFootPrint());
                System.out.println("de pegadas de carbono");
            }
        }
    }
}
