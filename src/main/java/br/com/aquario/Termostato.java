package br.com.aquario;

public class Termostato extends ItemAquario{
    private float temperaturaAtual;
    private float temperaturaAlvo;

    public void regularTemperatura(Aquario aquario) {
        this.temperaturaAtual = (float) aquario.getTemperatura();
        if (temperaturaAtual < temperaturaAlvo) {
            System.out.println("Aquecendo o aquário...");
        } else if (temperaturaAtual > temperaturaAlvo) {
            System.out.println("Resfriando o aquário...");
        } else {
            System.out.println("Temperatura ideal alcançada.");
        }
        aquario.setTemperatura(temperaturaAlvo);
    }

    @Override
    public String descricao() {
        return "Termostato - temperatura atual: " + temperaturaAlvo;
    }

    public float getTemperaturaAtual() {
        return temperaturaAtual;
    }
    public void setTemperaturaAtual(float temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }
    public float getTemperaturaAlvo() {
        return temperaturaAlvo;
    }
    public void setTemperaturaAlvo(float temperaturaAlvo) {
        this.temperaturaAlvo = temperaturaAlvo;
    }

    
}
