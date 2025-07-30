package repositories;

import javax.swing.JOptionPane;

import entities.Pedido;
import factory.ConnectionFactory;

/*
 * Classe para executar operações no BD com entidade Pedido
 */

public class PedidoRepository {
	public void inserir(Pedido pedido) {
		
		/*
		 * Metodo para inserir um pedido na tabela do
		 * bnco de dados
		 */
		try { // Abrindo a conexão com o banco
			var factory = new ConnectionFactory();
			var connection = factory.getConnection();
			
			// Escrevendo o comando insert para 
			// Gravar o pedido na tabela
			var query = """
					INSERT INTO pedido(id, data_pedido, nome_cliente, valor_pedido, descricao, status)
					VALUES(?,?,?,?,?,?)
					""";
			/*
			 * Executando o comando e passando os parâmetros
			 */
			var statement = connection.prepareStatement(query);
			statement.setObject(1, pedido.getId());
			statement.setObject(2, pedido.getDataPedido());
			statement.setString(3, pedido.getNomeCliente());
			statement.setDouble(4, pedido.getValorPedido());
			statement.setString(5, pedido.getDescricao());
			statement.setString(6, pedido.getStatus().toString());
			statement.execute();
			
			connection.close(); //fechando a conexão
			
			JOptionPane.showMessageDialog(null, "Pedido cadastrado com sucesso!");
		}
		catch(Exception e) {
			System.out.println("Falha ao gravar");
			e.printStackTrace();
		}
	}

}