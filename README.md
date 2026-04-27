# Sistema de Login e Cadastro 🔐

## Descrição
Este é um sistema de autenticação desktop desenvolvido para fornecer um fluxo seguro de **Login e Cadastro** de usuários. O projeto foi construído para demonstrar a integração de uma interface gráfica moderna com práticas robustas de segurança, como a criptografia de senhas, evitando o armazenamento de dados sensíveis em texto puro. É uma solução ideal para servir como base de controle de acesso para aplicações Java, focando em segurança e experiência do usuário.

## Funcionalidades
* **Cadastro de Usuários:** Interface intuitiva para o registro de novos usuários, com validação de dados e persistência imediata.
* **Autenticação Segura:** Sistema de login que valida as credenciais diretamente no banco de dados.
* **Criptografia com BCrypt:** As senhas são transformadas em hashes seguros antes do armazenamento, impossibilitando a leitura da senha original mesmo em caso de acesso ao banco.
* **Persistência de Dados:** Integração completa com MySQL para armazenamento duradouro das informações de perfil.
* **Feedback ao Usuário:** Alertas visuais para sucessos ou erros de login e preenchimento de campos.

## Tecnologias Utilizadas
* **Linguagem:** Java
* **Interface Gráfica:** JavaFX (utilizando FXML para uma estrutura de UI organizada)
* **Banco de Dados:** MySQL
* **Conectividade:** JDBC (Java Database Connectivity)
* **Segurança:** BCrypt (biblioteca para hashing de senhas)
* **Gerenciamento de Dependências:** Maven

## Instruções de Uso

Siga os passos abaixo para configurar e executar a aplicação na sua máquina local:

1. **Pré-requisitos:**
   * Ter o JDK (Java Development Kit) 17 ou superior instalado.
   * Ter o MySQL Server rodando localmente.
   * Maven instalado ou integrado à sua IDE.

2. **Configuração do Banco de Dados:**
   * Abra o seu cliente MySQL (ex: MySQL Workbench).
   * Crie o schema do banco de dados: `CREATE DATABASE sistema_auth;`.
   * Crie a tabela de usuários executando o seguinte comando:
     ```sql
     CREATE TABLE usuarios (
         id INT AUTO_INCREMENT PRIMARY KEY,
         nome VARCHAR(100) NOT NULL,
         email VARCHAR(100) UNIQUE NOT NULL,
         senha VARCHAR(255) NOT NULL
     );
     ```

3. **Configuração do Projeto:**
   * Clone ou baixe os arquivos deste repositório.
   * Abra o projeto em sua IDE (como IntelliJ IDEA ou Eclipse).
   * No arquivo de conexão (ex: `ConexaoJDBC.java`), atualize as credenciais de acesso com seu usuário e senha do MySQL local.

4. **Execução:**
   * Compile e baixe as dependências via Maven.
   * Execute o arquivo principal da aplicação (geralmente `Launcher.java`) para abrir a tela de Login.

## 👨‍💻 Autor

**Lucas Cardoso Bizerra** Estudante de Análise e Desenvolvimento de Sistemas (UDF) e Técnico em Desenvolvimento de Sistemas (Senac-DF).  
[LinkedIn](https://www.linkedin.com/in/seu-perfil) | [GitHub](https://github.com/lucas-cardoso)
