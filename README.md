<p align="center">
  <img src="https://github.com/linemarquart/projetosi_clinica_estetica/blob/main/Imagens/logo%20-%20projeto%20si.png" alt="Sublime's custom image"/>
</p>

# PROJETO SI - CLÍNICA ESTÉTICA


## :large_blue_circle: **Integrantes da Equipe:**


- :woman: Aline Oliveira dos Santos [@GitHub](https://github.com/linemarquart) :white_circle::white_circle: [@Linkedin](https://www.linkedin.com/in/aline-oliveira-dos-santos-a36598a8/)
- :man: Gustavo Lopes de Paula [@GitHub](https://github.com/GusttavoLopes) :white_circle::white_circle: [@Linkedin](https://www.linkedin.com/in/gustavo-lopes-3a255117b/)
- :man: Igor Sene Idalgo [@GitHub](https://github.com/IgorS12) :white_circle::white_circle: [@Linkedin](https://www.linkedin.com/in/igor-sene-9a4051172/)
- :woman: Larissa Janine Dias [@GitHub](https://github.com/larijanine) :white_circle::white_circle: [@Linkedin](https://www.linkedin.com/in/larissa-dias-a37935151/)
- :man: Marcos Paulo Simoes Donizete [@GitHub](https://github.com/MarcospsDonizete) :white_circle::white_circle: [@Linkedin](https://www.linkedin.com/in/marcos-paulo-sim%C3%B5es-donizete-7b70aa132/)
- :man: Matheus Ribeiro dos Santos [@GitHub](https://github.com/matheusribss) :white_circle::white_circle: [@Linkedin](https://www.linkedin.com/in/matheus-ribeiro-dos-santos-a9b531b3/)
- :man: Toni William do Prado [@GitHub](https://github.com/toniprado) :white_circle::white_circle: [@Linkedin](https://www.linkedin.com/in/toni-william-a9a425148/)
- :woman: Victoria Ferreira Ribeiro [@GitHub](https://github.com/victoriandujar) :white_circle::white_circle: [@Linkedin](https://www.linkedin.com/in/victoria-ribeiro-09b372208/) 


## :computer: **LGPD:**

A Lei Geral de Proteção de Dados tem como objetivo oferecer mais segurança sobre o uso de dados pessoais, garantindo maior controle e privacidade dos dados de pessoas físicas ou jurídicas. Ela é a legislação que regula a coleta, armazenamento, tratamento e compartilhamento de dados pessoais, impondo um padrão de proteção e penalidades para o descumprimento da norma.   
Um bom exemplo são os termos de uso, aqueles textos enormes e que todo mundo aceita sem ler. Com ela em vigor, eles terão de ser muito mais curtos e claros, com a necessidade de especificar para que servem os dados solicitados.  
As multas para descumprimento da lei estão previstas para serem aplicadas a partir de agosto de 2021, portanto esta adequação agora passa a ser uma prioridade imediata!  
As empresas não só precisam adequar seus processos com ferramentas de gestão e tecnologias, mas também passar segurança para o consumidor e evitar multas dolorosas.  



## :dart: **Objetivo:**
 
A fim de demonstrar a importância da adaptação de um banco de dados dentro da LGPD, usamos como aplicação prática um banco de dados de uma Clínica de Estética.  
Implementando uma modelagem de banco de acordo com os requisitos de anonimização da LGPD, mantendo apenas os dados importantes para a empresa, como informações de valores e a quantidade feita de cada procedimento, retirando também os dados repetidos e criando uma interface para o usuário utilizar. Será realizado por meio de uma API que simulará este funcionamento.  


## :pencil2: **Desenvolvimento:**

Será desenvolvido uma aplicação CRUD com acesso ao Bancos de dados voltado à solucionar problemas de anonimização dos dados sensíveis de clientes da clínica de estética.  
Solicitando a aceitação do termos de uso, onde será informado a utilização dos dados pessoais da pessoa pela empresa, iremos diferenciar quem aceitar ou não aceitar, criptografando ou não seus dados em nosso banco de acordo com sua escolha.  

Aplicando o artigo 9º da lei [LGPD](http://www.planalto.gov.br/ccivil_03/_ato2015-2018/2018/lei/l13709.htm) , iremos trabalhar com:
- Ofuscar dados pessoais, para que dados de vendas sejam fornecidos de forma estatística, assim não tornando o portador do dado identificável.
- Criar regra de negócio, para que caso haja uma solicitação de dados pessoais, o titular do dado tenha que ser consultado para autorização.
Sabemos que a total anonimização dos dados não traz nenhum benefício para a empresa em si, mas enquanto os dados sensíveis de terceiros estiverem criptografados, este dado é considerado seguro.

Exemplo:

|  ID  |  Nome            |   Telefone           |  Agendamento  |  Procedimento  | Valor  |
| ---- | ---------------- | -------------------- | ------------- | -------------  | ------- |
|  1   |  Maria Clara     |   (12) 981375021     |    02/04/21   |        B       | 200,00  |  
|  2   | **CRIPTOGRAFADO**|   **CRIPTOGRAFADO**  |    05/04/21   |        A       | 170,00  |  


Portanto mesmo tendo parte dos dados criptografados, é possível gerar relatórios dos dados não pessoais, podendo tratá-los e torná-los como parâmetros para o crescimento da empresa.
Além de garantir os processos dentro da lei, evitando multas dolorosas, a empresa não é prejudicada perdendo dados úteis.


## :hourglass_flowing_sand: **Sprints:**

<p align="center">
  <img src="https://github.com/linemarquart/projetosi_clinica_estetica/blob/main/Imagens/5%20SPRINTS%20ATUALIZADA%20-%20SI.png" alt="Sublime's custom image"/>
</p>


## :red_circle: **Tecnologias utilizadas:**
- Dbeaver
- Postgres
- BrModelo
- Vertabelo
- Eclipse/SpringTools  
- React


## 💻 Prototipação
A prototipação é essencial para a visualização do projeto antes de começar o desenvolvimento.
Para realizar a criação do protótipo, foi utilizado a plataforma [Figma](https://www.figma.com/).
Ela é uma ferramenta online utilizada para a criação do design de interfaces.

Para visualizar a prototipação dessa aplicação e navegar entre as telas acesse o [link](https://www.figma.com/proto/tb0Enfa1oo68woFIiP5zD1/Prot%C3%B3tipo-de-Tela?node-id=25%3A7&scaling=min-zoom&page-id=0%3A1).

[Veja mais](https://github.com/linemarquart/projetosi_clinica_estetica/blob/main/Prototipa%C3%A7%C3%A3o/Prototipa%C3%A7%C3%A3o_Readme.md) detalhes sobre as telas prototipadas. 


## :man_technologist: **Como executar o banco de dados:**

:white_check_mark: [Passo a passo para executar o banco de dados no seu computador](https://github.com/linemarquart/projetosi_clinica_estetica/blob/main/Clinica/Readme.md)


## :art: **Primeiros passos com Create React App:**

:white_check_mark: [Passo a passo para execução com Create React App no seu computador](https://github.com/linemarquart/projetosi_clinica_estetica/tree/main/clinica-front)


## :movie_camera: **Vídeo demonstrativo:**

https://user-images.githubusercontent.com/51121525/121279093-5d491c00-c8aa-11eb-91bc-fe19ef9bcb44.mp4



:white_check_mark: [Assista o vídeo pelo Youtube](https://youtu.be/rtwCHQQRH60)


##

Esse projeto está relacionado à matéria de Segurança da Informação, lecionada pelo professor Eduardo Sakaue, da Faculdade de Tecnologia de São José dos Campos - Professor Jessen Vidal. 

<p align="center">
  <img src="https://github.com/linemarquart/projetosi_clinica_estetica/blob/main/Imagens/logo%20fatec.png" alt="Sublime's custom image"/>
</p>
