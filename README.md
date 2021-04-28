# PROJETO SI - CLÍNICA ESTÉTICA


## :large_blue_circle: **Integrantes da Equipe:**


- Aline Oliveira dos Santos
- Gustavo Lopes de Paula
- Igor Sene Idalgo
- Larissa Janine Dias
- Marcos Paulo Simoes Donizete
- Matheus Ribeiro dos Santos
- Toni William do Prado
- Victoria Ferreira Ribeiro


## :computer: **LGPD:**

A Lei Geral de Proteção de Dados tem como objetivo oferecer mais segurança sobre o uso de dados pessoais, garantindo maior controle e privacidade dos dados de pessoas físicas ou jurídicas. Ela é a legislação que regula a coleta, armazenamento, tratamento e compartilhamento de dados pessoais, impondo um padrão de proteção e penalidades para o descumprimento da norma.   
Um bom exemplo são os termos de uso, aqueles textos enormes e que todo mundo aceita sem ler. Com ela em vigor, eles terão de ser muito mais curtos e claros, com a necessidade de especificar para que servem os dados solicitados.  
As multas para descumprimento da lei estão previstas para serem aplicadas a partir de agosto de 2021, portanto esta adequação agora passa a ser uma prioridade imediata!  
As empresas não só precisam adequar seus processos com ferramentas de gestão e tecnologias, mas também passar segurança para o consumidor e evitar multas dolorosas.  



## :dart: **Objetivo:**
 
A fim de demonstrar a importância da adaptação de um banco de dados dentro da LGPD, usamos como aplicação prática uma Clínica de Estética.  
Com o intuito de criar uma modelagem de banco ideal para a empresa se adequar às regras da Lei Geral de Proteção de Dados, é possível realizar a anonimização dos dados sensíveis dos clientes mantendo os dados importantes para a empresa, como informações de valores e a quantidade feita de cada procedimento. Será realizado por meio de uma API que simulará este funcionamento.  


## :pencil2: **Desenvolvimento:**

Será desenvolvido uma aplicação CRUD com acesso ao Bancos de dados voltado à solucionar problemas de anonimização dos dados sensíveis de clientes da clínica de estética.  
Solicitando a aceitação do termos de uso, onde será informado a utilização dos dados pessoais da pessoa pela empresa, iremos diferenciar quem aceitar ou não aceitar, criptografando ou não seus dados em nosso banco de acordo com sua escolha.  

Aplicando o artigo 9º da lei LGPD , iremos trabalhar com:
- Ofuscar dados pessoais, para que dados de vendas sejam fornecidos de forma estatística, assim não tornando o portador do dado identificável.
- Criar regra de negócio, para que caso haja uma solicitação de dados pessoais, o titular do dado tenha que ser consultado para autorização.
Sabemos que a total anonimização dos dados não traz nenhum benefício para a empresa em si, mas enquanto os dados sensíveis de terceiros estiverem criptografados, este dado é considerado seguro.

Exemplo:

|  ID  |  Nome            |   Telefone           |  Agendamento  |  Procedimento  | Valor  |
| ---- | ---------------- | -------------------- | ------------- | -------------  | ------- |
|  1   |  Maria Clara     |   (12) 981375021     |    02/04/21   |        B       | 200,00  |  
|  2   | **CRIPTOGRAFADO**|   **CRIPTOGRAFADO**  |  05/04/21     |        A       | 170,00  |  


Portanto mesmo tendo parte dos dados criptografados, é possível gerar relatórios dos dados não pessoais, podendo tratá-los e torná-los como parâmetros para o crescimento da empresa.
Além de garantir os processos dentro da lei, evitando multas dolorosas, a empresa não é prejudicada perdendo dados úteis.


## :hourglass_flowing_sand: **Sprints:**

![sprint imagem](https://github.com/linemarquart/projetosi_clinica_estetica/blob/main/Imagens/sprint%20imagem.png)


## **Tecnologias utilizadas:**
- Dbeaver
- Postgres
- BrModelo
- Vertabelo
- Eclipse/SpringTools  



Esse projeto está relacionado à matéria de Segurança da Informação, lecionada pelo professor Eduardo Sakaue, da Faculdade de Tecnologia de São José dos Campos - Professor Jessen Vidal. 

