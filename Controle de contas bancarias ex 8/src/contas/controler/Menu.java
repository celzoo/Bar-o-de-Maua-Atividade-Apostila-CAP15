package contas.controler;
import java.util.*;

import contas.entity.Information;
public class Menu {

	public static void main(String[] args) {
		HashSet<Information>contas	=	new	HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		int condicao=3,id=0,dispensableId;
        String nome,cpf,tipoDeConta,agencia;
        double saldo;
		
	
			
			
			
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
					contas.add(info);
					System.out.println("Total de contas " + contas.size());
					
					
				
					
			
		

	}

}
