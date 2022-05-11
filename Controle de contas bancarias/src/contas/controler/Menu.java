package contas.controler;
import java.util.*;

import contas.entity.Information;
public class Menu {

	public static void main(String[] args) {
		Informationlist list = new Informationlist();
		Scanner sc = new Scanner(System.in);
		
		int condicao=3,id=0,dispensableId;
        String nome,cpf,tipoDeConta,agencia;
        double saldo;
		
		while(condicao!= 0) {
			System.out.println("Digite 1 para cadastrar o usuario 2  para mudar o saldo e 0 para sair  ");
			condicao = sc.nextInt();
			
			switch(condicao) {
			
				case 1:
					System.out.println("Digite o nome do usuario");
					nome = sc.next();
					System.out.println("Digite o CPF do usuario");
					cpf = sc.next();
					System.out.println("Digite a Agencia do usuario");
					agencia = sc.next();
					System.out.println("Digite tipo de conta do usuario");
					tipoDeConta = sc.next();
					System.out.println("Digite o saldo do usuario");
					saldo = sc.nextDouble();
					Information info = new Information(id, agencia, saldo, nome, cpf, tipoDeConta);
					id++;
					list.cadastrar(info);
					break;
					
				case 2:
					System.out.println("Digite o id do usuario que deseja mudar o saldo ");
					dispensableId= sc.nextInt();
					System.out.println("Digite o saldo novo");
					saldo = sc.nextDouble();
					list.atualizarSaldo(dispensableId, saldo);
					break;
					
			}
		}

	}

}
