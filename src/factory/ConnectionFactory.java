package factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			// retornando a conexão
			return DriverManager.getConnection("jdbc:postgresql://localhost:5434/pedidos_db", "pedidos_user",
					"MilDisMIl100");
		} catch (Exception e) {
			System.out.println("Erro ao conectar com o banco de dados");
			return null;
		}
	}

}
