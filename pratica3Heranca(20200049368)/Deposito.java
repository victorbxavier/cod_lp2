import java.util.ArrayList;

public class Deposito {

    private ArrayList<Produto> produtos;

    public Deposito() {
        produtos = new ArrayList<Produto>();
    }

    public void addProd(Produto p) {
        produtos.add(p);
    }

    public void remProd(Produto p) {
        if (produtos.contains(p)) {
            produtos.remove(p);
        }
    }

    public void qtdProd() {
        System.out.println("Quantidade de produtos: " + produtos.size());
    }

    public void prodVazio() {
        if (produtos.isEmpty()) {
            System.out.println("Esta vazio");
        } else {
            System.out.println("Nao esta vazio");
        }
    }

    public void maiorPreco() {
        double maiorPreco = 0;
        int index = 0;
        if (!(produtos.isEmpty())) {
            int tam = produtos.size();
            for (int i = 0; i < tam; i++) {
                double precoAtual = produtos.get(i).getPreco();
                if (precoAtual > maiorPreco) {
                    maiorPreco = precoAtual;
                    index = i;
                }
            }
        }

        System.out.println("Produto com maior preco:" + produtos.get(index).getNome());
    }
}
