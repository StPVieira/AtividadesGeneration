package pilhafila;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		Scanner scanner = new Scanner(System.in);
		int opcao;
		boolean ativa = true;

		while (ativa) {
			pause(1000);
			System.out.println("""
					\n**********************************
					1 - Adicionar Cliente na Fila
					2 - Listar todos os Clientes
					3 - Retirar Cliente da Fila
					0 - Sair
					**********************************
					Entre com a opção desejada:
						       """);
			opcao = Integer.valueOf(scanner.nextLine());
			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do cliente que deseja adicionar: ");
				fila.add(scanner.nextLine());
				pause(1000);
				System.out.println("Cliente adicionado!");
				break;
			case 2:
				System.out.println("Listando todos os clientes... ");
				pause(1000);
				Iterator<String> iterator = fila.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				break;
			case 3:
				System.out.println("Atendendo cliente... ");
				pause(1000);
				if (fila.isEmpty()) {
					System.out.println("Não existem mais clientes na fila!");
				} else {
					fila.poll();
				}
				break;
			case 0:
				System.out.println("Fechando a fila... ");
				pause(1000);
				ativa = false;
				fila.clear();
				System.out.println("Fila fechada.");
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
