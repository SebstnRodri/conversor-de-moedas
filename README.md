# Conversor de Moeda e Temperatura

## Descrição

Este projeto é um conversor de moeda e temperatura desenvolvido como parte do Desafio Oracle ONE (Oracle Next Education). Ele permite que os usuários realizem conversões de moeda entre diferentes moedas e conversões de temperatura entre diferentes escalas.

## Funcionalidades

- Conversão de Moeda:
  - Conversão entre várias moedas (BRL, USD, EUR, GBP, ARS, CLP)
  - Taxas de câmbio em tempo real
  - Interface amigável
- Conversão de Temperatura:
  - Celsius para Fahrenheit
  - Fahrenheit para Celsius
  - Celsius para Kelvin
  - Kelvin para Celsius
  - Fahrenheit para Kelvin
  - Kelvin para Fahrenheit

## Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos
- Api Externa (ExchangeRate-Api)

## Pré-requisitos

- Java Development Kit (JDK) 11 superior
- IDE (Eclipse, IntelliJ, ou NetBeans)

## Instalação

1. Clone este repositório:

```bash
git clone [repository-url]
```

2. Abra o projeto em sua IDE preferida
3. Compile e execute a aplicação

## Como Usar

1. Inicie a aplicação
2. Escolha o tipo de conversão (Moeda ou Temperatura)
3. Selecione as unidades de entrada e saída
4. Digite o valor a ser convertido
5. Clique em "Converter" para ver o resultado

## Estrutura do Projeto

```
src/
├── main/
│   ├── converter/
│   │   ├── CurrencyConverter.java
│   │   └── TemperatureConverter.java
│   ├── gui/
│   │   └── ConverterGUI.java
│   └── Main.java
```

## Contribuindo

Este projeto é parte de um desafio de aprendizado. Embora não esteja aberto para contribuições diretas, sinta-se à vontade para fazer um fork e adaptá-lo para seus próprios propósitos de aprendizado.

## Licença

Este projeto está licenciado sob a Licença MIT - consulte o arquivo LICENSE para obter detalhes.

## Agradecimentos

- Oracle Next Education
- Alura
