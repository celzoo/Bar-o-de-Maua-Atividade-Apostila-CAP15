package view;
import control.Banco;
import entity.Conta;


public class Menu {

	public static void main(String[] args) {
		Banco banco = new Banco();
	Conta conta = new Conta(1000);
	banco.adicionaConta(conta);
	banco.pegaConta(0);
	banco.pegaQuantidade();
	
	
	
	

	}

}
