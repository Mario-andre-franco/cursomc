package com.example.cursomc.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonFormat;

=======
<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

=======
>>>>>>> 199628d15e35f984588ad5673a9e4a237f010b98
>>>>>>> 63112e158099a152c7d8e81aa40c9279772ba1a1
@Entity
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 63112e158099a152c7d8e81aa40c9279772ba1a1
	
	@JsonFormat(pattern="dd/MM/yyyy HH:mm")
	private Date instante;
	
	
<<<<<<< HEAD
=======
	@JsonManagedReference
	@OneToOne(cascade=CascadeType.ALL,mappedBy="pedido")//pra evitar erro 
	private Pagamento pagamento;
	
	@JsonManagedReference
=======
	private Date instante;
>>>>>>> 63112e158099a152c7d8e81aa40c9279772ba1a1
	
	@OneToOne(cascade=CascadeType.ALL,mappedBy="pedido")//pra evitar erro 
	private Pagamento pagamento;
	
	
<<<<<<< HEAD
=======
>>>>>>> 199628d15e35f984588ad5673a9e4a237f010b98
>>>>>>> 63112e158099a152c7d8e81aa40c9279772ba1a1
	@ManyToOne
	@JoinColumn(name="cliente_id") 
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="endereco_de_entrega_id")
	private Endereco enderecoDeEntrega;
	
	
	@OneToMany(mappedBy="id.pedido")
	private Set<ItemPedido> items = new HashSet<>();
	
	
	public Pedido () {
		
		
	}

	public Pedido(Integer id, Date instante, Cliente cliente, Endereco enderecoDeEntrega) {
		super();
		this.id = id;
		this.instante = instante;
		this.cliente = cliente;
		this.enderecoDeEntrega = enderecoDeEntrega;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getInstante() {
		return instante;
	}

	public void setInstante(Date instante) {
		this.instante = instante;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Endereco getEnderecoDeEntrega() {
		return enderecoDeEntrega;
	}

	public void setEnderecoDeEntrega(Endereco enderecoDeEntrega) {
		this.enderecoDeEntrega = enderecoDeEntrega;
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
		Pedido other = (Pedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Set<ItemPedido> getItems() {
		return items;
	}

	public void setItems(Set<ItemPedido> items) {
		this.items = items;
	}
	
}
