# Env-Config-Manager

[![License](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)
[![Java](https://img.shields.io/badge/Java-11%2B-blue.svg)](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html)

Env-Config-Manager é um aplicativo Java simples que carrega e gerencia configurações de diferentes ambientes (desenvolvimento e produção) usando arquivos JSON. Este projeto visa facilitar a separação de configurações específicas do ambiente para desenvolvedores.

## Funcionalidades

- Carregamento dinâmico de configurações baseado no ambiente.
- Suporte para múltiplos arquivos de configuração (desenvolvimento e produção).
- Leitura e parse de arquivos JSON.
- Simplicidade e facilidade de uso.

## Estrutura do Projeto
```
Env-Config-Manager/
├── src/
│ └── main/
│ └── java/
│ └── com/
│ └── example/
│ └── MyApp/
│ ├── Config.java
│ └── Main.java
├── config/
│ ├── config.development.json
│ └── config.production.json
├── .env
├── .gitignore
└── pom.xml
```

## Pré-requisitos

- Java 11 ou superior
- Maven

## Instalação

1. Clone o repositório:

    ```sh
    git clone https://github.com/aron-alvarenga/Env-Config-Manager.git
    cd Env-Config-Manager
    ```

2. Configure o ambiente:

    No arquivo `.env` na raiz do projeto, defina o ambiente:

    ```env
    ENV=development
    ```

    Você pode mudar o valor para `production` quando necessário.

3. Adicione as configurações de ambiente nos arquivos JSON no diretório `config/`:

    - `config.development.json`
    - `config.production.json`

## Uso

1. Compile e instale as dependências do projeto usando Maven:

    ```sh
    mvn clean install
    ```

2. Execute o projeto:

    ```sh
    mvn exec:java -Dexec.mainClass="Main"
    ```

    A saída mostrará as configurações de acordo com o ambiente definido.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests para melhorar este projeto.

## Contato

Criado por [Aron Alvarenga](https://www.linkedin.com/in/aron-alvarenga/) - Entre em contato!

---

Feito com ❤️ por [Aron Alvarenga](https://github.com/aron-alvarenga)
