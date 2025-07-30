package entities;

import java.time.LocalDate;
import java.util.UUID;

import enumns.enums.StatusPedido;

public class Pedido {

	private UUID id;
	private LocalDate dataPedido;
	private String nomeCliente;
	private Double valorPedido;
	private String descricao;
	private StatusPedido status;
	
	public Pedido() {
		id = UUID.randomUUID(); // gerando um id do pedido
		dataPedido = LocalDate.now(); // gerando a data atual
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Double getValorPedido() {
		return valorPedido;
	}

	public void setValorPedido(Double valorPedido) {
		this.valorPedido = valorPedido;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

}
