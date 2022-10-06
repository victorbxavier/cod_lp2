package br.ufrn.imd.visao;

import br.ufrn.imd.dao.ClienteDAO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TelaRelatorioCliente extends JInternalFrame implements ActionListener {
    private static final long serialVersionUTD = 1L;
    ClienteDAO cDAO;
    JTextArea relatoriioiCliente = new JTextArea();
    JButton btListar = new JButton("Listar");

    private Font f = new Font("Courier", Font.PLAIN, 12);

    public TelaRelatorioCliente(String str) {
        super();
    }

    public void actionPerformed(ActionListener e) {

    }
}
