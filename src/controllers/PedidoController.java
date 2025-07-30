package controllers;

import javax.swing.JOptionPane;

import entities.Pedido;
import enumns.enums.StatusPedido;
import repositories.PedidoRepository;

public class PedidoController {
	public void cadastrarPedido() { //metodo = função
		var nomeCliente = JOptionPane.showInputDialog("Informe o nome do cliente: ");
		var valorPedido = JOptionPane.showInputDialog("Valor Pedido: ");
		var descricao = JOptionPane.showInputDialog("Digite a Descrição: ");
		var status = JOptionPane.showInputDialog("Digite o Status do pedido: ");
		
		var pedido = new Pedido();
		pedido.setNomeCliente(nomeCliente);
		pedido.setValorPedido(Double.parseDouble(valorPedido));
		pedido.setDescricao(descricao);
		pedido.setStatus(StatusPedido.valueOf(status));
		
		//Realizar cadastro do pedido
		var pedidoRepository = new PedidoRepository();
		pedidoRepository.inserir(pedido);
	}

}
