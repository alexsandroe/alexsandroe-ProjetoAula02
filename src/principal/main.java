package principal;

import controllers.PedidoController;

public class main {
	public static void main(String[] args) {
		var pedidoController = new PedidoController();
		pedidoController.cadastrarPedido();
	}

}
