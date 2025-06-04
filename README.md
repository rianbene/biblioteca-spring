# Biblioteca Digital - Spring Boot

Projeto de exemplo para aprender Spring Boot com:
- Spring MVC
- Thymeleaf
- Spring Data JDBC
- Banco de dados H2
- APIs REST
- DTOs

## Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/rianbene/estudos-spring-boot.git
```
2. Execute o projeto com Maven:
```bash
mvn spring-boot:run
```
3. Acesse no navegador:

Lista de livros: http://localhost:8080/livros

Console H2: http://localhost:8080/h2-console (JDBC URL: jdbc:h2:mem:testdb)

## Estrutura do Projeto
```
src/main/java/
└── com/exemplo/biblioteca/
    ├── controller/    # Controladores MVC/REST
    ├── service/       # Lógica de negócio
    ├── model/         # Entidades de domínio
    └── dto/           # Data Transfer Objects

src/main/resources/
├── templates/         # Views Thymeleaf
├── static/            # Assets estáticos (CSS, JS)
└── application.properties
```