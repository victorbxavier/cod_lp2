package br.ufrn.imd.visao;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.ufrn.imd.dao.FornecedorDAO;
import br.ufrn.imd.modelo.Fornecedor;


public class TelaFornecedor extends JInternalFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    int codF = 1;

    FornecedorDAO fDAOTF;

    private Font f = new Font("Courier", Font.PLAIN, 12);

    // r�tulos
    JLabel lnome = new JLabel("Nome...:");
    JLabel lcnpj = new JLabel("CNPJ...:");

    // campos
    JTextField tnome = new JTextField();
    JTextField tcnpj = new JTextField();

    // bot�es
    JButton btSubmeter = new JButton("Submeter");
    JButton btLimpar = new JButton("Limpar");

    public TelaFornecedor(String str) {
        super(str, false, true);

        Container ct = this.getContentPane();
        ct.setLayout(null);

        // setando a fonte
        lnome.setFont(f);
        lcnpj.setFont(f);

        // coordenadas
        lnome.setBounds(10, 10, 100, 30);
        tnome.setBounds(77, 10, 280, 25);

        lcnpj.setBounds(10, 40, 100, 30);
        tcnpj.setBounds(77, 40, 120, 25);

        // idem
        btSubmeter.setBounds(50, 140, 100, 30);
        btLimpar.setBounds(230, 140, 100, 30);

        // adicionando componentes
        ct.add(lnome);
        ct.add(tnome);

        ct.add(lcnpj);
        ct.add(tcnpj);

        ct.add(btSubmeter);
        ct.add(btLimpar);

        // evento dos bot�es
        btSubmeter.addActionListener(this);
        btLimpar.addActionListener(this);

        // especifica��es do formul�rio
        setSize(370, 210);
        setTitle(str);

        fDAOTF = fDAOTF.getInstance();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btSubmeter) {

            // setar atributos Fornecedor
            Fornecedor f = new Fornecedor();

            codF = fDAOTF.buscaCodigoFornecedor();
            codF++;
            f.setCodigoFornecedor(codF);

            f.setNomeFornecedor(tnome.getText());
            f.setCnpjFornecedor(tcnpj.getText());

            // persistir dados
            fDAOTF.inserirFornecedor(f);
            //codF++;

            tnome.setText("");
            tcnpj.setText("");

            tnome.requestFocus();
        }
        if (e.getSource() == btLimpar) {
            tnome.setText("");
            tcnpj.setText("");
        }
    }
}
