package controllers;

import java.util.Scanner;

import entities.Cliente;
import repositories.ClienteRepository;

public class ClienteController {

	public void cadastrarCliente() {
		System.out.println("\n*** CADASTRO DE CLIENTES ***\n");

		Scanner scanner = new Scanner(System.in);

		Cliente cliente = new Cliente();

		System.out.print("Nome do CLiente........: ");
		cliente.setNome(scanner.nextLine());

		System.out.print("Email..................: ");
		cliente.setEmail(scanner.nextLine());

		System.out.print("Telefone...............: ");
		cliente.setTelefone(scanner.nextLine());

		System.out.print("CPF....................: ");
		cliente.setCpf(scanner.nextLine());

		ClienteRepository clienteRepository = new ClienteRepository();
		try {
			clienteRepository.create(cliente);
			System.out.println("\nCliente Cadastrado com Sucesso!");

		} catch (Exception e) {
			System.out.println("\nFalha ao Cadastra Cliente!");
			e.printStackTrace(); // imprimir log do erro
		}

	}

}
