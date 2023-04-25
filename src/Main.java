public class Main {
    public static void main(String[] args) {
        ProdutoHigiene produto = new ProdutoHigiene("popo",20.0,2);
        System.out.println(produto.toString());
        ProdutoHigienePessoal produtoPessoal = new ProdutoHigienePessoal("popo",20.0,2,4,true,'f');
        System.out.println(produtoPessoal.toString());
        ProdutoHigieneGeral produtoGeral = new ProdutoHigieneGeral("popo",20.0,2,false,true,5);
        System.out.println(produtoGeral.toString());
    }
}