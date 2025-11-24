package br.com.aquario;

public class Caranguejo extends Animal {
    private boolean possuiGarras;
    private float velocidadeEmTerra;
    @Override
    public void alimentar() {
        System.out.println(nome + " está comendo restos do fundo do aquário.");
    }
    public boolean isPossuiGarras() {
        return possuiGarras;
    }
    public void setPossuiGarras(boolean possuiGarras) {
        this.possuiGarras = possuiGarras;
    }
    public float getVelocidadeEmTerra() {
        return velocidadeEmTerra;
    }
    public void setVelocidadeEmTerra(float velocidadeEmTerra) {
        this.velocidadeEmTerra = velocidadeEmTerra;
    }   
}