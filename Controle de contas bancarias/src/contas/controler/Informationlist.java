package contas.controler;

import java.util.ArrayList;
import java.util.List;

import contas.entity.Information;
import contas.interfaces.Cadastro;

public class Informationlist implements Cadastro {
     
	
	List<Information> list = new ArrayList<Information>();

	@Override
	public void cadastrar(Information info) {
		
		list.add(info);
		
		
		
	}

	@Override
	public void  atualizarSaldo(int id , double saldo) {
		
		if(list.get(id).getId()==id) {
			list.get(id).setSaldo(saldo);
			System.out.println("Saldo atualizado");
		}
		
		else {
			System.out.println("Falha na operação");
		}
		
			
		}
		
		
	
	}
	

