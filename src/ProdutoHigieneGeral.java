public class ProdutoHigieneGeral extends ProdutoHigiene{
    private boolean perfumado;
    private boolean diluir;
    private int mistureba;
    public ProdutoHigieneGeral (String nome, double preco, int marca,boolean perfumado, boolean diluir, int mistureba) {
        super(nome, preco, marca);
        this.perfumado = perfumado;
        this.diluir = diluir;
        this.mistureba = mistureba;
    }
    public ProdutoHigieneGeral (int marca, String nome,boolean perfumado, boolean diluir, int mistureba){
        super(marca,nome);
        this.perfumado = perfumado;
        this.diluir = diluir;
        this.mistureba = mistureba;
    }
    public String toString() {
        return  "\nnome do produto: " + this.getNome() +
                "\npreco do produto: " + this.getPreco() +
                "\nmarca do produto: " + this.getMarca() +
                "\no produto é perfumado: " + this.perfumado +
                "\no produto precisa ser diluido: " + this.diluir +
                "\nquantos produtos foram misturados: " + this.mistureba;
    }
    public boolean getPerfumado() {
        return this.perfumado;
    }
    public boolean getDiluir() {
        return this.diluir;
    }
    public int getMistureba() {
        return this.mistureba;
    }
    public double calcularPreco() {
        if(mistureba >= 5 && this.preco > 0) {
            return this.preco - (this.preco *3/100);
        }else{
            return this.preco + (this.preco *3/100);
        }
    }
}
