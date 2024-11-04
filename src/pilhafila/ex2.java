package pilhafila;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ex2 {

	public static void main(String[] args) {
		Stack<String> pilhaLivros = new Stack<String>();
		Scanner scanner = new Scanner(System.in);
		int opcao;
		boolean ativa = true;

		while (ativa) {
			pause(1000);
			System.out.println("""
					\n**********************************
					1 - Adicionar livro na pilha
					2 - Listar todos os livros
					3 - Retirar livro da pilha
					0 - Sair
					**********************************
					Entre com a opção desejada:
						       """);
			opcao = Integer.valueOf(scanner.nextLine());
			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do livro a ser adicionado na pilha: ");
				pilhaLivros.push(scanner.nextLine());
				pause(1000);
				System.out.println("Livro adicionado!");
				break;
			case 2:
				System.out.println("Listando todos os livros... ");
				pause(1000);
				Iterator<String> iterator = pilhaLivros.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				break;
			case 3:
				System.out.println("Tirando o livro do topo da pilha... ");
				pause(1000);
				if (pilhaLivros.isEmpty()) {
					System.out.println("Não há livros na pilha!");
				} else {
					pilhaLivros.pop();
					System.out.println("Um livro foi retirado da pilha!");
				}
				break;
			case 0:
				System.out.println("Desfazendo a pilha de livros... ");
				pause(1000);
				ativa = false;
				pilhaLivros.clear();
				System.out.println("Pilha desfeita.");
				break;
			}
		}
		scanner.close();

	}

	public static void pause(long milissegundos) {
		try {
			Thread.sleep(milissegundos);
		} catch (Exception e) {
			Thread.currentThread().interrupt();
		}
	}

}
