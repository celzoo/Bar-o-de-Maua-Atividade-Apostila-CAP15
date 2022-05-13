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
	public void delete(String namee , int count) {
		
			int secondCounter=0;
			try {
				while(secondCounter<=count) {
					if(list.get(secondCounter).getName().equals(namee)) {
						list.remove(secondCounter);
					
					}

					
					secondCounter++;
				}
			
			}catch(ArrayIndexOutOfBoundsException exception) {
				System.out.println("Erro na contagem da lista");
				
			}
		}
		

				
			
			
		
	

}
