public class MaquinaRefrigerante {

    // Atributos.
    private int preco;
    private int balanco;
    private int total;

    // Método construtor para inicializar os atributos
    public MaquinaRefrigerante(int valor) {
        preco = valor;
        balanco = 0;
        total = 0;
    }

    // Retorna o preço
    public int getPreco() {
        return preco;
    }

    // Retorna o balanço corrente
    public int getBalanco() {
        return balanco;
    }

    // Recebe um valor em dinheiro
    public void inserirDinheiro(int valor) {
        balanco += valor;
        System.out.println("Valor inserido com sucesso!!!!");
    }

    // Imprimir o preço do refrigerante
    public void imprimirPreco() {
        System.out.println("##################");
        System.out.println("# Preco ##########");
        System.out.println("# Refrigerante");
        System.out.println("# R$ " + preco + ",00");
        System.out.println("##################");
    }


}
