# PROJETO SI - CLÍNICA ESTÉTICA


## **Integrantes da Equipe:**


- Aline Oliveira dos Santos
- Gustavo Lopes de Paula
- Igor Sene Idalgo
- Larissa Janine Dias
- Marcos Paulo Simoes Donizete
- Matheus Ribeiro dos Santos
- Rafael Aparecido Rodrigues
- Toni William do Prado
- Victoria Ferreira Ribeiro


## :dart: **Objetivo:**


Esse projeto está relacionado a matéria de Segurança da Informação, lecionada pelo professor Eduardo Sakaue, da Faculdade de Tecnologia de São José dos Campos - Professor Jessen Vidal.  
A fim de demonstrar a aplicação de técnicas à um banco de dados anonimizado usamos como aplicação prática uma Clínica Estética. Com o intuito de criar uma modelagem de banco ideal para a empresa se adequar às regras da Lei Geral de Proteção de Dados (LGPD), é possível realizar a anonimização dos dados sensíveis dos clientes mantendo os dados importantes para a empresa, como informações de valores e a quantidade feita de cada procedimento. Será realizado por meio de uma API que simulará este funcionamento.  
Com a finalidade de proteger os direitos e dados das pessoas, a Lei Geral de proteção de Dados é a legislação que regula a coleta, armazenamento, tratamento e compartilhamento de dados pessoais, impondo um padrão de proteção e penalidades para o descumprimento da norma. 


## **Desenvolvimento:**

Será desenvolvido uma aplicação simples CRUD com acesso ao Bancos de dados voltado à solucionar problemas de anonimização dos dados sensíveis de clientes de uma clínica de estética.
Aplicando o artigo 9º da lei LGPD , iremos trabalhar com:
- Ofuscar dados pessoais, para que dados de vendas sejam fornecidos de forma estatística, assim não tornando o portador do dado identificável.
- Criar regra de negócio, para que caso haja uma solicitação de dados pessoais, o titular do dado tenha que ser consultado para autorização.
Sabemos que a total anonimização dos dados não traz nenhum benefício para a empresa em si, mas enquanto os dados sensíveis de terceiros estiverem criptografados, este dado é considerado seguro.

Exemplo:

|  ID  |  Nome            |   Telefone           |  Agendamento  |  Valor  |
| ---- | ---------------- | -------------------- | ------------- | ------- |
|  1   |  Maria Clara     |   (12) 981375021     |    02/04/21   | 200,00  |  
|  2   |**CRIPITOGRAFADO**|   **CRIPITOGRAFADO** |  05/04/21     | 170,00  |  


## **Sprints:**

SPRINT1:
- Estudo sobre a LGPD.
- Início da modelagem do banco de dados.
- Organização do github. 


## **Tecnologias utilizadas:**
- Dbeaver
- Postgres
- BrModelo
- Vertabelo
- Eclipse/SpringTools




