
Projeto Lanchonete Spring Boot -Java Developer(DIO)

Visão Geral
Este é um projeto simples em Spring Boot para gerenciar pedidos (Pedidos) em uma lanchonete. Inclui entidades para pedidos, produtos e clientes, bem como serviços, controladores e repositórios para gerenciar as operações CRUD.

Estrutura do Projeto
Classes de Entidade:

Pedidos: Representa pedidos, incluindo uma referência a um produto e um cliente.

PedidosForm: Classe de formulário para criar ou atualizar pedidos com anotações de validação.
Repositório:

PedidosRepository: Repositório JPA para gerenciar pedidos, incluindo consultas personalizadas.
Serviço:

PedidosService: Interface de serviço para operações relacionadas a pedidos.

Implementação de Serviço:

PedidosServiceImpl: Implementação da interface PedidosService, incluindo operações CRUD.
Controlador:

PedidosController: Controlador REST para manipular solicitações HTTP relacionadas a pedidos.
Configuração do Banco de Dados:

Usa PostgreSQL como banco de dados.
Utiliza o Spring Data JPA para interação fácil com o banco de dados.
Ferramenta de Compilação:

Maven é utilizado como ferramenta de compilação.

## Referência
- [Projeto "Academia Digital"](https://github.com/cami-la/academia-digital)

## Autores
- [@eduardopetrocchi](https://www.github.com/eduardopetrocchi)





