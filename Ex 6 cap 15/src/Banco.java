import java.util.ArrayList;
import java.util.List;

public class Banco {
	int i;
	
	List<Conta> list  = new ArrayList();
	
	public void adicionaConta(Conta c) {
		list.add(c);
		i++;
	}
	
	public void pegaConta(int x) {
	System.out.println(list.get(x));	
	}
	
	public void pegaQuantidade() {
		System.out.println(i);
	}
	public void delete(String name , int count) {
		int secondCounter=0;
		
			while(secondCounter!=count) {
				list.get(secondCounter).getName().equals(name);
				
				}

				
			
			
		}
	}
	


