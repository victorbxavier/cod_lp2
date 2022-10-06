package br.ufrn.imd.visao;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class MenuExemplo extends JFrame {

    JMenu fileMenu;
    JMenu relaMenu;
    JMenu sairMenu;
    JMenu sobreMenu;

    public MenuExemplo() {
        setSize(350, 230);
        setTitle("Menu Exemplo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // cria uma barra de menu
        JMenuBar mnbar = new JMenuBar();

        // adiciona a barra de menu
        setJMenuBar(mnbar);

        fileMenu = new JMenu("Cadastros");
        relaMenu = new JMenu("Relat�rios");
        sairMenu = new JMenu("Sair");
        sobreMenu = new JMenu("Sobre");

        mnbar.add(fileMenu);
        mnbar.add(relaMenu);
        mnbar.add(sairMenu);
        mnbar.add(sobreMenu);

        fileMenu.addMenuListener(new MenuListener() {

            @Override
            public void menuSelected(MenuEvent e) {
                System.out.println("Voc� selecionou o Menu Cadastros...");
            }

            @Override
            public void menuDeselected(MenuEvent e) {
                //
            }

            @Override
            public void menuCanceled(MenuEvent e) {
                //
            }
        });

        relaMenu.addMenuListener(new MenuListener() {

            @Override
            public void menuSelected(MenuEvent e) {
                System.out.println("Voc� selecionou o Menu Relat�rios...");
            }

            @Override
            public void menuDeselected(MenuEvent e) {
                //
            }

            @Override
            public void menuCanceled(MenuEvent e) {
                //
            }
        });

        sairMenu.addMenuListener(new MenuListener() {

            @Override
            public void menuSelected(MenuEvent e) {
                System.out.println("Voc� selecionou o Menu Sair...");
                System.exit(0);
            }

            @Override
            public void menuDeselected(MenuEvent e) {
                //
            }

            @Override
            public void menuCanceled(MenuEvent e) {
                //
            }
        });

        sobreMenu.addMenuListener(new MenuListener() {

            @Override
            public void menuSelected(MenuEvent e) {
                System.out.println("Victor Xavier");
            }

            @Override
            public void menuDeselected(MenuEvent e) {
                //
            }

            @Override
            public void menuCanceled(MenuEvent e) {
                //
            }
        });
    }

    public static void main(String[] args) {
        MenuExemplo menu = new MenuExemplo();
        menu.setVisible(true);
    }
}
