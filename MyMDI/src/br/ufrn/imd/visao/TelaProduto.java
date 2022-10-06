package br.ufrn.imd.visao;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.ufrn.imd.dao.ProdutoDAO;
import br.ufrn.imd.modelo.Produto;

public class TelaProduto extends JInternalFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    int codP = 1;

    ProdutoDAO pDAOTP;

    // r�tulos
    JLabel ldescProduto = new JLabel("Desc. Produto:");
    JLabel luniProduto = new JLabel("Un. Produto..:");
    JLabel lvlrProduto = new JLabel("Vlr. Produto.:");

    private Font f = new Font("Courier", Font.PLAIN, 12);

    // campos
    JTextField tdesProduto = new JTextField();
    JTextField tuniProduto = new JTextField();
    JTextField tvlrProduto = new JTextField();

    // bot�es
    JButton btSubmeter = new JButton("Submeter");
    JButton btLimpar = new JButton("Limpar");

    public TelaProduto(String str) {
        super(str, false, true);

        Container ct = this.getContentPane();
        ct.setLayout(null);

        // setando a fonte
        ldescProduto.setFont(f);
        luniProduto.setFont(f);
        lvlrProduto.setFont(f);

        // coordenadas
        ldescProduto.setBounds(10, 10, 105, 25);
        tdesProduto.setBounds(118, 10, 265, 25);

        luniProduto.setBounds(10, 40, 105, 25);
        tuniProduto.setBounds(118, 40, 22, 25);

        lvlrProduto.setBounds(10, 70, 105, 25);
        tvlrProduto.setBounds(118, 70, 100, 25);

        // idem
        btSubmeter.setBounds(50, 140, 100, 30);
        btLimpar.setBounds(230, 140, 100, 30);

        // adicionando componentes
        ct.add(ldescProduto);
        ct.add(tdesProduto);
        ct.add(luniProduto);
        ct.add(tuniProduto);
        ct.add(lvlrProduto);
        ct.add(tvlrProduto);
        ct.add(btSubmeter);
        ct.add(btLimpar);

        // evento dos bot�es
        btSubmeter.addActionListener(this);
        btLimpar.addActionListener(this);

        // especifica��es do formul�rio
        setSize(410, 210);
        setTitle(str);

        pDAOTP = pDAOTP.getInstance();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btSubmeter) {

            // setar atributos Produto
            Produto p = new Produto();
            p.setCodigoProduto(codP);
            codP++;

            p.setDescricaoProduto(tdesProduto.getText());
            p.setUnidadeProduto(Integer.parseInt(tuniProduto.getText()));
            p.setValorProduto(Double.parseDouble(tvlrProduto.getText()));

            // persistir dados
            pDAOTP.inserirProduto(p);
            System.out.println(codP);

            tdesProduto.setText("");
            tuniProduto.setText("");
            tvlrProduto.setText("");

            tdesProduto.requestFocus();

        }
        if (e.getSource() == btLimpar) {
            tdesProduto.setText("");
            tuniProduto.setText("");
            tvlrProduto.setText("");
        }
    }

}
