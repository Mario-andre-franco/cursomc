package com.example.cursomc.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonIgnore;
=======
<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonIgnore;
=======
>>>>>>> 199628d15e35f984588ad5673a9e4a237f010b98
>>>>>>> 63112e158099a152c7d8e81aa40c9279772ba1a1

@Entity
public class ItemPedido implements Serializable {

	private static final long serialVersionUID = 1L;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 63112e158099a152c7d8e81aa40c9279772ba1a1

	@JsonIgnore
	@EmbeddedId
	private ItemPedidoPK id = new ItemPedidoPK();

	private double Desconto;
	private Integer quantidade;
	private Double preco;

	public ItemPedido() {

	}

	public ItemPedido(Pedido pedido, Produto produto, double desconto, Integer quantidade, Double preco) {
<<<<<<< HEAD
=======
=======
	
	
	@EmbeddedId
	private ItemPedidoPK id = new ItemPedidoPK();
	
	private double Desconto;
	private Integer quantidade;
	private Double 	preco;
	
	public ItemPedido () {
		
	}

	public ItemPedido(Pedido pedido,Produto produto, double desconto, Integer quantidade, Double preco) {
>>>>>>> 199628d15e35f984588ad5673a9e4a237f010b98
>>>>>>> 63112e158099a152c7d8e81aa40c9279772ba1a1
		super();
		id.setPedido(pedido);
		id.setProduto(produto);
		Desconto = desconto;
		this.quantidade = quantidade;
		this.preco = preco;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 63112e158099a152c7d8e81aa40c9279772ba1a1
	@JsonIgnore
	public Pedido getPedido() {
		return id.getPedido();
	}

<<<<<<< HEAD
=======
=======
	public Pedido getPedido () {
		return id.getPedido();
	}
>>>>>>> 199628d15e35f984588ad5673a9e4a237f010b98
>>>>>>> 63112e158099a152c7d8e81aa40c9279772ba1a1
	
	public Produto getProduto() {
		return id.getProduto();
	}
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
	
	
>>>>>>> 199628d15e35f984588ad5673a9e4a237f010b98
>>>>>>> 63112e158099a152c7d8e81aa40c9279772ba1a1
	public ItemPedidoPK getId() {
		return id;
	}

	public void setId(ItemPedidoPK id) {
		this.id = id;
	}

	public double getDesconto() {
		return Desconto;
	}

	public void setDesconto(double desconto) {
		Desconto = desconto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemPedido other = (ItemPedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
	
	
>>>>>>> 199628d15e35f984588ad5673a9e4a237f010b98
>>>>>>> 63112e158099a152c7d8e81aa40c9279772ba1a1

}
