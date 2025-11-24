package br.com.aquario;

import java.util.Date;
import java.util.List;

public class AlimentadorAutomatico extends ItemAquario {

    private float quantidadeDeRacao;
    private Date horarioProximaRefeicao;

    public void alimentarAnimais(List<Animal> animais) {

        if (!ativo) {
            System.out.println("O alimentador está desligado!");
            return;
        }

        if (!estaNaHoraDeAlimentar()) {
            System.out.println("Ainda não é hora da próxima refeição!");
            return;
        }

        System.out.println("\n[Alimentador] Distribuindo ração...");

        for (Animal a : animais) {
            a.alimentar();
        }

        // Reagendar próxima refeição
        reagendarProximaRefeicao();
    }

    public boolean estaNaHoraDeAlimentar() {
        Date agora = new Date();
        return horarioProximaRefeicao != null && agora.after(horarioProximaRefeicao);
    }
    public void reagendarProximaRefeicao() {
        long oitoHoras = 8L * 60L * 60L * 1000L;
        horarioProximaRefeicao = new Date(System.currentTimeMillis() + oitoHoras);
    }

    @Override
    public String descricao() {
        return "Alimentador Automático com " + quantidadeDeRacao + "g de ração. Próxima refeição: " + horarioProximaRefeicao;
    }
    
    public float getQuantidadeDeRacao() {
        return quantidadeDeRacao;
    }
    public void setQuantidadeDeRacao(float quantidadeDeRacao) {
        this.quantidadeDeRacao = quantidadeDeRacao;
    }
    public Date getHorarioProximaRefeicao() {
        return horarioProximaRefeicao;
    }
    public void setHorarioProximaRefeicao(Date horarioProximaRefeicao) {
        this.horarioProximaRefeicao = horarioProximaRefeicao;
    }
}