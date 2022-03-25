package org.scaimi;

import java.rmi.Naming;

public class Main {

	public static void main(String[] args) throws Exception {
		
		// Captura o Stub que representa o objeto ContaBancaria do servidor usando o endereço rmi
		// rmi://{SERVER_ADDRESS}:{PORTA}/{STUB_NAME}
		ContaBancaria conta = (ContaBancaria) Naming.lookup("rmi://localhost:1099/conta");

		conta.depositar(1000);
		
		System.out.println(conta.getSaldo());
	}

}
