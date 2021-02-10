# AWS Lambda com Java


Implementação de um serviço em Java que verifica se dois números são amigáveis utilizando um serviço de computação sem servidor, **servless**, da Amazon Web Services (AWS).<br>
A infraestrutura está descrita em dois arquivos json, e servem como exemplo para replicação ou estudo.<br>
A arquitetura é simples, uma API Gateway expõe o serviço que é executado em Lambda.

Números amigáveis:<br>
[Wikipedia](https://pt.wikipedia.org/wiki/N%C3%BAmero_amigo "Wikipedia")

Para testar envie o payload:

{
  "x": 220,
  "y": 284
}

que deve retornar "true"

ou 

{
  "x": 220,
  "y": 285
}

para "false"

Para acessar diretamente a API Gateway não esquecer do endereço do serviço ao final da URL.

https://rh76g7awdk.execute-api.us-east-1.amazonaws.com/ApiGatewayExemplo/funcao-numeros-amigaveis
