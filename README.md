# JSF

Este projeto está estruturado com os assuntos relacionados ao JSF.

## Aulas

*[Aula 1 - Conceitos Básicos ](https://github.com/ifpb-disciplinas-2021-1/ads-dac-jsf/commit/5e518b598d67278b20c4efaf0ba90e7700928e8c)*

*[Aula 2 - Conversores e Validadores ](https://github.com/ifpb-disciplinas-2021-1/ads-dac-jsf/commit/48eb99103359eab15771e7423e4a76ce78768341)*

*[Aula 3 - Templates ](https://github.com/ifpb-disciplinas-2021-1/ads-dac-jsf/commit/48eb99103359eab15771e7423e4a76ce78768341)*

## Executando o projeto

Para executarmos o código precisamos realizar o clone do projeto. Posteriormente, na pasta raiz do projeto, executar os seguintes comandos:
* `mvn clean package`
* `docker build -t ricardojob/app .`
* `docker container run -p 8081:8080 --name app ricardojob/app`

A aplicação está disponível no link: `http://localhost:8081/app/`. 

> Importante observar o mapeamento das portas feita no momento de iniciar o container. Com a configuração apresentada teremos o seguinte comportamento: quando uma requisição ocorrer para porta (8081) do __host__ (máquina com o docker instalado), a requisição será redirecionada à porta (8080) do container.

## Roteiro de estudos


Temos um roteiro de apoio para revisar os conteúdos apresentados. Neste [roteiro](https://docs.google.com/document/d/1qaIR2q6tZTAATwV_Bz0yQKYOagB4UpQqH5NjJdmUeFg/edit#heading=h.nehd7c28n6q6) temos **oito** requisitos que após serem implementados, temos revisado todos os principais conceitos do framework Java ServerFaces.