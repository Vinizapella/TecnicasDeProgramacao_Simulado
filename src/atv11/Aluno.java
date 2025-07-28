package src.atv11;

import java.util.Scanner;
public class Aluno {

	private String nome;
	private int idade;
	private double nota;
	
	public Aluno() {
		this.nome = "";
		this.idade= 0;
		this.nota = 0.0;
		}public Aluno(String nome, int idade, double nota) {
		this.nome = nome;
		this.idade = idade;
		this.nota = nota;
	}
	
	public String getNome() {
		return(nome);
	}public int getIdade() {
		return(idade);
	}public double getNota() {
		return(nota);
	}public void setNome(String nome) {
		this.nome = nome;
	}public void setIdade(int idade) {
		this.idade = idade;
	}public void setNota(double nota) {
		this.nota = nota;
	}
	
	String separador = "----------";
	
	public void inserir() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o nome do aluno: ");
		this.nome = leia.next();
		System.out.println("Digite a idade do aluno: ");
		this.idade = leia.nextInt();
		System.out.println("Digite a nota que o aluno tirou: ");
		this.nota = leia.nextDouble();
	} 
	public void exibirDetalhes(String separador) {
		System.out.println(this.getNome());
		System.out.println(this.getIdade());
		System.out.println(this.getNota());
		}
	
	public void atualizarNota() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a nova nota : ");
		this.nota = leia.nextDouble();
	}
	
	public void exibirDetalhesAtualizado(String separador) {
		System.out.println(this.getNome());
		System.out.println(this.getIdade());
		System.out.println(this.getNota());
		}
	
	

}