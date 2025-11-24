package br.com.aquario;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("===== INICIANDO SISTEMA DE AQUÁRIOS =====\n");

        // 1) CRIANDO OS AQUÁRIOS
        AquarioAguaDoce aquarioDoce = new AquarioAguaDoce();
        AquarioAguaSalgada aquarioSalgado = new AquarioAguaSalgada();

        System.out.println("Aquários criados com sucesso.\n");

        // 2) CRIANDO ANIMAIS
        Animal peixeDoce = new Peixe();
        peixeDoce.setNome("Nemo Doce");

        Animal sapo = new Sapo();
        sapo.setNome("Sapo Verde");

        Animal peixeSalgado = new Peixe();
        peixeSalgado.setNome("Dory Salgada");

        Animal caranguejo = new Caranguejo();
        caranguejo.setNome("Sr. Sirigueijo");

        aquarioDoce.getAnimais().add(peixeDoce);
        aquarioDoce.getAnimais().add(sapo);
        aquarioSalgado.getAnimais().add(peixeSalgado);
        aquarioSalgado.getAnimais().add(caranguejo);

        System.out.println("Animais adicionados.\n");

        // 3) ADICIONANDO SENSORES (Observer)
        SensorTemperatura sensorTempDoce = new SensorTemperatura();
        SensorCongelamento sensorCongelamentoDoce = new SensorCongelamento();
        SensorSuperaquecimento sensorSuperDoce = new SensorSuperaquecimento();

        // Aquário DOCE
        aquarioDoce.getSensores().add(sensorTempDoce);
        aquarioDoce.getSensores().add(sensorCongelamentoDoce);
        aquarioDoce.getSensores().add(sensorSuperDoce);

        System.out.println("Sensores adicionados aos aquários.\n");

        // Teste dos Sensores
        System.out.println("\nTestando superaquecimento (30°C)...");
        aquarioDoce.setTemperatura(30);

        System.out.println("\nTestando SUPER superaquecimento (34°C)...");
        aquarioDoce.setTemperatura(34);

        System.out.println("\nTestando congelamento (8°C)...");
        aquarioDoce.setTemperatura(8);

        System.out.println("\nTestando congelamento extremo (3°C)...");
        aquarioDoce.setTemperatura(3);

        // 4) CRIANDO ITENS DO AQUÁRIO
        Termostato termostato = new Termostato();
        termostato.setTemperaturaAlvo(25);

        Filtro filtro = new Filtro();
        filtro.setPotencia(50);
        filtro.setAtivo(true);

        AlimentadorAutomatico alimentadorDoce = new AlimentadorAutomatico();
        alimentadorDoce.setQuantidadeDeRacao(40);
        alimentadorDoce.setAtivo(true);

        PlantaAquatica planta = new PlantaAquatica();
        planta.setCor("Verde");
        planta.setPrecisaDeLuz(true);

        Rocha rocha = new Rocha();
        rocha.setPeso(3.5f);
        rocha.setTipoRocha("Granito");

        // adicionando itens ao aquário doce
        aquarioDoce.getItens().add(termostato);
        aquarioDoce.getItens().add(filtro);
        aquarioDoce.getItens().add(alimentadorDoce);
        aquarioDoce.getItens().add(planta);
        aquarioDoce.getItens().add(rocha);

        System.out.println("Itens adicionados ao aquário doce.\n");

        // 5) TESTANDO TEMPERATURA E OBSERVER
        System.out.println("=== Testando temperatura ===");

        System.out.println("Ajustando temperatura para 8ºC (fora do ideal)...");
        aquarioDoce.setTemperatura(8);     // deve avisar que está fora do ideal
        

        System.out.println("\nTermostato regulando...");
        termostato.regularTemperatura(aquarioDoce);  // deve ajustar para 25°

        // 6) TESTANDO FILTRO
        System.out.println("\n=== Testando filtro ===");

        filtro.setNivelSujeira(40);
        filtro.filtrar();

        filtro.acumularSujeira(70);
        filtro.filtrar(); // deve avisar que está sujo demais

        // 7) TESTANDO ALIMENTAÇÃO AUTOMÁTICA
        System.out.println("\n=== Testando alimentador automático ===");

        alimentadorDoce.setHorarioProximaRefeicao(new Date(System.currentTimeMillis() + 3000));

        System.out.println("Esperando 3 segundos para a refeição...");
        Thread.sleep(3000);

        alimentadorDoce.alimentarAnimais(aquarioDoce.getAnimais());

        // 8) DESCRIÇÕES DOS ITENS
        System.out.println("\n=== Descrição dos itens do aquário ===");

        for (ItemAquario item : aquarioDoce.getItens()) {
            System.out.println(item.descricao());
        }

        // TESTANDO COMPORTAMENTO (ESTRATÉGIA) DOS ANIMAIS
        System.out.println("\n=== comportamento de nado ===");

        peixeDoce.setComportamento(new NadoRapido());
        sapo.setComportamento(new NadoLento());
        caranguejo.setComportamento(new NadoLento());
        peixeSalgado.setComportamento(new NadoRapido());

        // Executando nado de cada animal
        for (Animal a : aquarioDoce.getAnimais()) {
            System.out.print(a.getNome() + ": ");
            a.executarNado();
        }

        for (Animal a : aquarioSalgado.getAnimais()) {
            System.out.print(a.getNome() + ": ");
            a.executarNado();
        }

        System.out.println();

        System.out.println("\n===== FIM DA EXECUÇÃO =====");
    }   
}