package src.atv12;
import java.util.Scanner;
public class Produtoo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Produto produto1 = new Produto();
		produto1.setNome("Coca-Cola");
		produto1.setPreco(5.5);
		produto1.setQtd(40);
		produto1.exibirProduto();
		System.out.println("Deseja adicionar mais? \n 1 - Sim  \n 2 - Não");
		int decisaoQtd = leia.nextInt();
		if(decisaoQtd == 1) {
			produto1.atualizarQuantidade();
			produto1.exibirProduto();
		} 
		System.out.println("Deseja atualizar o preço? \n 1 - Sim  \n 2 - Não");
		int decisaoPreco = leia.nextInt();
		if(decisaoPreco == 1) {
			produto1.atualizarPreco();
			produto1.exibirProduto();
		} 
		
		
		
		Produto produto2 = new Produto("Fanta",3,78);
		produto2.exibirProduto();
		System.out.println("Deseja adicionar mais? \n 1 - Sim  \n 2 - Não");
		int decisaoQtdD = leia.nextInt();
		if(decisaoQtdD == 1) {
			produto2.atualizarQuantidade();
			produto2.exibirProduto();
		} 
		System.out.println("Deseja atualizar o preço? \n 1 - Sim  \n 2 - Não");
		int decisaoPrecoD = leia.nextInt();
		if(decisaoPreco == 1) {
			produto2.atualizarPreco();
			produto2.exibirProduto();
		} produto2.exibirProduto();
		
	}

}
