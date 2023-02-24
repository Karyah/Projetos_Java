package br.com.regraNegocio.main;

import java.time.DateTimeException;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.regraNegocio.model.Contrato;

public class Main {
	public static void main(String[] args) {
		Contrato contrato = new Contrato();
		Scanner ent = new Scanner(System.in);
		
		try {
			System.out.println("O contrato foi: \n1. Realizado hoje \n2. Em um dia específico");
			int resposta = ent.nextInt();
			
			if(resposta==1) {
				contrato.setDataDoContrato();
			}else {
				System.out.println("Digite os respectivos em números.");
				System.out.println("Ano do contrato:");
				int ano = ent.nextInt();
				
				System.out.println("Mês do contrato:");
				int mes = ent.nextInt();
				
				System.out.println("Dia do contrato:");
				int dia = ent.nextInt();
				contrato.setDataEscolhidaDoContrato(ano, mes, dia);
			}	
			
			System.out.println("Digite o número do contrato:");
			contrato.setNumeroContrato(ent.nextInt());	

			System.out.println("Digite o valor total do seu contrato:");
			contrato.setValorTotal(ent.nextDouble());
			
			System.out.println("Digite por quantos meses você quer parcelar (quantas parcelas):");
			contrato.setNumeroParcelas(ent.nextInt());
			
			contrato.retornaResultado();
			
			ent.close();
			
		}catch(NullPointerException npe) {
			npe.printStackTrace();
			System.out.println("Este dado não foi cadastrado.");
		}catch(InputMismatchException ime) {
			ime.printStackTrace();
			System.out.println("Você digitou o tipo de dado errado.");
		}catch(DateTimeException dte){
			dte.printStackTrace();
			System.out.println("Você digitou uma data inexistente.");
		}
		
	}
}
