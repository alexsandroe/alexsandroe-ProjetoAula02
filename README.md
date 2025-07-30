# Projeto Curso Java - Coti Informática
O projeto inicial trata-se de uma introdução ao mundo Java e POO.

Explicação do projeto:
- A Classe PedidoController, recebe informações que o usuário inputará, como por exemplo, nom do cliente, valor do produto, descrição e qual status do produto.

- A Classe Enums, é a classe onde tem um método com informações do status do produto, se o mesmo está no status "PENDENTE, PROCESSANDO, ENVIADO, ENTREGUE, CANCELADO" 

- A Classe Pedido Repositories, abre conexão co o banco de dados, insere a query de inserção do produto e ao termino fecha a conexão com o banco de dados.

- O Package Pedido, reuno os atributos que um pedido deve ter, logo eles encontram-se privados, e logo são realizados métodos "geters and setters", para que outra classe possa fazer um reuso.

- A Classe ConnectionFactory, cria a conexão com o banco de dados.

 Para fechar também coloquei um script chamado scripts.sql onde cria tabela no postgresql e um docker-compose.yml onde cria um contaienr com PostGresql.




![alt text](image.png)
