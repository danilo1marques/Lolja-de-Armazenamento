package exRCICIO;
import java.util.Scanner;

public class Extorquir {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Produto produto = new Produto();
		
		System.out.println("--- VERIFICAR ESTOQUE  ---");

        System.out.print("Informe o produto: ");
        produto.objeto = entrada.nextLine();

        System.out.print("Digite a quantidade: ");
        produto.quantidade = entrada.nextInt();

        if (produto.quantidade > 0) {
        	
        	System.out.println("Produto em estoque!");
        } else {
        	
        	System.out.println("Produto em falta!");
        }
        
		entrada.close();
	}

}
