package src.atv11;
import java.util.Scanner;
public class Alunoo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Vinicius");
		aluno2.setIdade(17);
		aluno2.setNota(8);
		
		aluno2.exibirDetalhes("------------");
		System.out.println("Deseja modificar a nota? \n 1 - Sim  \n 2 - Não");
		int decisaoDois = leia.nextInt();
		if(decisaoDois ==1) {
			aluno2.atualizarNota();
			aluno2.exibirDetalhesAtualizado("------------");
		}
		
		Aluno aluno3 = new Aluno("Victoria",15,10);
		aluno3.exibirDetalhes("------------");
		System.out.println("deseja modificar a nota?  \n 1 - Sim  \n 2 - Não");
		int decisaoTres = leia.nextInt();
		if(decisaoTres ==1) {
			aluno3.atualizarNota();
			aluno3.exibirDetalhesAtualizado("------------");
		}
		
		Aluno aluno1 = new Aluno();
		
		aluno1.inserir();
		aluno1.exibirDetalhes("------------");
		System.out.println("Deseja modificar a nota? \n 1 - Sim  \n 2 - Não");
		int decisao = leia.nextInt();
		if(decisao ==1) {
			aluno1.atualizarNota();
			aluno1.exibirDetalhesAtualizado("------------");
		}
		
	}

}
