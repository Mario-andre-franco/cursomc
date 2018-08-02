package com.example.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.example.cursomc.domain.enums.EstadoPagamento;
<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonFormat;
=======
>>>>>>> 199628d15e35f984588ad5673a9e4a237f010b98

@Entity
public class PagamentoComBoleto extends Pagamento {

	private static final long serialVersionUID = 1L;
<<<<<<< HEAD
	
	@JsonFormat(pattern="dd/MM/yyyy")
	
	private Date dataVencimento;
	
	@JsonFormat(pattern="dd/MM/yyyy")
=======
	private Date dataVencimento;
>>>>>>> 199628d15e35f984588ad5673a9e4a237f010b98
	private Date dataPagamento;

	public PagamentoComBoleto() {

	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento,
			Date dataPagamento) {
		super(id, estado, pedido);
		this.dataPagamento = dataPagamento;
		this.dataVencimento = dataVencimento;
		// TODO Auto-generated constructor stub
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

}
<<<<<<< HEAD


=======
>>>>>>> 199628d15e35f984588ad5673a9e4a237f010b98
