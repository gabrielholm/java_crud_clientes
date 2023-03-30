package principal;

import java.util.Scanner;

import controllers.ClienteController;

public class Program {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		do {
			System.out.println("(1) CADASTRAR CLIENTE");
			System.out.println("(2) ATUALIZAR CLIENTE");
			System.out.println("(3) EXCLUIR CLIENTE");
			System.out.println("(4) CONSULTAR CLIENTE");
			System.out.println("(0) SAIR");

			System.out.println("\nEntre com a opção desejada");
			opcao = scanner.nextInt();
			

			ClienteController clienteController = new ClienteController();

			switch (opcao) {
			case 1:
				clienteController.cadastrarCliente();
				break;
			case 2:
				clienteController.atualizarCliente();
				break;
			case 3:
				clienteController.excluirCliente();
				break;
			case 4:
				clienteController.consultarClientes();
				break;
			case 0:
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("\nOpção inválida.");
				break;

			}

		} while (opcao != 0);
		scanner.close();

	}
}
