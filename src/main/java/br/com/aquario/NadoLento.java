package br.com.aquario;

public class NadoLento implements ComportamentoNado{
    @Override
    public void nadar() {
        System.out.println("Nadando lentamente...");
    }
}