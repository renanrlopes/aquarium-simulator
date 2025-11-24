package br.com.aquario;

public class AquarioAguaSalgada extends Aquario{
    public static double TEMP_MIN = 24;
    public static double TEMP_MAX = 30;
    @Override
    public void setTemperatura(double temperatura) {
        super.setTemperatura(temperatura);
        if (temperatura < TEMP_MIN || temperatura > TEMP_MAX) {
            System.out.println("Temperatura fora do ideal para Água Salgada!");
        }
    }
}


