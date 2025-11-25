# 🐠 Sistema de Aquários -- Projeto Java

### Padrões de Projeto: **Observer** e **Strategy**

Este projeto implementa um sistema de controle para aquários, utilizando
os padrões de projeto **Observer** (para monitoramento de temperatura) e
**Strategy** (para comportamento de nado dos animais).\
O objetivo é simular sensores, itens do aquário e o comportamento dos
animais de forma modular e extensível.

<<<<<<< HEAD
=======
------------------------------------------------------------------------

## 📌 **1. Funcionalidades Principais**

### ✔ Monitoramento de Temperatura (Observer)

Cada aquário possui sensores que "observam" mudanças de temperatura.\
Sempre que a temperatura muda, todos os sensores cadastrados recebem a
notificação e reagem de forma diferente:

-   **SensorTemperatura** → Apenas exibe a nova temperatura\
-   **SensorCongelamento** → Detecta risco de água muito fria\
-   **SensorSuperaquecimento** → Detecta risco de calor extremo

------------------------------------------------------------------------

### ✔ Comportamento dos Animais (Strategy)

Animais possuem um comportamento de nado que pode ser trocado em tempo
de execução:

-   **NadoLento**
-   **NadoRapido**

Exemplo:

``` java
animal.setComportamento(new NadoRapido());
animal.executarNado();
```

------------------------------------------------------------------------

### ✔ Itens do Aquário

-   Termostato\
-   Filtro\
-   Alimentador Automático\
-   Plantas aquáticas\
-   Rochas

Cada item possui funções específicas e pode ser descrito via método
`descricao()`.

------------------------------------------------------------------------

## 📌 **2. Estrutura do Projeto**

    br/com/aquario/
    │
    ├── Animal.java
    ├── Peixe.java
    ├── Sapo.java
    ├── Caranguejo.java
    ├── ComportamentoNado.java
    ├── NadoLento.java
    ├── NadoRapido.java
    │
    ├── Sensor.java
    ├── SensorTemperatura.java
    ├── SensorCongelamento.java
    ├── SensorSuperaquecimento.java
    │
    ├── Aquario.java
    ├── AquarioAguaDoce.java
    ├── AquarioAguaSalgada.java
    │
    ├── Termostato.java
    ├── Filtro.java
    ├── AlimentadorAutomatico.java
    ├── PlantaAquatica.java
    ├── Rocha.java
    │
    └── Main.java

------------------------------------------------------------------------

## 📌 **3. Como executar**

### 1️⃣ Clonar o repositório:

    git clone https://github.com/seu-usuario/seu-repositorio.git

### 2️⃣ Abrir em qualquer IDE Java

IntelliJ, Eclipse, NetBeans ou VSCode com suporte Java.

### 3️⃣ Executar a classe `Main`.

------------------------------------------------------------------------

## 📌 **4. Padrões de Projeto Aplicados**

### 🔵 Observer

Sensores notificam automaticamente quando a temperatura muda.

### 🟢 Strategy

Permite alterar o comportamento de nado dos animais dinamicamente.

------------------------------------------------------------------------

## 📌 **5. Objetivo do Projeto**

Demonstrar:

-   Polimorfismo\
-   Encapsulamento\
-   Baixo acoplamento\
-   Uso de padrões de projeto\
-   Boas práticas de organização de código

------------------------------------------------------------------------

## 📌 **6. Autor**

**Renan Rodrigues Lopes**\
Projeto para disciplina de **Programação Orientada a Objetos**.
>>>>>>> 77115fd5a3106e4b1898a5203ab677a18db7ca5e
