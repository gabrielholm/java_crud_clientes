package controllers;

import java.util.List;
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
	
	public void atualizarCliente() {
		System.out.println("\n*** ATUALIZAÇÃO DE CLIENTES ***\n");

		Scanner scanner = new Scanner(System.in);

		Cliente cliente = new Cliente();

		System.out.print("ID do Cliente........: ");
		cliente.setIdCliente(Integer.parseInt(scanner.nextLine()));
		
		System.out.print("Nome do Cliente........: ");
		cliente.setNome(scanner.nextLine());

		System.out.print("Email..................: ");
		cliente.setEmail(scanner.nextLine());

		System.out.print("Telefone...............: ");
		cliente.setTelefone(scanner.nextLine());

		System.out.print("CPF....................: ");
		cliente.setCpf(scanner.nextLine());

		ClienteRepository clienteRepository = new ClienteRepository();
		try {
			clienteRepository.update(cliente);
			System.out.println("\nCliente atualizado com sucesso!");
		}
		
		catch (Exception e) {
			System.out.println("\nFalha ao atualizar cliente!");
			e.printStackTrace();
		}
		
	}
	
	public void excluirCliente() {
		
		System.out.println("\n*** EXCLUSÃO DE CLIENTES ***\n");

		Scanner scanner = new Scanner(System.in);

		Cliente cliente = new Cliente();

		System.out.print("ID do Cliente........: ");
		cliente.setIdCliente(Integer.parseInt(scanner.nextLine()));
		
		ClienteRepository clienteRepository = new ClienteRepository();
		
		try {
			clienteRepository.delete(cliente);
			System.out.println("\nCliente excluído com sucesso!");
		}
		catch(Exception e) {
			System.out.println("\nFalha ao excluir cliente!");
			e.printStackTrace();
		}
	}
	
	public void consultarClientes() {
		
		System.out.println("\\n*** CONSULTA DE CLIENTES ***\\n");
		
		ClienteRepository clienteRepository = new ClienteRepository();
		
		try {
			
			List<Cliente> lista = clienteRepository.findAll();
			for(Cliente cliente : lista) {
				
				System.out.println("ID do cliente......: " + cliente.getIdCliente());
				System.out.println("Nome...............: " + cliente.getNome());
				System.out.println("Email..............: " + cliente.getEmail());
				System.out.println("Telefone...........: " + cliente.getTelefone());
				System.out.println("CPF................: " + cliente.getCpf());
				System.out.println("...");
			}
			
		} catch(Exception e) {
			
			System.out.println("\nFalha ao consultar clientes!");
			e.printStackTrace();
			
		}
		
	}

}
