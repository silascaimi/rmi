package org.scaimi;

import java.rmi.RemoteException;

public class ContaBancariaImpl implements ContaBancaria {

	private double saldo;
	
	public void sacar(int valor) throws RemoteException {
		saldo = saldo - valor;
	}
	
	public void depositar(int valor) throws RemoteException {
		saldo = saldo + valor;
	}
	
	public void transferir(int valor, ContaBancaria contaDestino) throws RemoteException {
		sacar(valor);
		contaDestino.depositar(valor);
	}

	public double getSaldo() throws RemoteException {
		return saldo;
	}
}
