package br.com.aquario;

public abstract class ItemAquario {
    private String nome;
    private String tipo;
    private double tamanho;
    protected boolean ativo;
    public void ativar() {
        ativo = true;
    }
    public void desativar() {
        ativo = false;
    }
    public abstract String descricao();
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getTamanho() {
        return tamanho;
    }
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    public boolean isAtivo() {
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}

