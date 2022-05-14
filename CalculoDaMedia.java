package CalculoDaMedia;

import java.util.Scanner;													//LE ENTRADA DE DADOS PELO TECLADO
public class CalculoDaMedia 											
{

	public static void main(String[] args) 									
	{
		double ac1 , ac2 , ag , af , nfac1 , nfac2 , nfag , nfaf , soma;	//VARIAVEIS TIPO double
		
		Scanner read = new Scanner(System.in);								//LE ENTRADA DE DADOS PELO TECCLADO
		
		System.out.print("Digite a nota da AC1: ");							//EXIBE MENSAGEM(DIGITE A NOTA DA AC1) NA TELA DO USUARIO
		ac1 = read.nextDouble();											//LE VALOR DIGITADO E GRAVA NA VARIAVEL ac1
		nfac1 = ac1*0.15;													//CALCULA VALOR E GRAVA NA VARIAVEL nfac1
		
		System.out.print("Digite a nota da AC2: ");							//EXIBE MENSAGEM(DIGITE A NOTA DA AC2) NA TELA DO USUARIO
		ac2 = read.nextDouble();											//LE VALOR DIGITADO E GRAVA NA VARIAVEL ac2
		nfac2 = ac2*0.3;													//CALCULA VALOR E GRAVA NA VARIAVEL nfac2
		
		System.out.print("Digite a nota da AG : ");							//EXIBE MENSAGEM(DIGITE A NOTA DA AG) NA TELA DO USUARIO
		ag = read.nextDouble();												//LE VALOR DIGITADO E GRAVA NA VARIAVEL aG
		nfag = ag*0.1;														//CALCULA VALOR E GRAVA NA VARIAVEL nfag
		
		System.out.print("Digite a nota da AF : ");							//EXIBE MENSAGEM(DIGITE A NOTA DA AF) NA TELA DO USUARIO
		af = read.nextDouble();												//LE VALOR DIGITADO E GRAVA NA VARIAVEL aF
		nfaf = af*0.45;														//CALCULA VALOR E GRAVA NA VARIAVEL nfaf
		
		soma = nfac1+nfac2+nfag+nfaf;										//SOMA VALOR DAS VARIAVEIS
		System.out.printf("\nSoma final %.2f\n",soma);						//EXIBE RESULTADO DA SOMA NA TELA DO USUARIO
		
		if(soma >= 5)														//COMPARA SE VALOR DA SOMA E MAIOR OU IGUAL A 5
		{
			System.out.println("------------------------");					//EXIBE CARACTERES NA TELA E PULA UMA LINHA
			System.out.println("     ALUNO APROVADO");						//EXIBE MENSAGEM(ALUNO APROVADO)SE SOMA FOR MAIOR OU IGUAL A 5 E PULA UMA LINHA
			System.out.println("------------------------");					
		}
		else																
		{
			System.out.println("------------------------");
			System.out.println("     ALUNO REPROVADO");						//EXIBE MENSAGEM(ALUNO REPROVADO)SE SOMA FOR MENOR QUE 5 E PULA UMA LINHA
			System.out.println("------------------------");					//EXIBE CARACTERES NA TELA E PULA UMA LINHA
		}

	}

}
