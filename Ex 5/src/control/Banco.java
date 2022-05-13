package control;

import java.util.ArrayList;
import java.util.List;

import entity.Conta;

public class Banco {
	
	
	List<Conta> list  = new ArrayList();
	
	public void adicionaConta(Conta c) {
		list.add(c);
		
	}
	
	public void pegaConta(int x) {
	System.out.println(list.get(x));	
	}
	
	public void pegaQuantidade() {
		System.out.println(list.size());
	}
	
	

}
