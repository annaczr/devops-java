public class ProdutoHigiene {
    private String nome;
    double preco;
    int marca;
    public ProdutoHigiene (String nome, double preco, int marca) {
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
    }
    public ProdutoHigiene (int marca,String nome) {
        this.nome = nome;
        this.marca = marca;
    }
    public String toString() {
       return  "\nnome do produto: " + this.nome +
               "\npreco do produto: " + this.preco +
               "\nmarca do produto: " + this.marca;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return this.preco;
    }
    public int getMarca() {
        return this.marca;
    }
    public void setMarca(int marca) {
        this.marca = marca;
    }
    public double calcularPreco(int inflacao) {
        if (marca == 1) {
            return this.preco + (this.preco *inflacao/100);
        }else {
            return this.preco;
        }
    }

    public double calcularPreco() {
        if (marca == 1) {
            return this.preco + (this.preco *10/100);
        }else {
            return this.preco;
        }
    }
}
