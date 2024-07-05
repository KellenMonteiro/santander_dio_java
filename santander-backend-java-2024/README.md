# DIO | Bootcamp Santander Java

Repositório para o desafio de projeto sobre Java RESTful API criada para Bootcamp Santander Backend Java 2024 [Digital Innovation One](https://www.dio.me/).


classDiagram

class User { 
    -String name 
    -Account account 
    -Feature[] features 
    -Card card 
    -News[] news }

class Account {
    -String number
    -String agency
    -Float balance
    -Float limit
}

class Feature {
    -String icon
    -String description
}

class Card {
    -String number
    -Float limit
}

class News {
    -String icon
    -String description
}

User --> Account
User --> Feature
User --> Card
User --> News