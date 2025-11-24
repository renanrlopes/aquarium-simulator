package br.com.aquario;

public class Peixe extends Animal{
    private String tipoDePeixe;
    private String cor;
    @Override
    public void alimentar() {
        System.out.println(nome + " está comendo ração de peixe.");
    }
    public String getTipoDePeixe() {
        return tipoDePeixe;
    }
    public void setTipoDePeixe(String tipoDePeixe) {
        this.tipoDePeixe = tipoDePeixe;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    
}