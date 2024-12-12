# Projeto de Estudo - Busca Binária com Java

Este projeto demonstra a implementação de uma lógica de **Busca Binária** utilizando a linguagem Java. O objetivo é simular um processo de busca em um conjunto ordenado de números, gerando números aleatórios e utilizando um algoritmo de busca eficiente para encontrar um número específico.

---

## Funcionalidades Principais

1. **Geração de Números Aleatórios:**
    - O programa cria um conjunto ordenado de **128 números únicos** gerados aleatoriamente no intervalo de 0 a 128, garantindo que estejam prontos para o processo de busca binária.

2. **Busca Binária:**
    - Utiliza a lógica de divisão do intervalo para encontrar um número específico.
    - Monitora o número de iterações necessárias para encontrar o número sorteado.

3. **Validação de Dados:**
    - Garante que os números sorteados estão sempre dentro do intervalo válido.

---

## Estrutura do Código

### Classes

- **`App`**
    - Classe principal do projeto, responsável por:
        - Gerar o conjunto de números únicos.
        - Realizar a busca binária com base no número sorteado.
        - Exibir os resultados, incluindo a quantidade de iterações realizadas.

---

## Fluxo do Programa

1. **Geração do Conjunto de Números:**
    - O programa utiliza um `TreeSet` para armazenar números aleatórios e garantir sua ordenação e unicidade.
    - O loop de geração se encerra quando o conjunto atinge exatamente 128 números.

2. **Busca Binária:**
    - Calcula o valor médio (`middle`) entre os limites do intervalo.
    - Ajusta os limites (`less` e `major`) com base na comparação entre o valor médio e o número sorteado.
    - Continua até encontrar o número ou reduzir o intervalo ao menor valor.

3. **Exibição do Resultado:**
    - Exibe o número sorteado e o número de iterações realizadas para encontrá-lo.

---

## Como Executar o Projeto

1. **Clone o repositório.**

2. **Configure o ambiente Java.**
    - Certifique-se de ter o **Java 11 ou superior** instalado.

3. **Compile e execute o código.**
    - Compile o arquivo `App.java`:
      ```bash
      javac App.java
      ```
    - Execute o programa:
      ```bash
      java App
      ```

4. **Veja os resultados.**
    - O programa exibirá no console:
        - O conjunto gerado de 128 números.
        - O número sorteado.
        - O número de iterações realizadas para encontrá-lo.

---

## Tecnologias Utilizadas

- **Java 11 ou superior:** Linguagem utilizada para o desenvolvimento.
- **TreeSet:** Estrutura utilizada para garantir ordenação e unicidade.
- **Random:** Para gerar números aleatórios.
- **Busca Binária:** Algoritmo eficiente para busca em conjuntos ordenados.

---

## Autor
Lucas Degrande
