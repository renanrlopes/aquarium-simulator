package br.com.aquario;

public class Filtro extends ItemAquario {

    private float potencia;      // 50
    private float nivelSujeira;  // 0 a 100

    public void filtrar() {

        if (!ativo) {
            System.out.println("O filtro está desligado!");
            return;
        }

        if (nivelSujeira >= 100) {
            System.out.println("O filtro está muito sujo e não consegue filtrar!");
            return;
        }

        System.out.println("[Filtro] Filtrando água...");

        float eficiencia = (100 - nivelSujeira) / 100f;

        float sujeiraRemovida = potencia * 0.1f * eficiencia;

        nivelSujeira -= sujeiraRemovida;
        if (nivelSujeira < 0) nivelSujeira = 0;

        System.out.println("[Filtro] Sujeira restante no filtro: " + nivelSujeira + "%");
    }

    // O filtro acumula sujeira com o tempo
    public void acumularSujeira(float quantidade) {
        nivelSujeira += quantidade;
        if (nivelSujeira > 100) nivelSujeira = 100;
    }

    // Limpar o filtro manualmente
    public void limparFiltro() {
        this.nivelSujeira = 0;
        System.out.println("[Filtro] Filtro limpo!");
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public float getNivelSujeira() {
        return nivelSujeira;
    }
    public void setNivelSujeira(float nivelSujeira) {
        this.nivelSujeira = nivelSujeira;
    }
    @Override
    public String descricao() {
        return "Filtro (potência " + potencia + ") - nível de sujeira atual: " + nivelSujeira + "%";
    }
}
