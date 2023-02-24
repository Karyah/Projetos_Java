package br.com.regraNegocio.model;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contrato {

	private int numeroContrato;
	private LocalDate dataDoContrato;
	private double valorTotal;
	private int numeroParcelas;
	
	public void setNumeroContrato(int numeroContrato) {
		this.numeroContrato = numeroContrato;
	}
	
	public int getNumeroContrato() {
		return numeroContrato;
	}

	public LocalDate getDataDoContrato() {
		return dataDoContrato;
	}
	
	public void setDataDoContrato() {
		this.dataDoContrato = LocalDate.now();
	}
	
	public void setDataEscolhidaDoContrato(int ano, int mes, int dia) {
		this.dataDoContrato = LocalDate.of(ano,mes,dia);
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(int numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}

	
	public void retornaResultado() {
		
		double valorParcela = this.valorTotal/this.numeroParcelas;
		DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("---------------------------------");
		System.out.println("Número do contrato: "+this.getNumeroContrato());
		System.out.println("Data do contrato: "+this.getDataDoContrato().format(formatacao));
		System.out.println("Valor do contrato: "+this.getValorTotal());
		System.out.println("Quantidade de parcelas: "+this.getNumeroParcelas()+"\n");
		
		for(int i = 0; i<numeroParcelas; i++) {
			double valorUmPorCem = valorParcela + ((valorParcela/100) * (i+1));	
			double valorModificadoParcela = valorUmPorCem + (valorUmPorCem/100 * 2);
			
			LocalDate dataParcela = this.getDataDoContrato().plusMonths(i+1);	
			String dataParcelaFormatada = dataParcela.format(formatacao);
			
			System.out.println((i+1) + "° Parcela: " + "\n" + dataParcelaFormatada + " - R$" + Math.round(valorModificadoParcela * 1000.0)/1000.0);	
		}
		
		System.out.println("---------------------------------");
	}
	
	
}
