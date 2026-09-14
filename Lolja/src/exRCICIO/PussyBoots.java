package exRCICIO;
import java.util.Scanner;

public class PussyBoots {

	public static void main(String[] args) {
			
		Scanner entrada = new Scanner(System.in);
		Produto produto = new Produto();
        
        System.out.println("--- PROCESSAMENTO DO PRODUTO ---");
        System.out.print("Informe o produto: ");
        produto.objeto = entrada.nextLine();

        System.out.print("Digite a quantidade: ");
        produto.quantidade = entrada.nextInt();

        System.out.print("Insira o preço: ");
        produto.preço = entrada.nextDouble();
        
        System.out.println("--- DADOS DO PRODUTO ---");
        System.out.println("Produto: " +produto.objeto);
        System.out.println("Quantidade: " +produto.quantidade);
        System.out.println("Preço: " +produto.preço);
        
        double total = produto.preço * produto.quantidade;
        
        System.out.println("Valor total em estoque: " +total);

        entrada.close();
	}

}
