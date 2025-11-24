package br.com.aquario;

public class SensorTemperatura extends Sensor{
    @Override
    public void atualiza(double v) {
        this.valor = v;
        System.out.println("[SensorTemperatura] Agora a temperatura é: " + valor);
    }
}