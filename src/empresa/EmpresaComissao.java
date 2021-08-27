package empresa;

import java.util.Scanner;

public class EmpresaComissao {

	public static void main(String[] args) {

		String nome;
		int tempoDeTrabalho;
		double valorVenda, valorComissao;

		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe o nome do vendedor: ");
		nome = leitor.nextLine();

		System.out.print("Informe o tempo de trabalho (em anos): ");
		tempoDeTrabalho = leitor.nextInt();

		System.out.print("Informe o valor da venda (em R$): ");
		valorVenda = leitor.nextInt();

		leitor.close();

		System.out.println();
		System.out.println("*******COMISS�O DO VENDEDOR*******");
		
		if (valorVenda >= 10000 && valorVenda < 20000 && tempoDeTrabalho >= 1) {
			valorComissao = valorVenda * 0.05;
			System.out.println("O(a) vendedor(a) " + nome + " receber� de comiss�o: " + "R$" + valorComissao);
		} else if (valorVenda >= 20000 && tempoDeTrabalho >= 1) {
			valorComissao = valorVenda * 0.10;
			System.out.println("O(a) vendedor(a) " + nome + " receber� de comiss�o: " + "R$" + valorComissao);
		} else {
			valorComissao = valorVenda * 0.03;
			System.out.println("O(a) vendedor(a) " + nome + " receber� de comiss�o: " + "R$" + valorComissao);
		}
	}

}
