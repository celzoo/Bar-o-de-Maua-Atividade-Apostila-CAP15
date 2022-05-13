package view;
import control.Banco;
import entity.Conta;


public class Menu {

	public static void main(String[] args) {
		Banco banco = new Banco();
	Conta conta = new Conta(1000, "Celzo");
	
	banco.adicionaConta(conta);
	banco.pegaConta(0);
	banco.pegaQuantidade();
	banco.delete("Celzo", 0);
	banco.pegaQuantidade();
	
	
	
	

	}

}
