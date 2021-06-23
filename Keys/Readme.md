# Requisitos mínimos
SpringToolSuite4

Postgress

# Instalação

## Clonar o repositório
git clone https://github.com/linemarquart/projetosi_clinica_estetica.git

## Criar um banco de dados postgress para a conecção

Com o SprintToolSuite aberto abrir o arquivo projetosi_clinica_estetica\Clinica\src\main\resources\application.properties

Alterar a ultima palavra da linha 10 para o nome do banco criado e colocar na linha 12 a senha do banco 

Feito isso trocar na linha 8 de '_none_' para '_create_' 

Clicar com o botão direito no provejeto Run As > Maven install

Após a instalação do projeto ele vai criar automaticamente as tabelas no banco e vai iniciar o servidor

Fazer a mudança novamente em application.properties na linha 8 de '_create_' para '_none_'

## O arquivo deve ficar assim 

```
spring.profiles.active=dev
profile.api=http://localhost:8080/
server.port=8080

spring.jpa.database=POSTGRESQL
spring.datasource.platform=postgres
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=none
spring.datasource.driver-class-name=org.postgresql.Driver
spring.datasource.url=jdbc:postgresql://localhost:5432/{Nome-do-banco}
spring.datasource.username=postgres
spring.datasource.password={senha-do-banco}
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
spring.jpa.properties.hibernate.dialect = org.hibernate.spatial.dialect.postgis.PostgisDialect
spring.security.user.name=admin
spring.security.user.password=admin123
```
