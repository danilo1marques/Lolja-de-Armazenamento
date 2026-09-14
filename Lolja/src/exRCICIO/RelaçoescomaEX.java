package exRCICIO;

import java.util.Scanner;

public class RelaçoescomaEX {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
        System.out.print("Quantos produtos deseja analisar? ");
        
        int quantidadeProdutos = entrada.nextInt();
        int estoqueSuficiente = 0;
        int estoqueBaixo = 0;
        int semEstoque = 0;
        double valorTotalEstoque = 0;

        for (int i = 1; i <= quantidadeProdutos; i++) {

            System.out.println("\n======================");
            System.out.println("PRODUTO " + i);
            System.out.println("======================");

            entrada.nextLine();

            System.out.print("Nome: ");
            String nome = entrada.nextLine();

            System.out.print("Preço: R$ ");
            double preco = entrada.nextDouble();

            System.out.print("Quantidade em estoque: ");
            int quantidade = entrada.nextInt();

            double valorProduto = preco * quantidade;

            valorTotalEstoque = valorTotalEstoque + valorProduto;

            if (quantidade >= 20) {

                System.out.println("Situação: Estoque suficiente.");

                estoqueSuficiente++;

            } else if (quantidade > 0) {

                System.out.println("Situação: Estoque baixo.");

                estoqueBaixo++;

            } else {

                System.out.println("Situação: Sem estoque.");

                semEstoque++;
            }

            System.out.println("Valor em estoque: R$ " + valorProduto);
        }

        System.out.println("\n==========================");
        System.out.println("   RELATÓRIO DO ESTOQUE");
        System.out.println("==========================");

        System.out.println("Produtos analisados: " + quantidadeProdutos);

        System.out.println(
                "Estoque suficiente: " + estoqueSuficiente);

        System.out.println(
                "Estoque baixo: " + estoqueBaixo);

        System.out.println(
                "Sem estoque: " + semEstoque);

        System.out.println(
                "Valor total do estoque: R$ " + valorTotalEstoque);

        entrada.close();
	}

}
