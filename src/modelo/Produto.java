package modelo;

public class Produto {
    
    private String nome;
    private int codigo;
    private float valor;
    private int estoque;

    public Produto() {
    }

    public Produto(String nome, int codigo, float valor, int estoque){
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
        this.estoque = estoque;
    }

    /*public Produto(String string, String string2, String string3, String string4) {
    }

    public Produto(int pcodigo, String pnome, float pvalor, int pestoque) {
    }*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public boolean contains(int busca) {
        return false;
    }


}
