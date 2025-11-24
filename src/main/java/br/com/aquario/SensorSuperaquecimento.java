package br.com.aquario;

public class SensorSuperaquecimento extends Sensor{
    @Override
    public void atualiza(double v) {
        this.valor = v;
        if (valor > 32) {
            System.out.println("[SensorSuperaquecimento] PERIGO! Água muito quente!");
        } else if (valor > 28) {
            System.out.println("[SensorSuperaquecimento] Atenção: temperatura elevada.");
        }
    }
}