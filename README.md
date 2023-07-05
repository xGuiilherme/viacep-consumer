## ViaCEP - Consulte CEP de todo o Brasil
Esta API foi construida usando o Spring Boot e Java 11 e permite que os usuarios realizem consultas de CEP.

## Pré-requisitos
Para executar esta API, você precisa ter instalado:

- Java 11
- Maven 3.X

## Retorno da consulta no formato JSON
Após realizar a consulta do CEP, você pode pegar o conteúdo retornado no formato JSON.

```json{
"cep": "01001-000",
"logradouro": "Praça da Sé",
"complemento": "lado ímpar",
"bairro": "Sé",
"localidade": "São Paulo",
"uf": "SP",
"ddd": "",
"ibge": "3550308",
"gia": "1004"
}
```