package br.ufrn.imd.dao;

import br.ufrn.imd.modelo.Cliente;
import br.ufrn.imd.modelo.Fornecedor;

import java.util.ArrayList;

public class FornecedorDAO {
    private ArrayList<Fornecedor> fornecedores;
    private static FornecedorDAO fDAO;

    private FornecedorDAO() {
        fornecedores = new ArrayList<Fornecedor>();
    }

    //Singleton
    public static FornecedorDAO getInstance() {
        if (fDAO == null) {
            fDAO = new FornecedorDAO();
        }
        return fDAO;
    }

    public int buscaCodigoFornecedor() {
        if (fornecedores.isEmpty()) {
            return -1;
        }
        int idUltimoFornecedor = fornecedores.get(fornecedores.size() - 1).getCodigoFornecedor();
        return idUltimoFornecedor;
    }

    public void inserirFornecedor(Fornecedor f) {
        fornecedores.add(f);
    }

    public void listarFornecedores() {
        for (Fornecedor f : fornecedores) {
            System.out.println("ID:" + f.getCodigoFornecedor());
            System.out.println("Nome:" + f.getNomeFornecedor());
            System.out.println("Data de Nascimento:" + f.getCnpjFornecedor());
        }
    }
}
