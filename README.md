# Calculadora Financeira em Java

> Um simulador de crescimento patrimonial que projeta aportes mensais e juros compostos ao longo dos anos.

## Visão geral

A **Calculadora-Financeira-Java** é uma aplicação de console que recebe valor inicial, aporte mensal, taxa anual e prazo em anos. Em seguida, calcula a evolução do montante mês a mês e exibe o acumulado ao final de cada ano. O projeto é uma introdução prática a entrada de dados, métodos, laços de repetição e fórmulas financeiras em **Java**.[1]

| Arquivo | Responsabilidade |
|---|---|
| `src/Main.java` | Lê os dados do usuário e inicia o cálculo. |
| `src/CalculadoraFinanceira.java` | Contém a regra de projeção financeira. |

## Fórmula aplicada

A cada mês, o programa soma o aporte mensal ao montante e aplica a taxa mensal equivalente à taxa anual informada.

```text
montante = (montante + aporteMensal) × (1 + taxaMensal)
```

## Como executar

```bash
git clone https://github.com/uliguimaraes/Calculadora-Financeira-Java.git
cd Calculadora-Financeira-Java
javac src/*.java
java -cp src Main
```

## Exemplo de uso

| Entrada | Exemplo |
|---|---:|
| Valor inicial | R$ 1.000,00 |
| Aporte mensal | R$ 200,00 |
| Taxa anual | 12% |
| Tempo | 5 anos |

O resultado apresenta uma projeção anual e o total acumulado, tornando o programa útil para visualizar o efeito dos aportes recorrentes.

## Referências

[1]: https://docs.oracle.com/en/java/ "Java documentation"
