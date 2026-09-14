package exRCICIO;

import java.util.Scanner;

public class MenuLolja {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Produto[] produtos = new Produto[10];
        
        int quantidadeProdutos = 0;
        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n=== MENU LOJA ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Consultar produtos");
            System.out.println("3 - Verificar estoque");
            System.out.println("0 - Sair");

            System.out.println("\nEscolha uma opcao:");
            opcao = entrada.nextInt();

            switch (opcao) {

            	case 1:

            		if (quantidadeProdutos < 10) {

            			produtos[quantidadeProdutos] = new Produto();

            			entrada.nextLine();

            			System.out.println("--- CADASTRO DO PRODUTO ---");

            			System.out.print("Nome do produto: ");
            			produtos[quantidadeProdutos].objeto = entrada.nextLine();

            			System.out.print("Quantidade: ");
            			produtos[quantidadeProdutos].quantidade = entrada.nextInt();

            			while (produtos[quantidadeProdutos].quantidade < 0) {

            				System.out.println("Quantidade invalida!");
            				System.out.print("Digite novamente: ");
            				produtos[quantidadeProdutos].quantidade = entrada.nextInt();
            			}

            			System.out.print("Preco: R$ ");
            			produtos[quantidadeProdutos].preço = entrada.nextDouble();

            			while (produtos[quantidadeProdutos].preço < 0) {
                    	
            				System.out.println("Preco invalido!");
            				System.out.print("Digite novamente: ");
            				produtos[quantidadeProdutos].preço = entrada.nextDouble();
            			}

            			System.out.println("Produto cadastrado!");

            			quantidadeProdutos++;

                		} else {

                		System.out.println("Limite de 10 produtos atingido!");

                	}

            		break;

                case 2:

                    System.out.println("=== PRODUTOS CADASTRADOS ===");

                    if (quantidadeProdutos == 0) {

                        System.out.println("Nenhum produto cadastrado.");

                    } else {

                        int d = 0;

                        while (d < quantidadeProdutos) {

                            System.out.println("\nProduto " + (d + 1));
                            System.out.println("Nome: " + produtos[d].objeto);
                            System.out.println("Quantidade: " + produtos[d].quantidade);
                            System.out.println("Preco: R$ " + produtos[d].preço);

                            d++;
                        }
                    }

                    break;

                case 3:

                    System.out.println("=== SITUAÇÃO DO ESTOQUE ===");

                    if (quantidadeProdutos == 0) {

                        System.out.println("Nenhum produto cadastrado.");

                    } else {

                        int d = 0;

                        while (d < quantidadeProdutos) {

                            System.out.println("\nProduto: " + produtos[d].objeto);

                            if (produtos[d].quantidade >= 20) {

                                System.out.println("Estoque suficiente.");

                            } else if (produtos[d].quantidade > 0) {

                                System.out.println("Estoque baixo.");

                            } else {

                                System.out.println("Produto sem estoque.");
                            }

                            d++;
                        }
                    }

                    break;

                case 0:

                    System.out.println("\nSistema encerrado.");

                    break;

                default:

                    System.out.println("\nOpcao invalida!");

            }
        }

        entrada.close();
    }
}