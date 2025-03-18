# DESAFIO-Modelo de domínio e ORM
Este projeto consiste em uma API REST desenvolvida com Spring Boot para gerenciar atividades, participantes e blocos de horários. A API permite cadastrar, listar e associar atividades a participantes, bem como organizar blocos de tempo para as atividades.

## 📌 Funcionalidades
- Cadastro e listagem de categorias de atividades.
- Registro de atividades com nome, descrição e preço.
- Definição de blocos de tempo para cada atividade.
- Cadastro e gerenciamento de participantes.
- Associação de participantes a atividades.

## 🚀 Tecnologias Utilizadas
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL (banco de dados relacional)
- Maven (gerenciamento de dependências)

## 🔥 Endpoints da API
### 🏷️ Categorias
🔍 Listar todas as categorias
```
GET /categorias
```
Retorna todas as categorias cadastradas.

### 🎯 Atividades
🔍 Listar todas as atividades
```
GET /atividades
```
Retorna todas as atividades disponíveis.

🔍 Buscar uma atividade por ID
```
GET /atividades/{id}
```
Retorna os detalhes completos da atividade com o ID especificado.

### ⏳ Blocos de Tempo
🔍 Listar todos os blocos
```
GET /blocos
```
Retorna todos os blocos de tempo cadastrados.

### 👥 Participantes
🔍 Listar todos os participantes
```
GET /participantes
```
Retorna todos os participantes cadastrados.

🔄 Associar um participante a uma atividade
```
POST /participantes/{participanteId}/atividades/{atividadeId}
```
Associa um participante a uma atividade específica.

## 🛠️ Como Executar o Projeto
### Pré-requisitos:
- Java 17 instalado
- Maven instalado
- MySQL configurado

### Passos para execução:
1. Clone o repositório:
   ```
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```
2. Acesse o diretório do projeto:
   ```
   cd nome-do-projeto
   ```
3. Configure o banco de dados no arquivo `application.properties`.
4. Compile e execute o projeto:
   ```
   mvn spring-boot:run
   ```

O projeto estará disponível em `http://localhost:8080`.

