Projeto de Gerenciamento de Clientes – Arquitetura Hexagonal & Clean Architecture
---

**🚀 Visão Geral**
  
Este projeto é uma API RESTful para o gerenciamento de clientes, representando uma evolução significativa do projeto anterior (spring-boot-cadastro-clientes). Seu principal diferencial é a aplicação rigorosa de princípios avançados de design de software: Arquitetura Hexagonal (Ports and Adapters) e Clean Architecture.

---

**✨ Conceitos Arquiteturais Aplicados**


**Arquitetura Hexagonal (Ports and Adapters)**
* Isolamento: A lógica de negócio (domain) está isolada das tecnologias externas.
* Portas (application.port.in / application.port.out): Interfaces que definem como o domínio interage com o mundo exterior.
* Adaptadores (adapters.in.web / adapters.out.persistence): Implementações concretas que traduzem as interações entre o domínio e tecnologias como Web (Spring Boot) ou Persistência (JPA/MySQL).

**Clean Architecture**
* Camadas Concêntricas: O código é organizado em camadas, onde as dependências fluem apenas para dentro.
* Domínio no Centro (domain): Contém as regras de negócio puras, independentes de qualquer framework.
* Casos de Uso (application): Orquestram o fluxo de dados e aplicam as regras de negócio específicas da aplicação.

---

**✨ Funcionalidades da API**

A API oferece os seguintes endpoints CRUD para gerenciamento de clientes:

* POST /clientes: Cria um novo cliente. (201 Created)
* GET /clientes: Retorna todos os clientes. (200 OK)
* GET /clientes/{id}: Retorna um cliente por ID. (200 OK ou 404 Not Found)
* PUT /clientes/{id}: Atualiza um cliente por ID. (200 OK ou 404 Not Found)
* DELETE /clientes/{id}: Remove um cliente por ID. (204 No Content ou 404 Not Found)

---

**🛠️ Tecnologias Utilizadas**

* Java ☕ (JDK 17+)
* Spring Boot 🌱
* Spring Data JPA & Hibernate 🧑‍💻
* MySQL
* Maven
* Bean Validation
* Lombok
* JUnit & Mockito (para testes)
* Postman (para testes da API)
