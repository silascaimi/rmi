package org.scaimi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ContaBancaria extends Remote {

	public void sacar(int valor) throws RemoteException;

	public void depositar(int valor) throws RemoteException;

	public void transferir(int valor, ContaBancaria contaDestino) throws RemoteException;

	public double getSaldo() throws RemoteException;
}
