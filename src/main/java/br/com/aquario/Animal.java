package br.com.aquario;

public abstract class Animal {
    protected String nome;
    private double tamanho;
    private double peso;
    private int idade;
    private String especie;
    private ComportamentoNado comportamento;

    public void executarNado() {
        if (comportamento != null)
            comportamento.nadar();
    }

    public void setComportamento(ComportamentoNado comportamento) {
        this.comportamento = comportamento;
    }

    public abstract void alimentar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public ComportamentoNado getComportamento() {
        return comportamento;
    }
}
