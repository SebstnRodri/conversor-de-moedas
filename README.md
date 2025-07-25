# Conversor de Moeda e Temperatura

## Descrição

Este projeto é um conversor de moeda desenvolvido como parte do Desafio Oracle ONE (Oracle Next Education). Ele permite que os usuários realizem conversões de moeda entre diferentes moedas utilizando taxas de câmbio em tempo real.

## Funcionalidades

- Conversão de Moeda:
  - Conversão entre várias moedas (BRL, USD, EUR, GBP, ARS, CLP)
  - Taxas de câmbio em tempo real
  - Interface amigável

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
2. Selecione as unidades de entrada e saída
3. Digite o valor a ser convertido
4. Clique em "Converter" para ver o resultado

### Diagrama de Fluxo do Sistema

```mermaid
flowchart TD
    User[Usuário] -->|Entra com dados e escolhe opção| Main[Main.java]
    Main -->|Solicita conversão| Currency[CurrencyConverter.java]
    Currency -->|Solicita taxa de câmbio| Api[ExchangeRateApiClient.java]
    Api -->|Retorna taxa| Currency
    Currency -->|Retorna valor convertido| Main
    Main -->|Exibe resultado| User

```

## Contribuindo

Este projeto é parte de um desafio de aprendizado. Embora não esteja aberto para contribuições diretas, sinta-se à vontade para fazer um fork e adaptá-lo para seus próprios propósitos de aprendizado.

## Licença

Este projeto está licenciado sob a Licença MIT - consulte o arquivo LICENSE para obter detalhes.

## Agradecimentos

- Oracle Next Education
- Alura
