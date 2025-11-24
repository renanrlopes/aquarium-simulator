package br.com.aquario;

public class AquarioAguaDoce extends Aquario {

    public static double TEMP_MIN = 22;
    public static double TEMP_MAX = 28;

    @Override
    public void setTemperatura(double temperatura) {
        super.setTemperatura(temperatura);
        if (temperatura < TEMP_MIN || temperatura > TEMP_MAX) {
            System.out.println("Temperatura fora do ideal para Água Doce!");
        }
    }
}


//Termostato → altera temperatura

//Aquario (classe base) → salva a nova temperatura e notifica sensores

//Subclasse (Doce/Salgada) → valida se está no intervalo ideal