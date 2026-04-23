# 🔐 Sistema de Login e Cadastro - JavaFX, JDBC & BCrypt

Este projeto é uma aplicação desktop desenvolvida em Java para gerenciar processos de autenticação. O diferencial deste sistema é o foco em **segurança da informação**, utilizando técnicas modernas de hashing para proteção de credenciais.

## 🚀 Tecnologias e Ferramentas

* **Java 17+**: Linguagem de programação principal.
* **JavaFX & Scene Builder**: Framework e ferramenta visual para criação da interface (GUI).
* **JDBC**: API para persistência de dados e comunicação com o banco de dados.
* **BCrypt**: Biblioteca de hashing utilizada para a criptografia de senhas antes do armazenamento.
* **IntelliJ IDEA**: Ambiente de desenvolvimento.

## 🛡️ Segurança (BCrypt)

Diferente de sistemas simples, esta aplicação prioriza a segurança do usuário:
* **Hashing de Senha**: As senhas nunca são armazenadas em texto puro no banco de dados.
* **Salting Automático**: O BCrypt gera um "salt" aleatório para cada senha, protegendo contra ataques de dicionário e Rainbow Tables.
* **Verificação Segura**: A autenticação compara o hash armazenado com o input do usuário de forma segura.

## 🛠️ Funcionalidades

* **Cadastro Seguro**: O sistema recebe a senha, gera o hash via BCrypt e salva apenas o resultado no banco.
* **Login Validado**: Comparação entre o texto digitado e o hash recuperado via JDBC.
* **Design Minimalista**: Interface limpa e profissional, mantendo o foco na usabilidade.

## 📋 Como Executar

1.  **Dependência BCrypt**: Certifique-se de que a biblioteca (como `jBcrypt` ou similar) está adicionada ao seu `pom.xml` ou `build.gradle`, ou como `.jar` no projeto.
2.  **Banco de Dados**:
    * Certifique-se de que a coluna `senha` no seu banco de dados tenha tamanho suficiente (recomenda-se `VARCHAR(60)` ou mais) para suportar o hash do BCrypt.
3.  **Configuração JDBC**:
    * Ajuste as credenciais na sua classe de conexão no IntelliJ.

## 👨‍💻 Autor

**Lucas Cardoso Bizerra** Estudante de Análise e Desenvolvimento de Sistemas (UDF) e Técnico em Desenvolvimento de Sistemas (Senac-DF).  
[LinkedIn](https://www.linkedin.com/in/seu-perfil) | [GitHub](https://github.com/lucas-cardoso)
