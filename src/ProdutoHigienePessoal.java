public class ProdutoHigienePessoal extends ProdutoHigiene{
    private int perfume;
    private boolean importado;
    private char femmasc;
    public ProdutoHigienePessoal (String nome, double preco, int marca,int perfume, boolean importado, char femmasc) {
        super(nome, preco, marca);
        this.perfume = perfume;
        this.importado = importado;
        this.femmasc = femmasc;
    }
    public ProdutoHigienePessoal (int marca, String nome,int perfume, boolean importado, char femmasc){
        super(marca,nome);
        this.perfume = perfume;
        this.importado = importado;
        this.femmasc = femmasc;
    }
    public String toString() {
        return  "\nnome do produto: " + this.getNome() +
                "\npreco do produto: " + this.getPreco() +
                "\nmarca do produto: " + this.getMarca()+
                "\nquão perfumado é o produto: " + this.perfume +
                "\no produto é importado: " + this.importado +
                "\no produto é feminino ou masculino" + this.femmasc;
    }
    public int getPerfume() {
        return perfume;
    }
    public boolean getImportado() {
        return this.importado;
    }
    public char getFemmasc() {
        return this.femmasc;
    }
    public double calcularPreco() {
        if (this.femmasc == 'f') {
            return this.preco + (this.preco *3/100);
        }else{
            return this.preco;
        }
    }
}
