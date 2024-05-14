# Rest Template API

Feito um BFF (Back-end for front-end).
Consumi 2 api de cep (viaCep e Brasil API) bem simplão e também já fiz um CRUDzão com um DTO com dados de veiculos no serviço https://crudcrud.com/  que permite inserir dados reais no banco de acordo com o que enviamos nas requisições, ele cria com os nossos recursos (porém temos uma limitação de 100 requisições por dia, que ainda sim é bom)... Deem uma olhada na documentação!

## 🚀 Começando

Essas instruções permitirão que você obtenha uma cópia do projeto em operação na sua máquina local para fins de desenvolvimento e teste.

### 📋 Pré-requisitos

De que coisas você precisa para instalar o software e como instalá-lo?

```
IDE de sua preferência - para rodar o projeto
Postman para testar a aplicação
```

### 🔧 Instalação

Uma série de exemplos passo-a-passo que informam o que você deve executar para ter um ambiente de desenvolvimento em execução.

Clone e suba o projeto.

Collection comprimida para importar e testar no postman:

```
{"info":{"_postman_id":"a62efb2b-e3cb-45c4-b6bc-69654f54504a","name":"Rest Template API","schema":"https://schema.getpostman.com/json/collection/v2.1.0/collection.json","_exporter_id":"28860635"},"item":[{"name":"Ceps","item":[{"name":"Busca Cep Brasil API","request":{"method":"GET","header":[],"url":{"raw":"localhost:8080/v2/cep/13317786","host":["localhost"],"port":"8080","path":["v2","cep","13317786"]}},"response":[]},{"name":"Busca Cep Via CEP","request":{"method":"GET","header":[],"url":{"raw":"localhost:8080/v1/cep/13317786","host":["localhost"],"port":"8080","path":["v1","cep","13317786"]}},"response":[]}]},{"name":"CrudCrud API","item":[{"name":"Busca Veiculos","protocolProfileBehavior":{"disableBodyPruning":true},"request":{"method":"GET","header":[],"body":{"mode":"raw","raw":"{\r\n  \"nome\": \"Marea Turbo\",\r\n  \"modelo\": \"SX 2.0 20v\",\r\n  \"marca\": \"Fiat\",\r\n  \"cor\": \"Vermelho\",\r\n  \"ano\": \"2002\"\r\n}","options":{"raw":{"language":"json"}}},"url":{"raw":"localhost:8080/v1/veiculos","host":["localhost"],"port":"8080","path":["v1","veiculos"]}},"response":[]},{"name":"Busca Veiculo Por ID","protocolProfileBehavior":{"disableBodyPruning":true},"request":{"method":"GET","header":[],"body":{"mode":"raw","raw":"{\r\n  \"nome\": \"Marea Turbo\",\r\n  \"modelo\": \"SX 2.0 20v\",\r\n  \"marca\": \"Fiat\",\r\n  \"cor\": \"Vermelho\",\r\n  \"ano\": \"2002\"\r\n}","options":{"raw":{"language":"json"}}},"url":{"raw":"localhost:8080/v1/veiculos/664183d43207ed03e8c9331e","host":["localhost"],"port":"8080","path":["v1","veiculos","664183d43207ed03e8c9331e"]}},"response":[]},{"name":"Insere Veiculo","request":{"method":"POST","header":[],"body":{"mode":"raw","raw":"{\r\n  \"nome\": \"Punto\",\r\n  \"modelo\": \"1.4 Turbo\",\r\n  \"marca\": \"Fiat\",\r\n  \"cor\": \"Azul\",\r\n  \"ano\": \"2010\"\r\n}","options":{"raw":{"language":"json"}}},"url":{"raw":"localhost:8080/v1/veiculos","host":["localhost"],"port":"8080","path":["v1","veiculos"]}},"response":[]},{"name":"Edita Veiculo","request":{"method":"PUT","header":[],"body":{"mode":"raw","raw":"{\r\n  \"nome\": \"Marea Turbo editada\",\r\n  \"modelo\": \"SX 2.4 20v\",\r\n  \"marca\": \"Fiat\",\r\n  \"cor\": \"Azul\",\r\n  \"ano\": \"2002\"\r\n}","options":{"raw":{"language":"json"}}},"url":{"raw":"localhost:8080/v1/veiculos/664183d43207ed03e8c9331e","host":["localhost"],"port":"8080","path":["v1","veiculos","664183d43207ed03e8c9331e"]}},"response":[]},{"name":"Deleta Veiculo","request":{"method":"DELETE","header":[],"body":{"mode":"raw","raw":"{\r\n  \"nome\": \"Marea Turbo editada\",\r\n  \"modelo\": \"SX 2.4 20v\",\r\n  \"marca\": \"Fiat\",\r\n  \"cor\": \"Azul\",\r\n  \"ano\": \"2002\"\r\n}","options":{"raw":{"language":"json"}}},"url":{"raw":"localhost:8080/v1/veiculos/6642375c3207ed03e8c93583","host":["localhost"],"port":"8080","path":["v1","veiculos","6642375c3207ed03e8c93583"]}},"response":[]}]}]}
```

### Exemplo Postman
![image](https://github.com/GabbrielLopes/rest-template-api/assets/101233353/b7e789ea-9870-4d9e-888b-970634f87cbd)

![image](https://github.com/GabbrielLopes/rest-template-api/assets/101233353/3cb8f580-f46b-4c04-8c88-2fe9cb034efe)

### Código
![image](https://github.com/GabbrielLopes/rest-template-api/assets/101233353/d8e5c486-6b42-47b6-8ee0-7f9c3c8caabf)

![image](https://github.com/GabbrielLopes/rest-template-api/assets/101233353/f6e9aada-25f7-42af-a423-4d78f0c46e91)



## 🛠️ Construído com

* [SpringBoot](https://start.spring.io/)
* [Maven](https://maven.apache.org/)
* [Lombok](https://projectlombok.org/)
