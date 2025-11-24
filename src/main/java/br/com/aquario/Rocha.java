package br.com.aquario;

public class Rocha extends ItemAquario{
    private float peso;
    private String tipoRocha;
    
    @Override
    public String descricao() {
        return "Rocha - tipo: " + tipoRocha + ", peso: " + peso + " kg";
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getTipoRocha() {
        return tipoRocha;
    }

    public void setTipoRocha(String tipoRocha) {
        this.tipoRocha = tipoRocha;
    } 
}