# Simple Banking System - README

Este projeto em Java implementa um sistema bancário básico, permitindo a criação de clientes e contas bancárias com diferentes tipos de conta, como Conta Corrente, Conta Depósito, Conta Poupança e Conta Salário. O objetivo é fornecer uma estrutura flexível para gerenciar informações de clientes e contas, realizar transações bancárias simples e demonstrar a funcionalidade de upgrade de clientes.

## Funcionalidades

O projeto fornece as seguintes funcionalidades:

- Leitura de informações do cliente e tipo de conta a partir de um arquivo de entrada.
- Criação de instâncias de clientes com base nas informações fornecidas.
- Criação de instâncias de contas bancárias correspondentes ao tipo de conta selecionado.
- Impressão das informações do cliente e da conta criada no console.
- Escrita das informações do cliente e da conta criada em um arquivo de saída.
- Possibilidade de solicitar o upgrade do cliente para uma classe superior (Gold para Platinum ou Platinum para Black).
- Demonstração de operações bancárias básicas, como depósito, saque e consulta de extrato.

## Requisitos

Certifique-se de ter os seguintes requisitos instalados em seu ambiente de desenvolvimento:

- Java Development Kit (JDK) 8 ou superior
- IDE Java de sua preferência (por exemplo, Eclipse, IntelliJ IDEA)

## Como executar o projeto

Siga as etapas abaixo para executar o projeto em sua máquina local:

1. Faça o download ou clone o repositório do projeto.

2. Abra o projeto em sua IDE Java.

3. Certifique-se de que as dependências necessárias estejam configuradas corretamente.

4. Execute a classe `App.java` localizada em `src/App.java`.

5. O programa solicitará um arquivo de entrada chamado `input.txt`. Certifique-se de que esse arquivo esteja presente no mesmo diretório do arquivo `App.java`. Você pode personalizar as informações do cliente e da conta no arquivo `input.txt`, seguindo o formato fornecido no arquivo de exemplo.

6. O programa lerá as informações do arquivo de entrada, criará uma instância de cliente e uma instância de conta com base nas informações fornecidas e exibirá as informações no console.

7. O programa também criará um arquivo de saída chamado `output.txt` no mesmo diretório, contendo as informações do cliente e da conta.

8. Verifique o console para obter informações adicionais sobre a execução do programa, incluindo demonstrações de upgrade e operações bancárias.

## Estrutura do projeto

O projeto possui a seguinte estrutura de diretórios e arquivos:

```
├── App.java
├── cliente
│   ├── Black.java
│   ├── Cliente.java
│   ├── Gold.java
│   └── Platinum.java
└── conta
    ├── Conta.java
    ├── ContaCorrente.java
    ├── ContaDeposito.java
    ├── ContaPoupança.java
    └── ContaSalário.java

```

- O arquivo `App.java` contém a classe principal do projeto, responsável por ler o arquivo de entrada, criar

 instâncias de clientes e contas, realizar operações bancárias e gerar o arquivo de saída.
- O diretório `cliente` contém as classes que representam os diferentes tipos de clientes (Black, Gold e Platinum).
- O diretório `conta` contém as classes que representam os diferentes tipos de contas bancárias (Conta, ContaCorrente, ContaDeposito, ContaPoupança e ContaSalário).
- O arquivo `input.txt` é usado para fornecer as informações do cliente e da conta para o programa.
- O arquivo `output.txt` é gerado pelo programa e contém as informações do cliente e da conta.

## Contribuindo

Sinta-se à vontade para contribuir com melhorias para este projeto. Você pode enviar pull requests com suas modificações, correções de bugs ou novas funcionalidades. Será um prazer revisar suas contribuições e mesclá-las ao projeto principal.

## Licença

Este projeto é licenciado sob a licença [MIT](https://opensource.org/licenses/MIT). Sinta-se à vontade para usá-lo, modificá-lo e distribuí-lo de acordo com os termos da licença.

## Contato

Se você tiver alguma dúvida, sugestão ou preocupação relacionada a este projeto, sinta-se à vontade para entrar em contato. Você pode me alcançar por e-mail ou abrir uma nova issue no repositório do projeto.

E-mail: feliperr.dev@gmail.com

---
