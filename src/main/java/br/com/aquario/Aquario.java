package br.com.aquario;

import java.util.ArrayList;
import java.util.List;

public class Aquario {
    private List<Animal> animais = new ArrayList<>();
    private List<ItemAquario> itens = new ArrayList<>();
    private List<Sensor> sensores = new ArrayList<>();
    protected double temperatura;

    protected void notifica(double v) {
        for (Sensor s : sensores) {
            s.atualiza(v);
        }
    }
    // ===== TEMPERATURA NO SUJEITO PRINCIPAL =====
    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        notifica(temperatura);   // OBSERVER: notifica os Sensores
    }
    
    public List<Animal> getAnimais() {
        return animais;
    }

    public List<ItemAquario> getItens() {
        return itens;
    }

    public List<Sensor> getSensores() {
        return sensores;
    }
}