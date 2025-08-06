# 🚀 Web Services com Spring Boot e JPA / Hibernate

Este projeto é uma API RESTful desenvolvida em **Java com Spring Boot**, com foco em operações de CRUD, estruturação em camadas e persistência de dados utilizando **JPA / Hibernate**.

---

## 📌 Sobre o Projeto

- Criação de um projeto Spring Boot Java;
- Implementação de um modelo de domínio com entidades relacionadas;
- Estruturação da aplicação nas camadas: **Resource**, **Service** e **Repository**;
- Configuração de um banco de dados de teste usando **H2**;
- Povoação automatica do banco de dados com dados de exemplo;
- Implementação de operações **CRUD (Create, Retrieve, Update, Delete)**;
- Aplicação de **tratamento de exceções** com respostas padronizadas.

---

## 🛠️ Tecnologias Utilizadas

- Java 17+  
- Spring Boot  
- Spring Data JPA / Hibernate  
- Banco de Dados H2  
- Maven  
- REST APIs com JSON  
- Postman (para testes de requisições)

---

## 🧱 Modelo de Domínio

O sistema simula um pequeno **e-commerce**, com as seguintes entidades:

- `User` (Usuário)
- `Order` (Pedido)
- `Product` (Produto)
- `Category` (Categoria)
- `OrderItem` (Item do Pedido)
- `Payment` (Pagamento)

As relações entre essas entidades são configuradas com **anotações JPA**, como `@OneToMany`, `@ManyToMany`, `@ManyToOne`, entre outras.

---

## ▶️ Como Executar o Projeto

1. Clone o repositório:
   git clone https://github.com/Romulo567/workshop-springboot-jpa.git

2. Entrar na pasta do projeto:
   cd workshop-springboot-jpa

3. Compile o projeto:
   ./mvnw clean install

4. Execute a aplicação:
   ./mvnw spring-boot:run
