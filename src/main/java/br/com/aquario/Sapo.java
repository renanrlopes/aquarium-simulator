package br.com.aquario;

public class Sapo extends Animal {
    private String corDaPele;
    private boolean venenoso;
    @Override
    public void alimentar() {
        System.out.println(nome + " está comendo insetos.");
    }
    public String getCorDaPele() {
        return corDaPele;
    }
    public void setCorDaPele(String corDaPele) {
        this.corDaPele = corDaPele;
    }
    public boolean isVenenoso() {
        return venenoso;
    }
    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
}