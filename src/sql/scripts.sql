-- comentário no sql
-- Scripta para criação da tabela de pedidos
CREATE TABLE pedido(
	id 				UUID 			PRIMARY KEY,
	data_pedido 	DATE 			NOT NULL, -- not nul é campo obrigatorio
	nome_cliente 	VARCHAR(100) 	NOT NULL,
	valor_pedido 	NUMERIC(10) 	NOT NULL, -- 10 digitos, desses 10 digitos 2 casas decimais
	descricao 		TEXT 			NOT NULL,
	status 			VARCHAR(20) 	NOT NULL
);

-- cadastrando alguns pedidos na tabela
insert into pedido(id, data_pedido, nome_cliente, valor_pedido, descricao, status)
VALUES
(gen_random_uuid(), '2025-07-26', 'Michele', 1000.00, 'Compra de materiais de escritorio', 'PENDENTE'),
(gen_random_uuid(), '2025-07-26', 'Alex Sandro', 2500.00, 'Compra de materiais de info', 'PROCESSANDO');

-- consultando no banco
select * from pedido
order by data_pedido;