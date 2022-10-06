import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class LojaView {
    public static void main(String[] args) throws Exception {
        Deposito dp = new Deposito();

        ProdutoDuravel carro = new ProdutoDuravel();
        ProdutoDuravel livro = new ProdutoDuravel();
        ProdutoDuravel celular = new ProdutoDuravel();

        ProdutoNaoDuravel chocolate = new ProdutoNaoDuravel();
        ProdutoNaoDuravel toalha = new ProdutoNaoDuravel();
        ProdutoNaoDuravel sabonete = new ProdutoNaoDuravel();

        //carro

        carro.setNome("carro");
        carro.setPreco(25000.0);
        carro.setMarca("chevrolet");
        carro.setDescricao("um carro legal");
        carro.setDurabilidade(1000);
        String sData1 = "09/09/2009";
        Date data1 = new SimpleDateFormat("dd/MM/yyyy").parse(sData1);
        carro.setDataFabricacao(data1);

        //livro
        livro.setNome("livro");
        livro.setPreco(25.0);
        livro.setMarca("harry");
        livro.setDescricao("um mago legal");
        livro.setDurabilidade(100);
        String sData2 = "09/09/2000";
        Date data2 = new SimpleDateFormat("dd/MM/yyyy").parse(sData2);
        livro.setDataFabricacao(data2);

        //celular

        celular.setNome("celular");
        celular.setPreco(5000.0);
        celular.setMarca("apple");
        celular.setDescricao("um celular legal");
        celular.setDurabilidade(5);
        String sData3 = "09/09/2020";
        Date data3 = new SimpleDateFormat("dd/MM/yyyy").parse(sData3);
        celular.setDataFabricacao(data3);

        //chocolate
        chocolate.setNome("chocolate");
        chocolate.setPreco(10.0);
        chocolate.setMarca("cacau");
        chocolate.setDescricao("um chocolate legal");
        chocolate.setGenero("Alimenticio");
        String sData4 = "09/09/2003";
        Date data4 = new SimpleDateFormat("dd/MM/yyyy").parse(sData4);
        chocolate.setDataFabricacao(data4);
        String sData5 = "19/10/2003";
        Date data5 = new SimpleDateFormat("dd/MM/yyyy").parse(sData5);
        chocolate.setDataValidade(data5);

        //toalha
        toalha.setNome("toalha");
        toalha.setPreco(20.0);
        toalha.setMarca("sei la");
        toalha.setDescricao("um toalha legal");
        toalha.setGenero("Higiene");
        String sData6 = "09/09/2019";
        Date data6 = new SimpleDateFormat("dd/MM/yyyy").parse(sData6);
        toalha.setDataFabricacao(data6);
        String sData7 = "19/04/2030";
        Date data7 = new SimpleDateFormat("dd/MM/yyyy").parse(sData7);
        toalha.setDataValidade(data7);

        //sabonete
        sabonete.setNome("sabao");
        sabonete.setPreco(10.0);
        sabonete.setMarca("omo");
        sabonete.setDescricao("um sabao legal");
        sabonete.setGenero("higiene");
        String sData8 = "09/09/2029";
        Date data8 = new SimpleDateFormat("dd/MM/yyyy").parse(sData8);
        chocolate.setDataFabricacao(data8);
        String sData9 = "19/04/2034";
        Date data9 = new SimpleDateFormat("dd/MM/yyyy").parse(sData9);
        chocolate.setDataValidade(data9);

        dp.prodVazio();
        dp.addProd(carro);
        dp.addProd(livro);
        dp.addProd(celular);
        dp.addProd(chocolate);
        dp.addProd(toalha);
        dp.addProd(sabonete);
        dp.qtdProd();
        dp.prodVazio();
        dp.maiorPreco();
        dp.remProd(livro);
        dp.qtdProd();

    }
}
