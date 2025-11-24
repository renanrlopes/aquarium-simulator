package br.com.aquario;

public class PlantaAquatica extends ItemAquario{
    private String cor; 
    private boolean precisaDeLuz;

    @Override
    public String descricao() {
        return "Planta Aquática - cor: " + cor + ", precisa de luz: " + (precisaDeLuz ? "sim" : "não");
    } 

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public boolean isPrecisaDeLuz() {
        return precisaDeLuz;
    }
    public void setPrecisaDeLuz(boolean precisaDeLuz) {
        this.precisaDeLuz = precisaDeLuz;
    }
}
