package Exe1;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);

		
		String marca, modelo;
		int menu, cont = 0, soma = 0, opcao =0,ano, media;
		double valor;

		
		ArrayList<String> carros = new ArrayList<>();
		do {

		System.out.println("---- Seleciona uma das op��es abaixo ----");
		System.out.println("(1)Cadastrar Carro");
		System.out.println("(2)Listagem Geral ");
		System.out.println("(3)Mostrar Resultados");
		System.out.println("(4)Sair ");
		
		menu = entrada.nextInt();
		
		switch(menu)	{
		case 1:
			
			System.out.println("Digite a marca do ve�culo: ");
			marca = entrada.next();
			
			System.out.println("Digite o modelo do ve�culo: ");
			modelo = entrada.next();
			
			System.out.println("Digite o ano do ve�culo: ");
			ano = entrada.nextInt();
			
			System.out.println("Digite o valor do ve�culo: ");
			valor = entrada.nextDouble();
			
			if (valor >=50000) {
				cont++;
				soma = soma +ano;
			}
			
			carros.add(marca+ " - " +modelo+ " - " +ano+ " - R$" +valor);
			
		break;
		
		case 2:
			
			System.out.println(carros.toString());
			
		break;
		case 3:
			
			media = soma / cont;
			System.out.println(cont+ " carros custam mais de R$50.000");
			System.out.println("A m�dia de anos dos carros � "+media);
			
			break;
		
		case 4:
			
		break;
		
		default:
		      System.out.println("Op��o Inv�lida. Tente novamente!");
		}
		    
		} while (opcao != 4);
		}
}