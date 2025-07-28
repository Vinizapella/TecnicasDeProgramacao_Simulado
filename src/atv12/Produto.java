package src.atv12;
import java.util.Scanner;
public class Produto {

	private String nome;
	private double preco;
	private int qtd;
	
	public Produto() {
		this.nome = "";
		this.preco = 0.0;
		this.qtd = 0;
	}public Produto(String nome, double preco, int qtd){
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	public String getNome() {
		return(nome);
	}public double getPreco() {
		return(preco);
	}public int getQtd() {
		return(qtd);
	}public void setNome(String nome) {
		this.nome = nome;
	}public void setPreco(double preco) {
		this.preco = preco;
	}public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public void atualizarPreco() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o novo preço: ");
		this.preco = leia.nextDouble();
	}
	
	public void atualizarQuantidade() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a quantidade que deseja armazenar: ");
		int qtdA = leia.nextInt();
		qtd = qtd + qtdA;
	}
	
	public void exibirProduto() {
		System.out.println(this.getNome());
		System.out.println(this.getPreco());
		System.out.println(this.getQtd());
	}
	
}
