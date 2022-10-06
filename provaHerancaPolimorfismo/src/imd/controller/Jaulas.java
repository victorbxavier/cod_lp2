package imd.controller;

import imd.model.Animal;
import imd.model.Elefante;
import imd.model.Girafa;
import imd.model.Tigre;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Jaulas {
    private ArrayList<Animal> jaula;


    public Jaulas() {
        jaula = new ArrayList<Animal>();
    }

    public void addVeiculo(Animal p) {
        jaula.add(p);
    }

    public void exibir() {
        for (Animal animal : jaula) {
            animal.print(animal);
            System.out.println();   // empty line between items
        }
    }

    public void qtdAlimentos() {
        double qtdAlimentos = 0;
        for (Animal a : jaula) {
            if (a instanceof Elefante) {
                qtdAlimentos = qtdAlimentos + (0.15 * a.getPeso());
            } else if (a instanceof Girafa) {
                qtdAlimentos = qtdAlimentos + (0.1 * a.getPeso());
            } else if (a instanceof Tigre) {
                qtdAlimentos = qtdAlimentos + (0.04 * a.getPeso());
            } else {
                qtdAlimentos = qtdAlimentos + (0.05 * a.getPeso());
            }
        }
        System.out.println("Qtd de Alimentos" + qtdAlimentos);
    }

    public void passarConsulta() {
        Calendar calendar = new GregorianCalendar();
        int ano = calendar.getInstance().get(Calendar.YEAR);
        for (Animal a : jaula) {
            if (a instanceof Elefante) {
                if (ano - a.getUltConsulta() > 7) {
                    a.setUltConsulta(ano);
                }

            } else if (a instanceof Girafa) {
                if (ano - a.getUltConsulta() > 5) {
                    a.setUltConsulta(ano);
                }

            } else if (a instanceof Tigre) {
                if (ano - a.getUltConsulta() > 3) {
                    a.setUltConsulta(ano);
                }
            }
        }

    }
}
