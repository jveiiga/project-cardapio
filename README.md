# Spring Initializr

Esse é o repositório da API Cardapio, feito com Spring Initializr.

## Endpoints

Existe 1 endpoint que pode ser utilizado para GET e POST: `localhost:8080/food`

O mesmo pode ser utilizado para o PATCH e o DELETE, basta adicionar como parâmetro o id na rota: `localhost:8080/food/23`

### Cadastro
POST /food <br/>

### Busca
GET /food <br/>

### Edição
PATCH /food/:id

### Deleção
DELETE /food/:id


<h1 align="center">
  🌭 Cardapio - API 🍔
</h1>

<p align = "center">
Este é o backend da aplicação Cardapio - Feito para lanchonetes anunciarem seu produtos.

<blockquote align="center">“Garçom, trás o cardapio!”</blockquote>

##

<p align="center">
  <a href="#instalação">Instalação</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</p>

## Instalação

    - Clonar repositorio
    $ git clone https://github.com/jveiiga/project-cardapio.git
    
    Sobre o Projeto 📺
    
    - Rodando API
    É necessário que você encontre o Maven em seu editor de texto, ele vai ter uma estrura de pasta parecida com essa:
    
    > Pasta principal
    > ├── 📂 Lifecycle
    > │   ├── ⚙️ clean
    > │   ├── ⚙️ validate
    > │   ├── ⚙️ compile
    > │   ├── ⚙️ test
    > │   ├── ⚙️ test-compile
    > │   ├── ⚙️ package (Ao clickar aqui, aparecerá um ícone desses ▶️ click nele para intalar os pacotes de dependências).
    > │   ├── ⚙️ verify
    > │   ├── ⚙️ install
    > │   ├── ⚙️ site
    > │   ├── ⚙️ deploy
    > ├── 📁 Plugins
    > ├── 📁 Dependecies
    > ├── 📁 Favorite
    > ├── 📁 Profiles
    
    - Após instalar as depêndecias do projeto é necessário encontrar o arquivo ☕️ CardapioApplication.java
      
    > Pasta principal
    > ├── 📂 src
    > │   ├── 📂 main
    > │   └──── 📂 java
    > │   └────── 📂 com
    > │   └──────── 📂 example
    > │   └────────── 📂 cardapio
                        └── ☕️ CardapioApplication.java (Ao clickar aqui, aparecerá um ícone desses ▶️ no canto direito superior, click nele e o servidor será inicializado).
                        
     -Ps: anexei ao projeto o Insomnia-food.json que pode ser importado no Insomnia e utilizado, mas sinta-se a vontade para utilizar o de sua prefêrencia.

<p align="center">
  <a href="#endpoints">Endpoints</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</p>

## **Endpoints**

API CRUD de lanches. <br/>

baseUrl da API: `localhost:8080`

## 🚨 Nenhuma rota necessita de autenticação 🚨


## Rota para cadastro de lanche:

`POST /food - FORMATO DA RESPOSTA - STATUS 200 OK`

```json
{
  "id": 1,
  "title": "Lanche do Beretinha.",
  "image": "https://www.estadao.com.br/resizer/0tioSMT42iBs8hAoKsjWYodoLLE=/arc-anglerfish-arc2-prod-estadao/public/HNNTVS4TARNSVNZVXYT7LFKTWA.jpg",
  "price": 26
}
```

## Rota para buscar todos lanches:

`GET /food - FORMATO DA RESPOSTA - STATUS 200 OK`

```json
[
{
  "id": 1,
  "title": "Lanche do Beretinha.",
  "image": "https://www.estadao.com.br/resizer/0tioSMT42iBs8hAoKsjWYodoLLE=/arc-anglerfish-arc2-prod-estadao/public/HNNTVS4TARNSVNZVXYT7LFKTWA.jpg",
  "price": 26
},
{
  "id": 2,
  "title": "Lanche do Magno.",
  "image": "https://hamburguerdesucesso.com.br/wp-content/uploads/2021/05/lanches-mais-vendidos-no-brasil-1200x675.jpg",
  "price": 26
}
]
```

## Rota para editar um lanche: 

`PATCH /food/:id - FORMATO DA RESPOSTA - STATUS 200 OK`

```json
{
  "id": 2,
  "title": "Lanche do Bereta.",
  "image": "https://www.estadao.com.br/resizer/0tioSMT42iBs8hAoKsjWYodoLLE=/arc-anglerfish-arc2-prod-estadao/public/HNNTVS4TARNSVNZVXYT7LFKTWA.jpg",
  "price": 26
}
```

## Rota para deletar um lanche: 

`DELETE /food/:id - FORMATO DA RESPOSTA - STATUS 204 NO CONTENT`

```json
"No body returned for response" 
```
