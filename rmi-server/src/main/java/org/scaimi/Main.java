package org.scaimi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Main {

	public static void main(String[] args) throws Exception {

		// Fornece um objeto de ContaBancaria para quem quiser utilizar

		// Instancia o objeto que vai atender as requisições
		ContaBancaria conta = new ContaBancariaImpl();
		// Instancia o Sub que representa o objeto criado e vai para o cliente quando
		// requisitado
		ContaBancaria contaStub = (ContaBancaria) UnicastRemoteObject.exportObject(conta, 0);

		// Inicializa o registry na porta 1099
		Registry registry = LocateRegistry.createRegistry(1099);
		// Inser o Stub no registry atribuindo um nome
		registry.rebind("conta", contaStub);

		System.out.println("Aguardando requisições");
	}

}
