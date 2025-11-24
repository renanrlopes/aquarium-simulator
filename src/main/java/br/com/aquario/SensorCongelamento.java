package br.com.aquario;

public class SensorCongelamento extends Sensor{
    @Override
    public void atualiza(double v) {
        this.valor = v;
        if (valor < 5) {
            System.out.println("[SensorCongelamento] ALERTA: Água está quase congelando!");
        } else if (valor < 10) {
            System.out.println("[SensorCongelamento] Água muito fria para os animais.");
        };
    }
}