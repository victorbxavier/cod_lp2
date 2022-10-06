package br.ufrn.imd.dao;

import br.ufrn.imd.modelo.Cliente;
import br.ufrn.imd.modelo.Produto;

import java.util.ArrayList;

public class ProdutoDAO {
    private ArrayList<Produto> produtos;
    private static ProdutoDAO pDAO;

    private ProdutoDAO() {
        produtos = new ArrayList<Produto>();
    }

    //Singleton
    public static ProdutoDAO getInstance() {
        if (pDAO == null) {
            pDAO = new ProdutoDAO();
        }
        return pDAO;
    }

    public int buscaCodigoProduto() {
        if (produtos.isEmpty()) {
            return -1;
        }
        int idUltimoProduto = produtos.get(produtos.size() - 1).getCodigoProduto();
        return idUltimoProduto;
    }

    public void inserirProduto(Produto c) {
        produtos.add(c);
    }

    public void listarProdutos() {
        for (Produto p : produtos) {
            System.out.println("ID:" + p.getCodigoProduto());
            System.out.println("Descrição:" + p.getDescricaoProduto());
            System.out.println("Quantidade do produto:" + p.getUnidadeProduto());
            System.out.println("Valor do produto:" + p.getValorProduto());
        }
    }
}
